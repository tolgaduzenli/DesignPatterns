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