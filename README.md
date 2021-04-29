# Spring Boot - MongoDB

Learning the cross-platform document-oriented database program MongoDB with the Java-based framework Spring Boot.

|     Service     | Badge | Badge | Badge | Badge | Badge |
|-----------------|-------|-------|-------|-------|-------|
|  **GitHub**     |[![GitHub last commit](https://img.shields.io/github/last-commit/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/commits/master)|[![GitHub pull requests](https://img.shields.io/github/issues-pr-raw/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/pulls)|[![GitHub issues](https://img.shields.io/github/issues/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/issues)|[![GitHub forks](https://img.shields.io/github/forks/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/network)|[![GitHub stars](https://img.shields.io/github/stars/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/stargazers)|
|  **GitHub**     |![GitHub repo size](https://img.shields.io/github/repo-size/AnanthaRajuC/Spring-Boot-MongoDB)|![GitHub top language](https://img.shields.io/github/languages/top/AnanthaRajuC/Spring-Boot-MongoDB.svg)|![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/AnanthaRajuC/Spring-Boot-MongoDB)|![GitHub tag (latest SemVer)](https://img.shields.io/github/tag/AnanthaRajuC/Spring-Boot-MongoDB.svg)|![GitHub language count](https://img.shields.io/github/languages/count/AnanthaRajuC/Spring-Boot-MongoDB)|

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

## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAnanthaRajuC%2FSpring-Boot-MongoDB.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FAnanthaRajuC%2FSpring-Boot-MongoDB?ref=badge_large)