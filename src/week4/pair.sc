package week4

object pair {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val pair = ("answer",42)                        //> pair  : (String, Int) = (answer,42)
  val (label, value) = pair                       //> label  : String = answer
                                                  //| value  : Int = 42
}