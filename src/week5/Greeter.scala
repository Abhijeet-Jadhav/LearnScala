package week5

class Greeter(message: String, secondaryMessage: String) {
  println("calling default constructor")
  def this(message: String) = {
    this(message, "Aux constructor calling default constructor from 1st line")
    println("body of aux constructor")
  }
  println("body of default constructor")
  def SayHi() = println(message + secondaryMessage)
}

object Main {
  def main(args: Array[String]) {
    val greeter = new Greeter("calling Aux Constructor -- ")
    greeter.SayHi()
  }
}