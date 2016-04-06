package Codes
/*
Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */

object P07 {

  def f(x: Int) = if (x > 2) Some(x) else None

  val l = List(1, 2, 3, 4)
  val ls: List[Any] = l.map { x => f(x) }
  println(ls)
  println(l.flatMap { x => f(x) })

  def g(v: Int) = List(v - 1, v, v + 1)
  println(l.map { x => g(x) })
  println(l.flatMap { x => g(x) })
  println(l)

  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e           => List(e)
  }

  def main(args: Array[String]) {
    val ls = List(List(1, 1), 2, List(3, List(5, 8)))
    val str = List("abhijeet","jadhav")
    println("flatten a nested list = "+flatten(ls))
    println("flatten a list of string"+str.flatten)
  }
}