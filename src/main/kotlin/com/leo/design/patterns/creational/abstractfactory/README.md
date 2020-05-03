## Intent

Provide an interface for creating families of related or dependent 
objects without specifying their concrete class.

## Applicability

* A system should be independent of how the objects are created, composed 
and represented. 
* Configure with one of multiple families of classes. 
* When the interface reveals just interfaces not implementations. 

## Properties

* Factory of factories
* Composition whereas Inheritance
* Concrete classes
* Lifecycle responsibility 
* Group similar factories

## Design

| ScreenFactory |
| ----|
| createToolbar |
| createDrawer |

| Drawer |
| --- |
| sections |

| Toolbar |
| ---- |
| title |
| backgroundColor |

Each abstract class and interface have their own implementation. 
  