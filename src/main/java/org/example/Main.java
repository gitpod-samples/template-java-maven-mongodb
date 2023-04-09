package org.example;

import com.mongodb.*;
import com.mongodb.client.*;
//import com.mongodb.connection.netty.NettyStreamFactoryFactory;
import com.mongodb.connection.netty.NettyStreamFactoryFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger.getLogger("org.mongodb.driver").setLevel(Level.WARNING);

        String connectionString = "mongodb://localhost:27017";

        try {
            // Configure the stream factory to use Netty
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(connectionString))
                    .streamFactoryFactory(NettyStreamFactoryFactory.builder().build())
                    .build();

            // Create MongoDB client
            MongoClient mongoClient = MongoClients.create(settings);

            // Get database
            System.out.println("\u001B[32m A connection was successfully established with the Database \u001B[0m");
            System.out.println("\u001B[32m username = admin, password = password \u001B[0m");
            System.out.println("\u001B[32m For compilation command is: 'mvn compile' \u001B[0m");
            System.out.println("\u001B[32m For executing a Java class: 'mvn exec:java -Dexec.mainClass=\"org.example.Main\"'\u001B[0m");

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