package Codes

object P04 {

  var count = 1
  def own_length[T](ls: List[T]): Int = ls match {

    case h :: Nil  => count
    case h :: tail => count += 1; own_length(tail)
  }

  // without using extra variable count
  def lengthRecursive[T](ls: List[T]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }
  def main(qw: Array[String]) {
    val ls: List[Int] = List(1, 2, 2, 6, 2, 2)
    println(own_length(ls))
    println(lengthRecursive(ls))
  }
}