## API

You can test out the API's by using a third-party tool called [Postman](https://www.postman.com/), this is a free app that you can download and you can view all the endpoints on the left and the API data on the right.

In order to download the End Points for the application you can find this file located here:

`documents/Spring Boot MongoDB.postman_collection`

### URL's

The app defines following CRUD APIs. 

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