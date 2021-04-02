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

class Tiger(override val animalType: String) : WildAnimal() {
    override fun makeSound() {
        println("${this.animalType} make sound")
    }
}

class Dog(animalType: String, petName: String): DomesticAnimal(animalType, petName) {
    override fun makeSound() {
        println("${this.animalType} make sound gav-gav")
    }
}



