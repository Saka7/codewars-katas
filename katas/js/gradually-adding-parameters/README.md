[7kyu ](https://www.codewars.com/kata/555b73a81a6285b6ce000047)

This kata is all about adding numbers.

You will create a function named add. This function will return the sum of all the arguments. Sounds easy, doesn't it??

Well here's the twist. The inputs will gradually increase with their index as parameter to the function.

```javascript
  add(3,4,5); 
  /*
  returns ( 3 * 1 ) + ( 4 * 2 ) + ( 5 * 3 ) = 26
  */
```
```ruby
  add(3,4,5) #returns (3*1)+(4*2)+(5*3)=26
```
```python
  add(3,4,5) #returns (3*1)+(4*2)+(5*3)=26
```
```haskell
add(3,4,5) `shouldBe` 3 * 1 + 4 * 2 + 5 * 3 -- = 26  
```
```rust
  add(&[3,4,5]); // returns (3*1)+(4*2)+(5*3)=26
```
Remember the function will return 0 if no arguments are passed.

## Example

```javascript
  add(); //=> 0
  add(1,2,3); //=> 14
  add(1,4,-5,5); //=> 14
```
```ruby
  add() #=> 0
  add(1,2,3) #=> 14
  add(1,4,-5,5) #=> 14
```
```python
  add() #=> 0
  add(1,2,3) #=> 14
  add(1,4,-5,5) #=> 14
```
```haskell
add [        ] `shouldBe`  0
add [1,2,3   ] `shouldBe` 14
add [1,4,-5,5] `shouldBe` 14
```
```rust
  add(&[]); //=> 0
  add(&[1,2,3]); //=> 14
  add(&[1,4,-5,5]); //=> 14
```