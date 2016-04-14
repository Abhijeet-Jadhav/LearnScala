package week5

class Logger {

  println("calling default constructor")
  var context: String = "generic"

  def this(context: String) = { this(); this.context = context }

  def info(m: String) = println(s"INFO: $context: $m")
  def error(m: String) = println(s"ERROR: $context: $m")
}

/*
class Logger(private var context: String = "generic") {
  def info(m: String) = println(s"INFO: $context: $m")
  def error(m: String) = println(s"ERROR: $context: $m")
}
//This way context cannot be accessed from outside the class
*/
object Main1 extends App {

  val l = new Logger()
  l.info("test message 1") // outputs `INFO: generic: test message 1`  
  l.context = "controller"
  l.info("test message 2") // outputs `INFO: controller: test message 2`

}