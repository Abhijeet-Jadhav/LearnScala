package Codes

object P01 {
  // There are several ways to solve this problem.  If we use builtins, it's very
  // easy.
  def lastBuiltin[A](ls: List[A]): A = ls.last

  // The standard functional approach is to recurse down the list until we hit
  // the end.  Scala's pattern matching makes this easy.
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

  def lastElement[T](ls: List[T]): T = {
    val length = ls.length
    /*var i = 0
    for (i <- 0 to length - 1) {
      println("i=" + i + " element=" + ls(i))
    }*/
    
    return ls(length-1)
  }

  def main(args: Array[String]) {

    val nums: List[Int] = List(1, 2, 2, 4, 56, 76)
    //nums.foreach { println }
    //println
    var sum = 0
    nums.foreach { sum += _ }
    //println("sum=" + sum)

    val names = Vector("dhtr", "qbfr", "qqwe", "as")
    //for (name <- names) println(name)

    //println(nums.last)
    //println(lastBuiltin(nums))
    //println(lastRecursive(nums))
    
    println(lastElement(nums))
  }
}