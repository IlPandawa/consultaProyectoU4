grammar aSintactico_V4;
// esta gramática incluye los puntos donde se debe incorporar identificadores a la tabla de símbolos
// global a los puntos mencionados se les agrega el código para construir y llenar la TSGlobal Se
// agregó el código para meter argumentos de los métodos a la tabla de símbolos loca TSL. Faltaa
// procesar declaración de variables locales a los métodos a TSL Falta purgar la tabla de símbolos
// local al terminar cada método v3 agrega comentario para validar tipos
@header { //  -------------- importaciones 
        import java.util.HashMap;       
}

@members {
    HashMap<String, Integer> TSG = new HashMap<>();
    HashMap<String, Integer> TSL = new HashMap<>();

    public void toTSG(String id, String tipo) {
        Integer se_encuentra = TSG.get(id);
        if (se_encuentra == null) {
            if (tipo.equals("int")) {
                TSG.put(id, 1);
            } else if (tipo.equals("double")) {
                TSG.put(id, 2);
            } else if (tipo.equals("class")) {
                TSG.put(id, 3);
            }
        } else {
            System.err.println("Error redeclarando: " + id);
        }
    }

    public void toTSL(String id, String tipo) {
        Integer se_encuentra = TSL.get(id);
        if (se_encuentra == null) {
            if (tipo.equals("int")) {
                TSL.put(id, 1);
            } else if (tipo.equals("double")) {
                TSL.put(id, 2);
            }
        } else {
            System.err.println("Error redeclarando: " + id);
        }
    }

       /*TAREA: HACER UNA FUNCIÓN QUE BUSQUE UN ID EN LAS TABLAS DE SIMBOLOS*/
       /*PRIMERO BUSCARLO EN TSL SI NO ESTA BUCAR EN TSG*/
       /*SI NUNCA ESTUVO REGRESAR 0*/
    public int buscarID(String id){
        Integer se_encuentra = TSL.get(id);
        if (se_encuentra == null) {
            se_encuentra = TSG.get(id);
            if (se_encuentra == null) {
                return 0;
            } else {
                return se_encuentra.intValue();
            }
        } else {
            return se_encuentra.intValue();
        }
    }

// método estandar, a partir de ahora los msgs de error del compilador 
// pasan por aquí
// similar a una sobrecarga de método
  public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        System.out.println(">>MyCompiler>>  " + hdr + " " + msg);
    }

// método nuestro para pintar un error
  public void error(String msg){
             System.out.println("ERROR: "+msg);
    }

//método para verificar que dos datos de tipo sean homogéneos

  public int check(int tipo1, int tipo2, String expr1, String expr2){
      if(tipo1==tipo2) return tipo1;
      else{  
        error(" de tipos en ("+expr1+ " op " + expr2 +")" );
        return 0;
      }
  }

  
        /* MÉTODO PARA PURGAR LA TSL*/
    public void purgarTSL() {
        TSL.clear();
    }
}

start: class_def+;

class_def: (access_mod)? CLASS ID {
  /*a TSGlobal*/
  toTSG($ID.text,"class");  
} OP_CUR_BR (member)* CL_CUR_BR;

member: attribute | method;

// public int x ,y ,z ,w ;
attribute: (access_mod)? type t1 = ID {
  /*a TSGlobal*/
  toTSG($t1.text,$type.text);
} (
		COMMA t2 = ID {
      /*a TSGlobal*/
      toTSG($t2.text,$type.text);
    }
	)* SEMICOLON;

// public int metodo(int x ,int y ,double f){}  
method: (access_mod)? type ID {/*a TSGlobal*/
  toTSG($ID.text,$type.text);
} OP_PARENT args_decl? CL_PARENT OP_CUR_BR sentence* CL_CUR_BR {
    /*purgar la TSL*/
  purgarTSL();
};

sentence: local_decl | assign;

assign:
	ID EQ expr SEMICOLON { 
  /*sacar el tipo del ID de las tablas de symb*/
  /*ver que ID y expr sean del mismo tipo sino*/ 
  /*marcar error*/
  int tipoID = buscarID($ID.text);
        if (tipoID == 0) {
            error("Variable " + $ID.text + " no declarada");
        } else {
            // Comparar los tipos del ID y la expresión
            if (tipoID != $expr.type) {
                error("Error de tipos: " + $ID.text + " es de tipo diferente a la expresión.");
            }
        }
};

// expr: multExpr (( '+'|'-') multExpr)* ;
expr
	returns[int type]:
	m1 = multExpr {/*regresar tipo*/
  $type=$m1.type;  
} (
		('+' | '-') m2 = multExpr {
    /*ver que m1 y m2 sean del mismo tipo sino marcar error*/
    /* y regresar error*/
    $type=check($m1.type,$m2.type,$m1.text,$m2.text);
  }
	)*;

// multExpr : atom ('*' atom )* ;
multExpr
	returns[int type]:
	a1 = atom {
  /*regresar el tipo*/
  $type = $a1.type;
} (
		'*' a2 = atom {
      /*ver que a1 y a2 sean del mismo tipo sino marcar error*/
      /* y regresar error*/
      $type=check($a1.type,$a2.type,$a1.text,$a2.text);
    }
	)*;

atom
	returns[int type]:
	ID {
        // Buscar en la tabla de símbolos local primero, luego en la global.
        Integer se_encuentra = TSL.get($ID.text);
        if (se_encuentra == null) {
            se_encuentra = TSG.get($ID.text);
            if (se_encuentra == null) {
                error("Variable " + $ID.text + " no declarada");
                $type = 0;
            } else {
                $type = se_encuentra.intValue();  // Si está en la tabla global, regresar su tipo
            }
        } else {
            $type = se_encuentra.intValue();  // Si está en la tabla local, regresar su tipo
        }
    }
	| CINT {
        $type = 1;  // Tipo int
    }
	| CDOUBLE {
        $type = 2;  // Tipo double
    }
	| OP_PARENT expr {
        $type = $expr.type;  // Regresar el tipo de la expresión
    } CL_PARENT;

//int x,y,z;
local_decl:
	type i1 = ID {
    /*Hay que agregar a TSL las variables locales*/
    toTSL($i1.text,$type.text);
  } (
		COMMA i2 = ID {
      /*Hay que agregar a TSL las variables locales*/
        toTSL($i2.text,$type.text);
		}
	)* SEMICOLON;

args_decl:
	t1 = type i1 = ID {
    toTSL($i1.text,$t1.text);
  } (
		COMMA t2 = type i2 = ID {
      toTSL($i2.text,$t2.text);  
    }
	)*;
access_mod: PRIVATE | PROTECTED | PUBLIC;
type: INT | DOUBLE;

OP_PARENT: '(';
CL_PARENT: ')';
EQ: '=';
OP_CUR_BR: '{';
CL_CUR_BR: '}';
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';
CLASS: 'class';
COMMA: ',';
SEMICOLON: ';';
INT: 'int';
DOUBLE: 'double';

CDOUBLE: CINT '.' CINT;
CINT: ('0' ..'9')+;

ID: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '_'
		| '0' ..'9'
	)*;

WS: (' ' | '\n' | '\t' | '\r')+ { $channel=HIDDEN; };