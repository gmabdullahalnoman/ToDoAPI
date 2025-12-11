#SpringBoot ToDo List API

A simple RESTful ToDo List backend buiold with SpringBoot, JPA, and H2.
This would allows to create, read, update and delete tasks through REST API endpoints.

#Features                    #API Endpoints
- Create a new task           [POST/todo]
- View tasks                  [GET/todo]
- Update an existing task     [PUT/todo]
- Delete a task by ID.        [DELETE/toto/{id}]
- Uses JPA for database operations
- Works with postman. [Testsing with Postman -
                        - Import the endpoints manually.
                        - Use JSON body for POST/PUT.
                        - Check responses instanly.

#Technologies used
- Java 17+
- SpringBoot
- SpringWeb
- SpringDataJPA
- H2 Database
- Maven

#Structure
 src/main/java/com/example/ToDo
 -- controller/todoController.java
 -- model/Task.java
 -- repository/todoRepo.java
 - ToDoApplication.java

=>This project is open-source. Feel free to use or modify it.
