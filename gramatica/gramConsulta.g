grammar gramConsulta;

options {
	language = Java;
}

@header {
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    HashMap<String, String> variables = new HashMap<String, String>();
    ArrayList<String> tripletas = new ArrayList<String>();
    
    private String generateJavaCode() {
        StringBuilder code = new StringBuilder();
        
        // Imports
        code.append("package classG00; \n\n");
        code.append("import com.hp.hpl.jena.query.Query; \n");
        code.append("import com.hp.hpl.jena.query.QueryExecution; \n");
        code.append("import com.hp.hpl.jena.query.QueryExecutionFactory; \n");
        code.append("import com.hp.hpl.jena.query.QueryFactory; \n");
        code.append("import com.hp.hpl.jena.query.ResultSet; \n");
        code.append("import com.hp.hpl.jena.query.ResultSetFormatter; \n");
        code.append("import com.hp.hpl.jena.rdf.model.Model; \n");
        code.append("import com.hp.hpl.jena.rdf.model.ModelFactory; \n");
        code.append("import com.hp.hpl.jena.util.FileManager; \n");
        
        code.append("public class ConsultaBiblioteca {\n");
        code.append("    private static final String MY_RDF_FILE = \"biblioteca.rdf\";\n\n");
        code.append("    public static void main(String[] args) {\n");
        code.append("        Model grafo = ModelFactory.createDefaultModel();\n");
        code.append("        FileManager.get().readModel(grafo, MY_RDF_FILE);\n\n");
        
        // consulta tripletas
        code.append("        String queryString = \"base <http://www.proyecto.com/biblioteca#>\" +\n");
        code.append("            \"PREFIX biblioteca: <http://www.proyecto.com/biblioteca#> \" +\n");
        code.append("            \"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \" +\n");
        code.append("            \"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> \" +\n");
        code.append("            \"SELECT * \" +\n");
        code.append("            \"WHERE { \" +\n");
        
        // agrega la consulta
        for(int i = 0; i < tripletas.size(); i++) {
            code.append("            \"" + tripletas.get(i) + " \" +\n");
        }
        code.append("            \"} \";\n\n");

        code.append("        Query consulta = QueryFactory.create(queryString);\n");
        code.append("        QueryExecution consultaEj = QueryExecutionFactory.create(consulta, grafo);\n");
        code.append("        ResultSet resultados = consultaEj.execSelect();\n");
        code.append("        ResultSetFormatter.out(System.out, resultados);\n");
        code.append("        consultaEj.close();\n");
        code.append("    }\n");
        code.append("}\n");
        
        //regresa el codigo java generado
        return code.toString();
    }
}

inicio: (tripleta)+ EOF {
            System.out.println(generateJavaCode());
        };


tripleta:
	var1 = ID pred = predicado (var2 = ID | lit = LITERAL) {
            String sujeto = variables.containsKey($var1.text) ? 
                           variables.get($var1.text) : 
                           "?" + $var1.text;
            
            String objeto = $var2 != null ? 
                          (variables.containsKey($var2.text) ? 
                           variables.get($var2.text) : 
                           "?" + $var2.text) :
                          $lit.text;
                          
            tripletas.add(sujeto + " biblioteca:" + $pred.text + " " + objeto + " .");
            
            if($var2 != null) {
                variables.put($var2.text, "?" + $var2.text);
            }
            variables.put($var1.text, "?" + $var1.text);
        };


predicado:
	'codigoLibro''nombreLibro'| 'editorial'| 'autor'| 'genero'| 'paisAutor'| 'numeroPaginas'| 'anioEdicion'| 'precioLibro' {/* LIBRO */}
	| 'nombre'| 'apellidos'| 'noIdentificacion'| 'domicilio'| 'estado'| 'municipio'| 'fechaNacimiento' {/* USUARIO */}
	| 'codigoUsuario'| 'numeroPedido'| 'fechaSalida'| 'fechaMaxima'| 'fechaDevolucion' {/* PRESTAMO */};

ID: ('a' ..'z' | 'A' ..'Z') ('a' ..'z'| 'A' ..'Z'| '0' ..'9')*;
LITERAL: '\'' (~'\'')* '\'';
WS: ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};