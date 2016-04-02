package week4

// in scala create singletons with object keyword

object MyObject {
    val someField: Int = 5
    def SomeMethod(name: String) : String = {"Hello, "+name}
}

// the above code creates an underlying type for the singleton 
// called MyObject.type - which contains SomeField and SomeMethod
// and it makes the value MyObject available in the current package
