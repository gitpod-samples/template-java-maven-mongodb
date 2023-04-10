# A Java project with Mavel and MongoDB starter template on Gitpod

This is a [Maven](https://maven.apache.org/guides) template to build a Java project with Maven configured for ephemeral cloud development environments on [Gitpod](https://www.gitpod.io/).

## Next Steps

Click the button below to start a new development environment:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/shashankpatil125/Template-Java-Maven-mongodb.git)

The [`.gitpod.yml`](./.gitpod.yml) file, which configures the environment, is automatically followed after hitting the Gitpod button. The following processes happen automatically:

1. The Java project is constructed using the Maven build tool.
2. A network is created for the containers to communicate with each other.
3. MongoDB and MongoDB Express Docker images are pulled.
     Used Docker Images:
     1. [Mongo](https://hub.docker.com/_/mongo): It is the actual database which is running on Port number: **27017** 
     2. [Mongo-express](https://hub.docker.com/_/mongo-express) :It helps to interact database GUI through web browser. It is running on port number: **8081** 
4. Containers are created for both images on specific ports to enable users to interact with the data.
5. Once all these tasks are completed, then you can perform all data operations using the Java program.

Overall, this automated process ensures that the environment is properly configured for the Java project, including necessary tools and dependencies, network setup, and database setup. This allows developers to quickly start working on their project without worrying about manual setup or configuration.
