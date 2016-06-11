In mathematics, the **symmetric difference** of two sets is the set of elements which are in either of the sets and not in their intersection.

![Symmetric Difference](https://github.com/Saka7/codewars-katas/blob/master/SymmetricDifference/Symmetric-Difference.png)
> Symmetric Difference of a and b (a△b) marked in gray

Your taks is to implement method ``` getSymmetricDifference ``` which takes two sets of unique integer values and returns symmetric difference of these sets.

Examples:
```
  a = {2, 3, 7, 8}
  b = {5, 6, 2, 4, 7}
  a△b = {3, 8, 5, 6, 4}

  a = {3, 4, 2, 5, 7, 9}
  b = {1, 9, 8}
  a△b = {3, 4, 2, 5, 7, 1, 8}

  a = {13, 255, 354, 211, 120}
  b = {255, 354, 211, 120, 13}
  a△b = {}

  // If any of sets is empty method should return another set
  a = {}
  b = {5, 6, 2, 4, 7}
  a△b = {5, 6, 2, 4, 7}

  // If both sets are empty method should return empty set
  a = {}
  b = {}
  a△b = {}

```


**Note:** Method should return null if any of the argument is null
