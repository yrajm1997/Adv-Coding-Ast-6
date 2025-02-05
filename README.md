# Advanced Coding Assignment-6

This assignment consist of 3 exercises.

## Steps to Follow
1. This GitHub repository will be accessible to you once you accept the Assignment.
2. You have to work directly in this GitHub repository. It is like your own copy of the original repository.

3. The folder structure is as given below:
   ```
   root
   ├── ex1
   |   ├── App.java
   |   ├── Product.java
   |   └── Barcode.java
   ├── ex2
   |   ├── pom.xml
   |   └── src/main/java/com/mystore/app
   |       ├── App.java
   |       └── Product.java
   ├── ex3
   |   ├── pom.xml
   |   └── src/main/java/com/mystore/app
   |       ├── App.java
   |       ├── Product.java
   |       └── Barcode.java
   └── SubmissionImages
   ```

4. Go through the three exercises given below in this ReadMe and implement each in the respective folders - `ex1`, `ex2`, `ex3`.
6. To work on the files, you can clone this GitHub repository onto your system and then open it with an IDE like IntelliJ, or Eclipse.
7. For each exercise, write the code, execute it, debug if issue persists, take sccreenshots and put it inside SubmissionImages folder.
8. Once done, commit and push your changes to this remote GitHub repository.

---

## Exercise-1:
### Create and Execute a JAR File for the Provided Java Application Code

#### Background:
The provided application code consists of three Java classes: `App.java`, `Product.java`, and `Barcode.java`. The task is to package the code into a JAR (Java Archive) file using the jar command-line tool (without using Maven) and later execute the JAR file to ensure that the program runs as expected.

#### Objectives:
1. Compile the Java Files:
   - Compile the provided Java files into `.class` files using the `javac` command.
2. Create a JAR File:
   - Use the `jar` command to package the `.class` files into a JAR file. If needed, add a proper MANIFEST.MF file to specify the entry point of the application.
3. Verify the Contents of the JAR File:
   - After creating the JAR file, verify its contents by listing the files inside.
4. Run the JAR File:
   - After creating the JAR file, execute it using the `java -jar` command.
5. Take screenshots of commands executed and put it inside SubmissionImages folder

---

## Exercise-2: 
### Update the provided application code to use Spring Framework with `@Configuration` and `@Bean` annotations.

#### Background:
Currently, the application is creating `Product` objects manually within the `App` class, which is a simple Java-based application. The goal is to refactor the code to utilize the Spring Framework to manage the creation of `Product` objects and inject dependencies using `@Configuration` and `@Bean`.

#### Requirements:
1. Use Spring's `@Configuration` to configure and manage the `Product` beans.
2. Use `@Bean` in the configuration class to define and instantiate the `Product` objects.
3. Refactor the `App.java` to use Spring's ApplicationContext to get `Product` beans.
4. The `Product` class should remain unchanged, but the instantiation of `Product` objects in `App.java` should now be handled by the Spring Framework.

#### Tasks:
1. **Create a Spring configuration class** using `@Configuration` to define the beans.
   - Define two `Product` beans: one for "Tumbler" and one for "Bucket".
   - Use the `@Bean` annotation to create and return `Product` instances.
2. **Refactor the** `App.java` to:
   - Replace manual instantiation of `Product` objects with Spring's dependency injection.
   - Use `AnnotationConfigApplicationContext` to load the Spring context and retrieve the `Product` beans.
3. **Use Spring's ApplicationContext** to retrieve the `Product` beans and display them.
4. **Add Spring dependencies** in the `pom.xml` to set up the Spring framework.

#### Constraints:
- Use `@Configuration` and `@Bean` annotations.
- Do not modify the `Product` class.
- Ensure the refactored code works with Spring's dependency injection.
- The `App.java` class should be simple and should delegate object creation to the Spring context.

#### Deliverables:
- **AppConfig.java**: A configuration class that defines `Product` beans.
- **App.java**: The main application class that uses Spring to manage the `Product` beans.
- Take screenshots of commands executed and put it inside SubmissionImages folder

#### Expected Outcome:
When the application is run, it should output the `Product` objects created by Spring, similar to the original approach, but now managed by Spring's IoC container.

---

## Exercise-3: 
### Update the provided application code to use Spring Framework with the annotations `@Configuration`, `@ComponentScan`, `@Bean`, `@Component`, and `@Autowired`.

#### Background:
The provided code contains a basic application where `Product` and `Barcode` objects are manually instantiated in the `App.java` class. The goal is to refactor this code to use the **Spring Framework** for dependency management, so that Spring can handle the object creation, dependency injection, and lifecycle management. You will use the following Spring annotations:

- `@Configuration`: To define the configuration class where beans are declared.
- `@ComponentScan`: To instruct Spring to scan the package for classes annotated with `@Component` and register them as beans.
- `@Bean`: To define beans manually in the configuration class.
- `@Component`: To mark classes as Spring-managed beans that should be auto-detected during component scanning.
- `@Autowired`: To inject dependencies into Spring beans.

#### Objectives:
1. Refactor the `Product` and `Barcode` classes to use Spring’s dependency injection system.
2. Use `@ComponentScan` to enabexistingle Spring to automatically detect and register `Product` and `Barcode` beans.
3. Use `@Bean` in a `@Configuration` class to define the `Product` bean.
4. Use `@Autowired` to inject the Barcode dependency into the Product class automatically.

#### Tasks:
1. **Add Spring annotations**:
   - Use `@Configuration` to create a configuration class and define the `Product` bean using `@Bean`.
   - Mark the `Barcode` class as **Spring-managed bean** by using `@Component`.
   - Use `@Autowired` to inject the `Barcode` object into the `Product` class constructor.
2. **Refactor the** `App.java` and `Product.java`:
   - Replace manual instantiation of `Product` and `Barcode` with Spring-managed beans.
   - Use Spring's **ApplicationContext** to load the beans and manage the application’s object lifecycle.
3. **Define Spring Configuration** using `@ComponentScan` to automatically detect and manage beans.
4. **Add Spring dependencies** in the `pom.xml` to set up the Spring framework.

#### Constraints:
- The solution should use `@Configuration`, `@ComponentScan`, `@Bean`, `@Component`, and `@Autowired` annotations.
- Ensure that the `Product` and `Barcode` objects are created by Spring's dependency injection system, removing the manual object instantiation from `App.java`.
- Maintain the core logic of the application, ensuring that the `Product` objects are correctly initialized and their barcodes are generated.

#### Deliverables:
- **AppConfig.java**: A configuration class that defines beans and configures the application context.
- **App.java**: The main application class that uses Spring’s context to load and manage `Product` and `Barcode` beans.
- **Product.java**: Updated to be a Spring component with injected dependencies.
- **Barcode.java**: Updated to be a Spring component if necessary.
- **pom.xml**: The necessary Spring dependencies to run the application.
- Take screenshots of commands executed and put it inside SubmissionImages folder

---

## Submission Guidelines
After completing the assignment and developing the solution code in your system, commit and push the changes to this repository. 
  - Stage your changes and commit the files:
    ```
    git add .
    git commit -m "Completed playground challenge"
    ```
  - Push your changes to the GitHub repository:
    ```
    git push
    ```

Good luck, and happy coding!
