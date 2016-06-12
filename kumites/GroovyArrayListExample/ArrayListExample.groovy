def languages = ['Java', 'C#', 'Scala', 'F#']
languages.add('Groovy')
languages << 'Clojure'

languages.remove('F#')
languages -= 'C#'

println "JVM programming languages: "
languages.each{println it.toUpperCase()}