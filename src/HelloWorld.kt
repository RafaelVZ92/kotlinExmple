fun main(args: Array<String>) {

    var number: Int = 1
    var numberLong:  Long = 22342342
    var numberFloat: Float = 12.34f
    var numberDouble: Double = 1.937343534
    //Variables alfa numericas
    var characterChar: Char = '1'
    var cadenaString: String = "Hola"
    var cadena2: String = "Mundo!"
    var bolean: Boolean = true;
    var m : MyClass = MyClass()
    var u : User = User("rafael", "velazquez", 27)
    var e : Employe = Employe("Rafael")
    e.name

    e.sayHellowUser(e.name)




    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
        weekDays.get(0);
        weekDays.set(1, "New lunes")

    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    readOnly.size //Muestra el tamaño de la lista
    readOnly.get(3) //Devuelve el valor de la posición 3
    readOnly.first() //Devuelve el primer valor
    readOnly.last() //Devuelve el último valor
    println(readOnly) //[Lunes, Martes, Miércoles, Jueves

    //NULL SAFELI ES CUANDO UNA VARIABLE O VALOR PUEDE LLEGAR A SER NULL
    var name:String? = null
    //para obtener un llamado seguro por que sabemos que el objeto puede llegar a ser null
    var lengthName = name?.length
    //operador elvis se usa cuando el objeto es null que propones hacer
    var nameLength = name?.length ?: 0
    //cuando un variable/objeto es diferente de null que hacer
    name?.let {
        //la accion que se debe hacer
    }
    //cuando un variable/objeto es null que hacer
    name.let {
        //la accion a hacer
    }
    //Rangos
    for(i in 1..10){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for(i in 1 until 10){
        print(i)
    }
    //Destructuring Declarations nos sirve para solicitamos datos explicitos de un objeto, array o funcion


    //Recorrer arrays
    for (posicion in weekDays.indices){
        println(weekDays.get(posicion))
    }

    //funcion de orden mayor es una funcion dentro de otra funcion

    println("Hello world")
    println(number + numberLong)
    //concatenacion
    println("$cadenaString $cadena2")
    println("Resultado de 1 + 22342342 = ${number+numberLong}")
    miPrimerMetodo()
    miSegundometodo("rafael", 27)
}

//declarando metodos
fun miPrimerMetodo(){
    println("Este es mi primer metodo")
}

fun miSegundometodo(nombre:String, edad:Int){
    println("Tu nombre es: $nombre, y tines $edad de edad")
}

//metodo con parametros de salida
fun sum(one:Int, two:Int) : Int{
    return one + two
}

//Sustituto de switch para establecer rangos puede usar 1..4
fun getMonth(month: Int){
    when(month){
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("April")
        5 -> print("Mayo")
        else -> {
           print("que hueva escribir los demas")
        }
    }


}