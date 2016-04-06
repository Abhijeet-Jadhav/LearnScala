package Codes

/*
Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

object P05 {

  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  def reverseTailRecursive[A](ls: List[A]): List[A] = {

    def reverseR(finalList: List[A], currList: List[A]): List[A] = currList match {
      case Nil       => finalList
      case h :: tail => reverseR(h :: finalList, tail)
    }
    reverseR(Nil, ls)
  }
  
  
  // foldLeft take two arguments - intital value of accumulater and funtion
  // function in turm takes two arguments - accumulater and list item
  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft( List[A]()) {(r,h)=>h::r}

  def main(args: Array[String]) {
    val ls: List[Int] = List(1, 2, 3, 4, 5)
    println(ls.reverse)
    println(reverseRecursive(ls))
    println(reverseTailRecursive(ls))
    println(reverseFunctional(ls))

  }
}