package org.example;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.internal.MongoClientImpl;
import com.mongodb.connection.ClusterDescription;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String connectionString = "mongodb://localhost:27017";

        try {
            // Create MongoDB client
            MongoClient mongoClient = MongoClients.create(connectionString);

            // Get database
            // ...
            System.out.println("A connection was successfully established with the Database ");
            System.out.println("username = admin, password = password");
            // Close the client
            mongoClient.close();

        } catch (MongoException e) {
            // Display custom error message for MongoDB connection error
            System.out.println("Failed to connect to MongoDB. Please check your connection settings.");
            // Log the exception
            e.printStackTrace();
        }






    }
}