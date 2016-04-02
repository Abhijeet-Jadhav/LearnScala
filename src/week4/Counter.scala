package week4

class Counter {
  // A class is not declared as public, by default it has public visibility 
  
  private var value = 0 // variables must be initialised
  
  // methods are public by default
  def increment() = {
    value += 1
  }
  def current = {
    println(value)
  }
  
  println(value)


}

object Main{
  def main(args: Array[String])  {
    val myCounter = new Counter // or new Counter
    //println(myCounter.value)
    myCounter.increment
    myCounter.current
  }
  
}