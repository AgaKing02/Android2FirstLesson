class ArrayUtil<T>(private val array: Array<T>) {
    fun findElement(element: T, foundElement: (index: Int, element: T?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                foundElement(i, array[i])
                return
            }
        }
        foundElement(-1, null)
        return
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.name = "Agakhan"
    person.surname = "Peiishbek"
    println("${person.name} ${person.surname}")

    person.age = 18
    println("Person's age : ${person.age}")

    val animal: Animal = Dog("Any","layka")
    animal.makeSound()

    val car: Car = Car("Chevrolet Corvette 1973 ", "7810SAG")
    println(car.model)
    println(car.number)

    val plane:Plane=Plane()

    plane.move()
    plane.stop()

    car.move()
    car.stop()

    println()

    val util = ArrayUtil<Int>(arrayOf(1, 2, 3, 4, 5))
    val util1 = ArrayUtil<String>(arrayOf("1", "2", "3", "4", "5"))

    util.findElement(4) { index, element ->
        println("Index $index")
        println("Element $element")
    }

    util1.findElement("3") { index, element ->
        println("Index $index")
        println("Element $element")
    }
}

