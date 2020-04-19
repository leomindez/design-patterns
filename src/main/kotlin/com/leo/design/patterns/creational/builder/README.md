## Properties

* Handle complex constructors
* Immutability
* n parameters

## Examples

* StringBuilder
* DocumentBuilder
* Locale.Builder

## Design

| Query |
|---|
| + where: String |
| + orderBy: String |
| + select: String |

| Builder |
|----|
| + where(): String |
| + orderBy(): String |
| + select(): String |
| + build(): Query |

## Notes

Use apply function
```kotlin
inline fun <T> T.apply(block: T.() -> Unit): T
```
**Calls the specified function block with this value as its receiver and returns this value.**

  

