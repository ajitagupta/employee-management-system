# Employee Management System

The way we develop applications today is different than it was a year ago, 5 years ago, 10 years ago, and certainly 20 years ago, before an initial form of the Spring Framework was introduced in Rod Johnson’s book, Expert One-on-One J2EE Design and Development (Wrox, 2002).

Back then, the most common types of applications developed were browser-based web applications, backed by relational databases. Although that type of development is still relevant—and Spring is well equipped for those kinds of applications—we're now also interested in developing applications composed of microservices destined for the cloud that persist data in a variety of databases.

## What is Spring?
Any nontrivial application comprises many components, each responsible for its own piece of the overall application functionality, coordinating with the other application elements to get the job done.

When the application is run, those components somehow need to be created and introduced to each other.

At its core, Spring offers a container, often referred to as the Spring application context, that creates and manages application components. These components, or beans, are wired together inside the Spring application context to make a complete application, much like bricks, mortar, timber, nails, plumbing, and wiring are bound together to make a house.

### Dependency Injection
The act of wiring beans together is based on a pattern known as dependency injection (DI). Rather than have components create and maintain the life cycle of other beans that they depend on, a dependency-injected application relies on a separate entity (the container) to create and maintain all components and inject those into the beans that need them. This is done typically through constructor arguments or property accessor methods.

### Inversion of Control
Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework.

The act of managing, configuring and assembling your object through an external resource is called Inversion of Control. In other words by delegating control you invert it. This makes your application architecture more modular and decouples the execution of a task from its implementation.

We can achieve Inversion of Control through various mechanisms such as: Strategy design pattern, Service Locator pattern, Factory pattern, and Dependency Injection (DI).

### Application Context
Application components are managed and injected into each other by the Spring application context.

For example, suppose that among an application's many components, you will address two: an inventory service (for fetching inventory levels) and a product service (for providing basic product information). The product service depends on the inventory service to be able to provide a complete set of information about products.

This image illustrates the relationship between these beans and the Spring application context.

![Spring application context](https://i.ibb.co/hW5Vx38/Spring-Application-Context.png "Spring application context")

Source: *Spring in Action, Craig Walls, 2022*

### Autowiring
Automatic configuration has its roots in the Spring techniques known as autowiring and component scanning. With autowiring, Spring automatically injects the components with the other beans that they depend on.

### Component Scanning
With component scanning, Spring can automatically discover components from an application's classpath and create them as beans in the Spring application context. 

## What is Persistence?
Object persistence means individual objects can be saved to a data store and be re-created at a later point in time.

When we talk about persistence in Java, we are normally talking about mapping and storing object instances in a database using SQL.

Almost all applications require persistent data. Persistence is one of the fundamental concepts in application development. If an information system didn't preserve data when it was powered off, the system would be of little practical use.

In a normal software engineering environment, we think of the problems of data storage and sharing in the context of an object-oriented application that uses a domain model. The object/relational mismatch comes into play when the data store is an SQL-based relational database management system.

### ORM
In a nutshell, object/relational mapping is the automated (and transparent) persistence of objects in a Java application to the tables in an SQL database, using metadata that describes the mapping between the classes of the application and the schema of the SQL database. In essence, ORM works by transforming (reversibly) data from one representation to another.

In the case of applications with nontrivial business logic, the domain model approach helps to improve code reuse and maintainability significantly.

ORM is an advanced technique used by developers who have already done it the hard way. It eliminates much of the grunt work and lets you concentrate on the business problem, (thereby increasing productivity).


##  JPA and Hibernate

Hibernate is an ORM framework, meaning it allows to map Java objects directly to tables in the database. It is a concrete implementation of the JPA (Java Persistence API) specification.

JPA specifies how the data must be mapped using Java annotations, basic CRUD operations, Java Persistence Query Language (JPQL), and optimization strategies.

Hibernate implements JPA and supports all the standardized mappings, queries, and programming interfaces.
