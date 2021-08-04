<!--
*** Thanks for checking out Spring Boot Application Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again!
-->
# Spring Boot - MongoDB

[![GitHub issues](https://img.shields.io/github/issues/Spring-Boot-Framework/Spring-Boot-MongoDB)](https://github.com/Spring-Boot-Framework/Spring-Boot-MongoDB/issues)
[![GitHub forks](https://img.shields.io/github/forks/Spring-Boot-Framework/Spring-Boot-MongoDB)](https://github.com/Spring-Boot-Framework/Spring-Boot-MongoDB/network)
[![GitHub license](https://img.shields.io/github/license/Spring-Boot-Framework/Spring-Boot-MongoDB)](https://github.com/Spring-Boot-Framework/Spring-Boot-MongoDB/blob/main/LICENSE.md)
[![GitHub stars](https://img.shields.io/github/stars/Spring-Boot-Framework/Spring-Boot-MongoDB)](https://github.com/Spring-Boot-Framework/Spring-Boot-MongoDB/stargazers)

## Purpose

Learning the cross-platform document-oriented database program **MongoDB** with the Java-based framework **Spring Boot**.

## Technology stack & other Open-source libraries

### Data

* 	[MongoDB](https://www.mongodb.com/) - MongoDB is a general purpose, document-based, distributed database.
*	A MongoDB Client - Example: [Robomongo](https://robomongo.org/)

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

Learning the cross-platform document-oriented database program MongoDB with the Java-based framework Spring Boot.

<div align="center">

[![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen?logo=github)](CODE_OF_CONDUCT.md) [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=Checkout+this+recipe+for+bootstrapping+a+%40springboot+based+monolithic+web+application&url=https://github.com/AnanthaRajuC/Spring-Boot-MongoDB&hashtags=SpringBoot) [![Twitter Follow](https://img.shields.io/twitter/follow/anantharajuc?label=follow%20me&style=social)](https://twitter.com/anantharajuc)
</div>

<div align="center">
  <sub>Built with ❤︎ by <a href="https://twitter.com/anantharajuc">Anantha Raju C</a> and <a href="https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/graphs/contributors">contributors</a>
</div>

</br>

<p align="center">
	<a href="https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/blob/main/README.md#spring-boot---mongodb"><strong>Explore the docs »</strong></a>
	<br />
	<br />
	<a href="https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/issues">Report Bug</a>
	·
	<a href="https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/issues">Request Feature</a>
</p>

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
-->

|     Service     | Badge | Badge | Badge | Badge | Badge |
|-----------------|-------|-------|-------|-------|-------|
|  **GitHub**     |[![GitHub last commit](https://img.shields.io/github/last-commit/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/commits/master)|[![GitHub pull requests](https://img.shields.io/github/issues-pr-raw/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/pulls)|[![GitHub issues](https://img.shields.io/github/issues/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/issues)|[![GitHub forks](https://img.shields.io/github/forks/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/network)|[![GitHub stars](https://img.shields.io/github/stars/AnanthaRajuC/Spring-Boot-MongoDB)](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/stargazers)|
|  **GitHub**     |![GitHub repo size](https://img.shields.io/github/repo-size/AnanthaRajuC/Spring-Boot-MongoDB)|![GitHub top language](https://img.shields.io/github/languages/top/AnanthaRajuC/Spring-Boot-MongoDB.svg)|![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/AnanthaRajuC/Spring-Boot-MongoDB)|![GitHub tag (latest SemVer)](https://img.shields.io/github/tag/AnanthaRajuC/Spring-Boot-MongoDB.svg)|![GitHub language count](https://img.shields.io/github/languages/count/AnanthaRajuC/Spring-Boot-MongoDB)|
|    **lgtm**     |[![lgtm-languages](https://badgen.net/lgtm/langs/g/AnanthaRajuC/Spring-Boot-MongoDB)](https://lgtm.com/projects/g/AnanthaRajuC/Spring-Boot-MongoDB?mode=list)|[![lgtm-alerts](https://badgen.net/lgtm/alerts/g/AnanthaRajuC/Spring-Boot-MongoDB)](https://lgtm.com/projects/g/AnanthaRajuC/Spring-Boot-MongoDB?mode=list)|[![lgtm-lines](https://badgen.net/lgtm/lines/g/AnanthaRajuC/Spring-Boot-MongoDB)](https://lgtm.com/projects/g/AnanthaRajuC/Spring-Boot-MongoDB?mode=list)|[![lgtm-lines-java](https://badgen.net/lgtm/lines/g/AnanthaRajuC/Spring-Boot-MongoDB/java)](https://lgtm.com/projects/g/AnanthaRajuC/Spring-Boot-MongoDB?mode=list)|[![lgtm-grade](https://badgen.net/lgtm/grade/g/AnanthaRajuC/Spring-Boot-MongoDB)](https://lgtm.com/projects/g/AnanthaRajuC/Spring-Boot-MongoDB?mode=list)|

## Details

- [Technology stack & other Open-source libraries](documents/TECHNOLOGY_STACK.MD)  
- [Getting Started](documents/GETTING_STARTED.MD)  
- [Installation](documents/INSTALLATION.MD)  
- [Documentation](documents/DOCUMENTATION.MD) 
- [API](documents/API.md)  

## Reporting Issues/Suggest Improvements

This Project uses GitHub's integrated issue tracking system to record bugs and feature requests. If you want to raise an issue, please follow the recommendations below:

* 	Before you log a bug, please [search the issue tracker](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/search?type=Issues) to see if someone has already reported the problem.
* 	If the issue doesn't already exist, [create a new issue](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB/issues/new)
* 	Please provide as much information as possible with the issue report.
* 	If you need to paste code, or include a stack trace use Markdown +++```+++ escapes before and after your text.

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

Kindly refer to [CONTRIBUTING.md](/CONTRIBUTING.md) for important **Pull Request Process** details

1. In the top-right corner of this page, click **Fork**.

2. Clone a copy of your fork on your local, replacing *YOUR-USERNAME* with your Github username.

   `git clone https://github.com/YOUR-USERNAME/Spring-Boot-MongoDB.git`

3. **Create a branch**: 

   `git checkout -b <my-new-feature-or-fix>`

4. **Make necessary changes and commit those changes**:

   `git add .`

   `git commit -m "new feature or fix"`

5. **Push changes**, replacing `<add-your-branch-name>` with the name of the branch you created earlier at step #3. :

   `git push origin <add-your-branch-name>`

6. Submit your changes for review. Go to your repository on GitHub, you'll see a **Compare & pull request** button. Click on that button. Now submit the pull request.

That's it! Soon I'll be merging your changes into the master branch of this project. You will get a notification email once the changes have been merged. Thank you for your contribution.

Kindly follow [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) to create an explicit commit history. Kindly prefix the commit message with one of the following type's.

**build**   : Changes that affect the build system or external dependencies (example scopes: gulp, broccoli, npm)  
**ci**      : Changes to our CI configuration files and scripts (example scopes: Travis, Circle, BrowserStack, SauceLabs)  
**docs**    : Documentation only changes  
**feat**    : A new feature  
**fix**     : A bug fix  
**perf**    : A code change that improves performance  
**refactor**: A code change that neither fixes a bug nor adds a feature  
**style**   : Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)  
**test**    : Adding missing tests or correcting existing tests  

## License

Distributed under the MIT License. See [LICENSE.md](/LICENSE.md) for more information.

## FOSSA third-party code, license compliance and vulnerabilities

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FAnanthaRajuC%2FSpring-Boot-MongoDB.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FAnanthaRajuC%2FSpring-Boot-MongoDB?ref=badge_large)

## The End

In the end, I hope you enjoyed the application and find it useful, as I did when I was developing it. 

If you would like to enhance, please: 

* 	**Open PRs**, 
* 	Give **feedback**, 
* 	Add **new suggestions**, and
*	Finally, give it a 🌟.

* Happy Coding ...* 🙂

<!-- CONTACT -->
## Contact

Anantha Raju C - [@anantharajuc](https://twitter.com/anantharajuc) - arcswdev@gmail.com

Project Link: [https://github.com/AnanthaRajuC/Spring-Boot-MongoDB](https://github.com/AnanthaRajuC/Spring-Boot-MongoDB)
