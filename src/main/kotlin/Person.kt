class Person {
    var name: String? = null
        set(value) {
            field = value?.toUpperCase()
        }
        get() {
            return field
        }

    var surname: String? = null
        set(value) {
            field = value?.toUpperCase()
        }
        get() {
            return field
        }

    var age: Int? = null
        set(value) {
            if (value?.compareTo(18)!! < 0) {
                throw Exception("Person is minor")
            } else {
                field = value
            }
        }
        get() {
            return field
        }

}

class Car(mod: String, num: String) : Movable, Info {

    override val number: String
    override val model: String

    init {
        number = num
        model = mod
    }

    override fun move() {
        println("The car is coming")
    }
}

class Aircraft : Movable {
    override fun move() {
        println("The plane is flying")
    }

    override fun stop() {
        println("Landing")
    }
}