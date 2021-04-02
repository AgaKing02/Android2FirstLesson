interface Rideable{
    fun move()
    fun stop(){
        println("Stop")
    }
}

interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}