def frameworks = ['Groovy' : 'Grails', 'Java' : 'Spring', 'Scala' : 'Play']
  
frameworks.put('Ruby', 'Rails')
frameworks << ['Nodejs' : '...']

frameworks.remove('Ruby')

frameworks['Nodejs'] = 'Express'
  
frameworks.each {
  println "Most commonly used $it.key framework is $it.value"
}