[3kyu Calculator](https://www.codewars.com/kata/5235c913397cbf2508000048)

Create a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns the value of that expression

Example:

```python
Calculator().evaluate("2 / 2 + 3 * 4 - 6") # => 7
```
```ruby
Calculator.new.evaluate("2 / 2 + 3 * 4 - 6") # => 7
```
```java
Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
```

Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.