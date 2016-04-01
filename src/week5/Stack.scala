package week5

// http://docs.scala-lang.org/tutorials/tour/generic-classes.html

// Class Stack model mutable stacks of an type T
// The type paramaeters enforces that only legal elements are pushed onto stack
//

class Stack[T] {
  
  //scala has built in support for parameterized types
  //useful for development of collection classes
  var elems: List[T] = Nil

  // :: cons is short construct
  // A :: B means create a new list with A before B, where B can be list
  // item or a list itself
  // all opertors that end in : are right associative in scala
  
  def push(x: T) {elems = x :: elems}
  
  def top: T = elems.head
  
  def pop() {elems = elems.tail}
 
}

object GenericsTest extends App{
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')
  println(stack.top)
  stack.pop()
  println(stack.top)
}


