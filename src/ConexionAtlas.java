
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *"mongodb+srv://GermanOrozco:german10@cluster0.mmhq3.mongodb.net/Ejemplo1?retryWrites=true&w=majority"
 * @author Pedro Orozco
 */
public class ConexionAtlas extends MongoClient {
    public ConexionAtlas(MongoClientURI direccionConexion){
    super (direccionConexion);
    }
}
