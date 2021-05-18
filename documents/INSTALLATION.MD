## Installation

<details open="open">
	<ul>
		<li><a href="#mongodb">MongoDB</a></li>
		<li><a href="#running-the-application-with-ide">Running the application with IDE</a></li>
		<li><a href="#running-the-application-with-maven">Running the application with Maven</a></li>
		<li><a href="#running-the-application-with-executable-jar">Running the application with Executable JAR</a></li>
	</ul>
</details>

#### MongoDB

*	You need to have **MongoDB** installed on your machine to run the application. To start the MongoDB server, on your windows machine navigate to **`C:\Program Files\MongoDB\Server\4.0\bin\`** folder and double-click on **`mongod.exe`** file

[![MongoDB Server Start](documents/images/mongod-server-start.PNG)](documents/images/mongod-server-start.PNG)

#### Running the application with IDE

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `io.github.anantharajuc.sbmdb` class from your IDE.

* 	Download the zip or clone the Git repository.
* 	Unzip the zip file (if you downloaded one)
* 	Open Command Prompt and Change directory (cd) to folder containing pom.xml
* 	Open Eclipse
	* File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
	* Select the project
* 	Choose the Spring Boot Application file (search for @SpringBootApplication)
* 	Right Click on the file and Run as Java Application

#### Running the application with Maven

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
$ git clone https://github.com/AnanthaRajuC/Spring-Boot-MongoDB.git
$ cd Spring-Boot-MongoDB
$ mvn spring-boot:run
```

#### Running the application with Executable JAR

The code can also be built into a jar and then executed/run. Once the jar is built, run the jar by double clicking on it or by using the command 

```shell
$ git clone https://github.com/AnanthaRajuC/Spring-Boot-MongoDB.git
$ cd Spring-Boot-MongoDB
$ mvn package -DskipTests
$ java -jar target/Spring-Boot-MongoDB-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```

To shutdown the jar, follow the below mentioned steps on a Windows machine.

*	In command prompt execute the **jcmd** command to print a list of all running Java processes
*	**Taskkill /PID PROCESS_ID_OF_RUNNING_APP /F** execute this command by replacing the **PROCESS_ID_OF_RUNNING_APP** with the actual process id of the running jar found out from executing the previous command
