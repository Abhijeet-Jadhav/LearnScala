package week4

// trait with type parameter
trait List[T] {

  //method to determine whether the lsit is cons cell or empty list
  def isEmpty: Boolean

  // non-empty list's first element
  def head: T

  // reference to remainder of list
  def tail: List[T]

}

// implementation
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object List {
  // List(1,2) = List.apply(1,2)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))

  // empty list
  def apply[T]() = new Nil

}

object nth {
  // function nth input int n and List l returns n'th element of lsit l
  def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }

  //define list 1,2,3
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  def main(args: Array[String]) =
    println(nth(2, list))
  //println(nth(-1,list))
}










