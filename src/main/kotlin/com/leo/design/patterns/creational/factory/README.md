## Properties

* Doesn't expose instantiation logic
* Common interface
* Implemented by user 
* Lifecycle responsibility 
* Parameter driven 
* Solve complex creation 
* Opposite of a singleton
* Complex implementation 

## Examples

* Calendar 
* Number Format

## Design 

| interface Navigation|
|----| 
| + sections |
| - createSections()|

| Administrator Navigation|
|----| 
| - createSections()|

| Guess Navigation|
|----| 
| - createSections()|

**_All sections above inheritance from Navigation class._** 

| Section |
|----| 
| - title |
| - color |
| - icon |

| View Section |
|----|
 
| Edit Section |
|----|

| Add Section |
|----|

**_All sections above inheritance from Section class._** 

## Notes

Use the pattern to create in runtime different version of your components. 
Example given is relating by navigation requirement depends on type of role.
 