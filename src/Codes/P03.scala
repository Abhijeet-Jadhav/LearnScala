package Codes
/*
Find the Kth element of a list.
By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*/
object P03 {

  /*def kThElem[T](ls: List[T], k: Int): T = {
    var count = 0

    ls match {
      case h :: tail => {
        if (count == k) h
        else kThElem(tail, k)
      }

      case h :: Nil => Nil
      case _        => throw new NoSuchElementException
    }
    return ls(0)
  }*/

  def lib_kThElem[T](ls: List[T], k: Int): T = {
    if (k >= 0) ls(k)
    else throw new NoSuchElementException
  }

  def kThElem[T](ls: List[T], k: Int): T = (k, ls) match {
    case (0, h :: _)    => h
    case (k, _ :: tail) => kThElem(tail, k - 1)
    case (_, Nil)       => throw new NoSuchElementException
  }

  def main(ert: Array[String]) {
    val ls: List[Int] = List(3, 4, 25, 6, 7, 8)
    println(lib_kThElem(ls, 2))
    println(kThElem(ls, 2))
  }
}