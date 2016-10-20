# Design Patterns

Practice of Design Patterns from Head First (Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra)

    Chapter 1 Strategy Pattern
        Object Oriented Basics
            * Abstraction
            * Encapsulation
            * Inheritance
            * Polymorphism
        Object Oriented Principles
            * Encapsulate what varies
            * Favor composition over inheritance
            * Program to interface not an implementation
        Object Oriented Patterns
            * Strategy Pattern : define a family of algorthms, encapsulate each one, and makes them interchangeable.
              Strategy lets the algorithm vary independetly from client that use it.
    Chapter 2 Observer Pattern
        OO Principles
            * Strive for loosly coupled designs between objects that interact.
        OO Patterns
            * Observer defines a one to many dependency between objects so that when one object changes state, all its
            dependents are notified and update automaticly.
    Chapter 3 Decorator Pattern
        OO Principles
            * Class should be open for extension but closed for modification. Open Close Principle.
        OO Patterns
            * Attached additional responsibilities to an object dynamically. Decorators provide a flexible alternative to sub-classing for extending functionality.
    Chapter 4 Factory & Abstract Factory Pattern
        OO Principles
            * Depend on abstraction, do not depent on concrete classes.
        OO Patterns
            * Abstract Factory: Provides an interface for creating families of related or depentent objects without
             specifying thier concrete class.
            * Factory Method: Define an interface for creating an object, but let subclasses decide which class to instantiate.
             Factory method lets a class defer instantiation to the subclasses.
    Chapter 5 Singleton Pattern
        OO Patterns
            * Ensure a class only has one instance and provide a globall point of access to it.
    Chapter 6 Command Pattern
        OO Pattern
            * Encapsulate a request as an object, there by letting you parameterize client with different request,
            queue or long request, and support unduable operations.
    Chapter 7 Adapter and Facade Pattern
        OO Pattern
            * Adapter, Converts the interface of a class into another interface client expects.
            Lets classes work together that could not otherwise because of incompatiable interface.
            * Facade, Provides a unified interface to a set of interfaces in a subsystem.
            Facade defines higher-level interface that makes the subsystem easier to use.
    Chapter 8 Template Pattern
        OO Principles
            * Dont call us, we will call you; superclasses are running the show, so let them call the subclasses
             when they are needed.
        OO Pattern
            * Define the skeleton of an algorithm in an operation, deffering some steps to subclasses.
              Template method lets subclasses redefined certain steps of an algorithm without changing the algorithm's strategy.
    Chapter 9 Iterator and Composite Pattern
        OO Principles
            * A class should have only one reason to change.
        OO Pattern
            * Iterator; Provide a way to access the elements of an aggregate
                object sequntially without exposing its underliying representation.
              Composite; Compose objects into tree structure to represent part-whole hierarchies.
              Composite lets clients treat individual objects and compositions of objects uniformaly.
    Chapter 10 State Pattern
        OO Pattern
            * Allow an object to alter its behavior when its internal state changes.
            The object will apppear to change its class
    Chapter 11 Proxy Pattern
        OO Pattern
            * Provide a surrogate or placeholder for another object to control access to it.
    Chapter 12 Compound Patterns
        OO Pattern
            * A compound pattern combines two or more patterns into a solution that solves a reccuring or general problem.