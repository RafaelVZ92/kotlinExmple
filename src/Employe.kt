class Employe(name:String) : User(name, "Velazquez", 27) {
    override fun sayHellowUser(nombre: String) {
        println("Hola $name $lastName")
    }
}