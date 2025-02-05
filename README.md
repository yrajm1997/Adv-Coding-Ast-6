# Adv-Coding-Ast-6



## Exercise-1: Create jar files and eecute it

Problem Statement: Update the existing application code to use Spring Framework with @Configuration and @Bean annotations.
Background:
Currently, the application is creating Product objects manually within the App class, which is a simple Java-based application. The goal is to refactor the code to utilize the Spring Framework to manage the creation of Product objects and inject dependencies using @Configuration and @Bean.

Requirements:
Use Spring's @Configuration to configure and manage the Product beans.
Use @Bean in the configuration class to define and instantiate the Product objects.
Refactor the App.java to use Spring's ApplicationContext to get Product beans.
The Product class should remain unchanged, but the instantiation of Product objects in App.java should now be handled by the Spring Framework.
Tasks:
Create a Spring configuration class using @Configuration to define the beans.

Define two Product beans: one for "Tumbler" and one for "Bucket".
Use the @Bean annotation to create and return Product instances.
Refactor the App.java to:

Replace manual instantiation of Product objects with Spring's dependency injection.
Use AnnotationConfigApplicationContext to load the Spring context and retrieve the Product beans.
Use Spring's ApplicationContext to retrieve the Product beans and display them.

Constraints:
Use only @Configuration and @Bean annotations.
Do not modify the Product class.
Ensure the refactored code works with Spring's dependency injection.
The App.java class should be simple and should delegate object creation to the Spring context.
Deliverables:
AppConfig.java: A configuration class that defines Product beans.
App.java: The main application class that uses Spring to manage the Product beans.
Expected Outcome:
When the application is run, it should output the Product objects created by Spring, similar to the original approach, but now managed by Spring's IoC container.


## Exercise-2: Use @Configuration, @Bean, and context

`mvn clean`

`mvn install`

`java -jar target/store-management-1.0-SNAPSHOT.jar`


## Exercise-3: Use @Component, and @Autowired



