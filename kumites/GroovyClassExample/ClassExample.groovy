class Person {
  String name
  int age
  
  void setName(String name) {
    if(name.matches(/^[a-zA-Z]*$/))
      this.name = name
    else
      throw new Exception('Invalid name')
  }
  
  void setAge(int age) {
    if(age >= 0 && age <= 150)
      this.age = age
    else
      throw new Exception('Invalid age')
  }
  
  String toString() {
    "$name is $age years old"
  }
  
}

class Developer extends Person {
  List<String> skills
  
  Developer(String name="No Name", int age=0, List<String> skills=[]) {
    setName(name)
    setAge(age)
    this.skills = skills.collect()
  }
  
  String toString() {
    super.toString() + " and have $skills skills"
  }
  
}

static main(args) {
  Person jack = new Developer("jack", 25, ['Groovy on Grails'])
  jack.name = jack.name.toUpperCase()
  jack.age++
  jack.skills << 'Spring'
  
  try{
    jack.name = "~~~JACK~~~"
  } catch(e) {
    println "### Mistake: ${e.getMessage()} ###"
  }
  
  try{
    jack.age -= 200
  } catch(e) {
    println "### Mistake: ${e.getMessage()} ###"
  }
  
  print jack
}