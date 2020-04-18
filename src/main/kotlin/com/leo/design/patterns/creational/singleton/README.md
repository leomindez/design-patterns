## Properties

* Only one instance
* Control of a resource
* Lazily loaded
* Handle its own lifecycle.
* Need to be thread safe.
* Private instance.
* No parameters required.

## Examples

* Logger
* Runtime
* DB Connection

## Design

| Singleton|
|-----------------------|
| + instance: Singleton|

## Notes

Use lazy function to create only one instance

**By default, the evaluation of lazy properties is synchronized: the value is computed only in one thread, and all threads will see the same value.**
