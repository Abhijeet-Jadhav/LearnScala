package week5

//trait A extends B
//trait B extends A // Illegal cyclic reference involving trait A

// Self types allow you to define cyclic dependencies
trait A { self: B => }
trait B { self: A => }


object ThisInScala {
  
}