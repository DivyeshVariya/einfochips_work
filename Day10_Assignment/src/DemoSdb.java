import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DemoSdb {
	public static void main(String[] args) {
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = mongoClient.getDatabase("demo");
		MongoCollection<Document> collection = database.getCollection("temp");
	   Document document = new Document();
	   document.append("name", "Ram");
	   document.append("age", 26);
	   document.append("city", "Hyderabad");
	  //Inserting the document into the collection
	  	database.getCollection("temp").insertOne(document);
	  	System.out.println("Document inserted successfully");
		MongoCursor<Document> cursor = collection.find().iterator();
		while (cursor.hasNext()) 
		{
			System.out.println(cursor.next());
		}
		collection.find(Filters.eq("name","Divyesh"));
		mongoClient.close();
	}
}
