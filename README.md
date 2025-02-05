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
7. For each exercise, write the code, execute it, take sccreenshots and put it inside SubmissionImages folder.
8. Once done, commit and push your changes to this remote GitHub repository.

---

## Exercise-1: Create jar files and execute it

---

## Exercise-2: Update the provided application code to use Spring Framework with `@Configuration` and `@Bean` annotations.
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

#### Constraints:
- Use only `@Configuration` and `@Bean` annotations.
- Do not modify the `Product` class.
- Ensure the refactored code works with Spring's dependency injection.
- The `App.java` class should be simple and should delegate object creation to the Spring context.

#### Deliverables:
- **AppConfig.java**: A configuration class that defines `Product` beans.
- **App.java**: The main application class that uses Spring to manage the `Product` beans.

#### Expected Outcome:
When the application is run, it should output the `Product` objects created by Spring, similar to the original approach, but now managed by Spring's IoC container.

---

## Exercise-3: Use @Component, and @Autowired

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
