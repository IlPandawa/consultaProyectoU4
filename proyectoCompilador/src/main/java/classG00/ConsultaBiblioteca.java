package classG00; 

import com.hp.hpl.jena.query.Query; 
import com.hp.hpl.jena.query.QueryExecution; 
import com.hp.hpl.jena.query.QueryExecutionFactory; 
import com.hp.hpl.jena.query.QueryFactory; 
import com.hp.hpl.jena.query.ResultSet; 
import com.hp.hpl.jena.query.ResultSetFormatter; 
import com.hp.hpl.jena.rdf.model.Model; 
import com.hp.hpl.jena.rdf.model.ModelFactory; 
import com.hp.hpl.jena.util.FileManager; 
public class ConsultaBiblioteca {
    private static final String MY_RDF_FILE = "biblioteca.rdf";

    public static void main(String[] args) {
        Model grafo = ModelFactory.createDefaultModel();
        FileManager.get().readModel(grafo, MY_RDF_FILE);

        String queryString = "base <http://www.proyecto.com/biblioteca#>" +
            "PREFIX biblioteca: <http://www.proyecto.com/biblioteca#> " +
            "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
            "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
            "SELECT * " +
            "WHERE { " +
            "?var1 biblioteca:nombreLibro 'El Codigo Da Vinci' . " +
            "?var1 biblioteca:precioLibro ?var2 . " +
            "?var1 biblioteca:autor ?var3 . " +
            "} ";

        Query consulta = QueryFactory.create(queryString);
        QueryExecution consultaEj = QueryExecutionFactory.create(consulta, grafo);
        ResultSet resultados = consultaEj.execSelect();
        ResultSetFormatter.out(System.out, resultados);
        consultaEj.close();
    }
}
