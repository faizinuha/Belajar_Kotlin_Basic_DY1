fun main() {
    // Basic Output
    println("Hello, Kotlin!")

    // Variables
    val name: String = "Sayang" // Immutable (val)
    var age: Int = 21            // Mutable (var)
    
    // Displaying Variables
    println("Name: $name")
    println("Age: $age")

    // Conditional Statement
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

    // Loop Example
    for (i in 1..5) {
        println("Loop iteration: $i")
    }

    // Function Example
    greetUser(name)

    // Class Example
    val person = Person("Sayang", 21)
    person.introduce()
}

// Function Declaration
fun greetUser(userName: String) {
    println("Hello, $userName! Welcome to Kotlin.")
}

// Class Definition
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}
