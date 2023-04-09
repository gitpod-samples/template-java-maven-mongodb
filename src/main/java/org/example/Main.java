package org.example;

import com.mongodb.*;
import com.mongodb.client.*;

public class Main {
    public static void main(String[] args) {

        String connectionString = "mongodb://localhost:27017";

        try {
            // Create MongoDB client
            MongoClient mongoClient = MongoClients.create(connectionString);

            // Get database
            System.out.println("\u001B[32m A connection was successfully established with the Database \u001B[0m");
            System.out.println("\u001B[32m username = admin, password = password \u001B[0m");
            System.out.println("\u001B[32m For compilition command is: 'mvn compile' \u001B[0m");
            System.out.println("\u001B[32m For executing a Java class: 'mvn exec:java -Dexec.mainClass=\"org.example.Main\"'\u001B[0m");
            // Close the client
            // mongoClient.close();

        } catch (MongoException e) {
            // Display custom error message for MongoDB connection error
            System.out.println("Failed to connect to MongoDB. Please check your connection settings.");
            // Log the exception
            e.printStackTrace();
        }
    }
}