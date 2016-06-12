class Person
  constructor: (@name, @age) ->
  toString: -> "#{@name} is #{@age} years old" 
  
class Developer extends Person
  constructor: (name, age, @skills) -> super(name, age)
  toString: -> super.toString() + " and has #{@skills} skills"
  
jack = new Developer("Jack", 20, ['CoffeeScript', 'JavaScript'])
console.log jack.toString()