fun mainT() {
    println("Hello, Kotlin!")

    // Variables
    var name = "Sayang"
    val age = 25
    println("Name: $name, Age: $age")

    // Data Types
    val isAdult: Boolean = true
    val temperature: Float = 36.6F
    val letter: Char = 'A'

    // Conditions
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

    // Loops
    for (i in 1..5) {
        println("Count: $i")
    }

    // Functions
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet(name))

    // Collections
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println("Number: $number")
    }
}
