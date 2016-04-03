package Codes

object Test {

  // pattern matching of integers
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other wilcard pattern"
  }

  //pattern matching for any data type
  def matchTestAny(x: Any): Any = x match {
    case 1         => "one"
    case "two"     => 2
    case y: Int    => "scala.Int"
    case f: Double => "scala.Double"
    case _         => "many"
  }

  def main(args: Array[String]) {
    //println(matchTest(1))
    println(matchTestAny("two"))
    println(matchTestAny("test"))
    println(matchTestAny(21))
    println(matchTestAny(1.1))

  }
}