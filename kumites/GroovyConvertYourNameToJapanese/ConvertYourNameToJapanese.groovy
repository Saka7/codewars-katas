def name = "John Cena"
try {
  println "Your name in japanese is " + convertToJapanese(name)
} catch(e) {
  System.err << e.getMessage()
}

static String convertToJapanese(String name) {

    name = name.toLowerCase()
    
    if(name == "" || !name.matches('^[a-z\\s]*$'))
      throw new Exception('ERROR: invalid name\n')

    def alphabet = [
      'ka','zu','mi','te','ku',
      'lu','ji','ri','ki','zus',
      'me','ta','rin','to','mo',
      'no','ke','shi','ari','chi',
      'do','ru','mei','na','fu','zi'
    ]

    String japaneseName = ''

    name.each {
      if(it.matches('\\s'))
        japaneseName += ' '
      else 
        japaneseName += alphabet[((int)it) - 97]
    }

    japaneseName.split(' ').collect{it.capitalize()}.join(' ')
}