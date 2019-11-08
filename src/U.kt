class U {
    var name: String? = ""
    var lastName: String? = ""
    var age: Int = 0

    constructor(name: String, lastName: String, age: Int) {
        this.name = name
        this.lastName = lastName
        this.age = age
    }

    constructor(name: String, lastName: String) {
        this.name = name
        this.lastName = lastName
    }
}
