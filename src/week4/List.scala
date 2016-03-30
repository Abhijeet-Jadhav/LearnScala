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
class cons[T](val)