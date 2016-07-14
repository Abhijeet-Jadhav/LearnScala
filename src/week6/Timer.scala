package week6
/*
 * Functions are objects in Scala implies 
 * 1. Functions can be passed as an argument
 * 2. Store them in variables
 * 3. return a function from another function    
 */


// The Timer function performs an action every second
object Timer {
  
  //foo is the formal argument name of a callback function which gets called when some event occurs
  // Its type is () => Unit implies it takes no argument and returns nothing (Unit is void in other languages)
  
  def oncePerSecond(foo: () => Unit) {
    while (true) { foo(); Thread sleep 1000 }
  }
  
  // definition of the callback function
  def timeFlies() {
    println("time flies like an arrow...")
  }
  
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}