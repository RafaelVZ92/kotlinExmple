open class User (var name:String, var lastName:String, var age:Int) {
    open fun sayHellowUser(nombre:String){
        println("Hola $nombre")
    }
}