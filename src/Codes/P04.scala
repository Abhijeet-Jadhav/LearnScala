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

  // a more efficient solution using tail recursion
  def lengthTailRecursive[A](ls: List[A]): Int = {

    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil       => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }

  // fold/foldleft on list takes two argument
  // start value and function
  // function in turn takes two arguments: accumulated value and list index
  def lengthFunctional[A](ls: List[A]): Int = {
    ls.foldLeft(0)((count, _) => count + 1)
  }

  def main(qw: Array[String]) {
    val ls: List[Int] = List(1, 2, 2, 6, 2, 2)
    println(own_length(ls))
    println(lengthRecursive(ls))
    println(lengthTailRecursive(ls))
    println(lengthFunctional(ls))
  }
  
}