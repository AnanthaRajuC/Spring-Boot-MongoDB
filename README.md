# Spring Boot - MongoDB

## Purpose

Learning the cross-platform document-oriented database program MongoDB with the Java-based framework Spring Boot.

## Technology stack & other Open-source libraries

### Data

* 	[MongoDB](https://www.mongodb.com/) - MongoDB is a general purpose, document-based, distributed database.

### Server - Backend

* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[Maven](https://maven.apache.org/) - Dependency Management

###  Libraries and Plugins

* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

### Others 

* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system

### External Tools & Services

* 	[Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)
* 	[gitignore.io](https://www.toptal.com/developers/gitignore/api/java,eclipse,intellij) - Create useful .gitignore files for your project.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

*	You need to have **MongoDB** installed on your machine to run the application.

## URL's

|                          URL                        | Method |    Remarks             | Sample Valid Request Body |
|-----------------------------------------------------|--------|------------------------|---------------------------|
|`http://localhost:8080/api/v1/student`               | POST   | Create student         | [JSON](#create)           |
|`http://localhost:8080/api/v1/student`               | GET    | Get all students       |                           |
|`http://localhost:8080/api/v1/student/{id}`          | GET    | Get student by id      |                           |
|`http://localhost:8080/api/v1/student/{id}`          | DELETE | Delete student by name |                           |
|`http://localhost:8080/api/v1/student/{id}`          | PUT    | Update student by id   | [JSON](#update)           |
|`http://localhost:8080/api/v1/student/name/{name}`   | POST   | Get student by name    |                           |


#### Sample Valid JSON Request Bodys

##### <a id="create">Create -> /api/v1/student</a>
```json
{
    "name": "John Doe",
    "email": "example@domain.com",
    "department": {
        "departmentName": "computer science",
        "location": "Dystopia"
    },
    "subjects": [
        {
            "subjectName": "Java",
            "marksObtained": 80
        },
        {
            "subjectName": "Chemistry",
            "marksObtained": 90
        }
    ],
    "demographics": {
        "country": "usa",
        "age": 50
    },
    "hobbies": [
        {
            "hobbyName": "music",
            "interestLevel": 4
        },
        {
            "hobbyName": "sports",
            "interestLevel": 3
        }
    ]
}
```

##### <a id="update">Update -> /api/v1/student/{id}</a>
```json
{
    "name": "John Doe",
    "email": "example@domain.com",
    "department": {
        "departmentName": "computer science",
        "location": "Dystopia"
    },
    "subjects": [
        {
            "subjectName": "Java",
            "marksObtained": 80
        },
        {
            "subjectName": "Chemistry",
            "marksObtained": 90
        }
    ],
    "demographics": {
        "country": "usa",
        "age": 50
    },
    "hobbies": [
        {
            "hobbyName": "music",
            "interestLevel": 4
        },
        {
            "hobbyName": "sports",
            "interestLevel": 3
        }
    ]
}
```

## Documentation

* 	Postman Collection - with code auto-generated snippets in cURL, jQuery, Ruby,Python Requests, Node, PHP and Go programming languages