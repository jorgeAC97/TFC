package Utilidades;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class GestorConexion {

    static String URI="mongodb+srv://cristofertorresct:Cris087.@cluster0.f2pdq.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

    public GestorConexion() {

    }


    public static MongoDatabase conectarBD(){
        MongoClientURI clientURI=new MongoClientURI(URI);
        MongoClient mongoClient=new MongoClient(clientURI);
        MongoDatabase mongoDatabase=mongoClient.getDatabase("Tienda");

        return mongoDatabase;
    }


}
