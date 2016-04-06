package Codes
/*
 Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object P08 {

  //standard recursive
  def removeDup[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: removeDup(tail.dropWhile { _ == h })
  }

  // tail recursive
  def removeDupTailRec[A](ls: List[A]): List[A] = {
    def compress(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compress(h :: result, tail.dropWhile { _ == h })
      case Nil       => result.reverse
    }
    compress(Nil, ls)
  }

  def removeDupFunctional[A](ls: List[A]): List[A] = {
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }
  }

  def main(args: Array[String]) {
    val ls: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(removeDup(ls))
    println(removeDupTailRec(ls))
    println(removeDupFunctional(ls))

    val nums: List[Char] = List('a', 'b', 'c', 'd', 'e')
    println(nums.foldRight(List[Char]())((acc, last) => acc :: last))
    println(nums.foldLeft(List[Char]())((acc, last) => last :: acc))
  }
}