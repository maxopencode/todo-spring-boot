# Getting Started

The Todo application was developed using the following technologies: 
    
* Spring Boot (https://spring.io/projects/spring-boot) 
* Spring Framework (https://spring.io/projects/spring-framework)
* SpringFox (https://springfox.github.io/springfox/)
* Liquibase (https://www.liquibase.org/)
* Gradle (https://gradle.org/)

## Prerequisites

* ### Java 11 or higher

    JDK installer can be downloaded from https://www.oracle.com/java/technologies/javase-jdk13-downloads.html

* ### MySQL database

    MySQL installer can be downloaded from https://dev.mysql.com/downloads/mysql/

    On Mac MySQL can also be installed using Homebrew:
    ```bash
        brew install mysql
        brew services start mysql
    ```

* ### Configure MySQL database

Before running or testing the application we need to configure our database.
* Please run commands from the terminal in `create-db.txt` to create application database and user.

> Note: I use MySQL default port when connecting to the database. 
> You can change connection settings for the application in `src/main/resources/application.properties`.

## Running the application

I use Gradle for building, testing and running the application.

* To start the Spring Boot server run the following from the project folder:
    ```bash
        ./gradlew bootRun
    ```
### Testing REST API endpoints 

Once server starts you should be able to access Swagger UI in your browser from http://localhost:9000/api/swagger-ui/
From there you have options to test all the available API methods.
