# SOLID-Principle-and-Design-Patterns
SOLID PRINCIPLES:
Single Responsibility Principle (S.R.P) – A class should have only one reason to change. A responsibility can be defined as a reason for change.

Open Closed Principle (O.C.P) - Open for Extension closed for Modification. You should be able to extend a class’s behavior, without modifying it. How do we achieve this?
Through abstractions. In order to be able to extend the behavior of a class without changing a single line of code, we need to make abstractions. For example, if we had a system that works with different shapes as classes, we would probably have classes like Circle, Rectangle, etc. In order for a class that depends on one of these classes to implement OCP, we need to introduce a Shape interface/class.

Liskov Substitution Principle (L.S.P.) – Derived classes must be substitutable for their base classes.
Replace object of parent with object of child without breaking the code.
 
Interface Segregation Principle (I.S.P) - Clients should not be forced to implement interfaces they do not use. Make fine grained interfaces that are client specific. In other words, it is better to have many smaller interfaces, than fewer, fatter interfaces

Dependency Inversion Principle (D.I.P) – Depend on abstractions, not on concretions. A. High level modules should not depend upon low level modules. Both should depend upon abstractions.
B. Abstractions should not depend upon details. Details should depend upon abstractions.

If we do not follow SOLID:
-	Tight Coupling
-	Not testable
-	Duplication of code
Advantages:
-	Reduction in complexity of code
-	Increase readability, extensibility and maintabillity


3 Factors:
-	Architecture – such as MVC, WBAPI, MVM etc.
-	Design Principles – Approach development process to follow.
-	Design Patterns – to build the software. 

DESIGN PATTERNS  are description or templates for how to solve a problem that can be used in many different situations. Design patterns are: Creational, Structural and Behavioral.

CREATIONAL DESIGN PATTERNS: These design patterns are all about class instantiation. This pattern can be further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.

Abstract Factory Provide an interface for creating families of related or dependent classes without specifying their concrete classes. Main class -> Family of related classes -> classes

Builder  Separate the construction of a complex object from its representation, allowing the same construction process to create various representations.

Factory Method Creates an instance of several derived classes. Define an interface for creating a single object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

Object Pool Avoid expensive acquisition and release of resources by recycling objects that are no longer in use. Avoid expensive acquisition and release of resources by recycling objects that are no longer in use. Can be considered a generalisation of connection pool and thread pool patterns.

Prototype A fully initialized instance to be copied or cloned. Specify the kinds of objects to create using a prototypical instance, and create new objects from the 'skeleton' of an existing object, thus boosting performance and keeping memory footprints to a minimum.

Singleton A class of which only a single instance can exist. Ensure that it creates only one instance of the object.

STRUCTURAL DESIGN PATTERN: These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality.

Adapter Match interfaces of different classes. Convert the interface of a class into another interface clients expect. An adapter lets classes work together that could not otherwise because of incompatible interfaces. 

Bridge Separates an object’s interface from its implementation. Decouple an abstraction from Its implementation allowing the two to vary independently.

Composite Compose objects into tree   structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

Decorator Attach additional responsibilities to an object dynamically keeping the same interface. 

Facade defines a higher-level interface that makes the subsystem easier to use.
It is a single class that represents an entire subsystem. 

Flyweight A fine-grained instance used for efficient sharing. Use sharing to support large numbers of similar objects efficiently.

Proxy An object representing another object. Provide a surrogate or placeholder for another object to control access to it.

BEHAVIORAL DESIGN PATTERNS: Behavioral patterns are those patterns that are most specifically concerned with communication between objects.

Chain of responsibility A way of passing a request between a chain of objects. 

Command Encapsulate a command request as an object. 

Interpreter A way to include language elements in a program. Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

Iterator Sequentially access the elements of a collection. Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation. 

Mediator Defines simplified communication between classes. Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it allows their interaction to vary independently.

Memento Capture and restore an object's internal state. Without violating encapsulation, capture and externalize an object's internal state allowing the object to be restored to this state later.

Null Object Designed to act as a default value of an object. Avoid null references by providing a default object.

Observer A way of notifying change to a number of classes. Define a one-to-many dependency between objects where a state change in one object, all its dependents are notified and updated automatically.

State Alter an object's behavior when its state changes. Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

Strategy Encapsulates an algorithm inside a class. Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

Template method Defer the exact steps of an algorithm to a subclass. Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

Visitor Visitor lets a new operation be defined without changing the classes of the elements on which it operates.
