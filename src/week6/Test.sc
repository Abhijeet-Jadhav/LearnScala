package week6

object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val arr: Array[Int] = Array(1,2,3,344)          //> arr  : Array[Int] = Array(1, 2, 3, 344)
  arr map (x => x*x)                              //> res0: Array[Int] = Array(1, 4, 9, 118336)
  
  val str: String = "Hello World"                 //> str  : String = Hello World
  str filter (c => c.isUpper)                     //> res1: String = HW
  
}