## Properties

* Avoid costly creation.
* Avoid subclassing.
* Typically, don't use the new keyword.
* Implement a registry to get instances.
* Use an interface to declare the actions over the object.
* Guarantee unique instance. 
* Utilize parameters for construction (Typically, it is not used).
* Can help with performance issues.

## Example
 
```kotlin
toList()
toSet()
toMutableList()
```

## Design

| interface Prototype|
|----| 
| + clone()|

 ## Notes
  
Shallow copy implementation is going to return all the same instances which are cloned.
 
Deep copy implementation is going to return different instance for each element copied. 

I used my own implementation to clone the object but if you can create a copy from the object
you can use data class to use copy method which is already implemented. 
