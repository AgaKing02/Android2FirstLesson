abstract class Animal {
    abstract val animalType: String
    abstract fun makeSound()
}

abstract class WildAnimal : Animal()

open class DomesticAnimal(override val animalType: String, open val petName: String) : Animal() {
    override fun makeSound() {
        println("Make DomesticAnimal sound")
    }
}

class Tiger(override val animalType: String) : Animal() {
    override fun makeSound() {
        println("${this.animalType} make sound")
    }
}



