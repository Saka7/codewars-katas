data class User(val id: Long, var email: String, var name: String)

fun main(args: Array<String>) {
    var user = User(1, "random@email.com", "randomName")
    
    // toString
    println(user)
    
    // equals
    println(user.equals(User(1, "random@email.com", "randomName")))
    
    // ComponentN
    println("user name is ${user.component3()}")
    
    // copy
    var newUser = user.copy(name="newName")
    println(newUser)
}
