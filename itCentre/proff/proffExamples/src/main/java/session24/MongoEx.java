package session24;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.*;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 24.05.15
 */
public class MongoEx {
    public static void main(String[] args) {
//        insert();
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        System.out.println(mongo.listDatabases());
        MongoDatabase database = mongo.getDatabase("local");
        System.out.println(database);
        MongoCollection<Document> collection = database.getCollection("students");
        System.out.println(collection.count());
        Document firstDoc = collection.find().first();
        System.out.println(firstDoc.toJson());
        FindIterable<Document> docs = collection.find(gte("_id", "0"));
        docs.forEach((Consumer<Document>) doc -> System.out.println(doc.toJson()));
        mongo.close();
    }

    public static void insert() {
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        MongoDatabase database = mongo.getDatabase("local");
        Document doc = new Document("name", "ewa").append("age", "11");
        MongoCollection<Document> collection = database.getCollection("students");
        collection.insertOne(doc);
        mongo.close();

    }
}
