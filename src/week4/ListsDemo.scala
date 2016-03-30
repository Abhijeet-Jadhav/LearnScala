package week4

object ListsDemo {

  val fruit : List[String] = List("apples", "oranges", "pears");
  val nums : List[Int] = List();
  val matrix: List[List[Int]] = List(List(1,0,0),List(0,1,0),List(0,0,1))
  
  def main(args: Array[String]) {
    println("Lists are immutable, elements of list cannot be changed");
    println("Like arrays, list are homogenous.\nThe type of a list with elements of type T is written List[T]");
    
    println("head of fruit " + fruit.head);
    println("tail of fruit " + fruit.tail);
    println("check if fruit is empty " + fruit.isEmpty);
    println("check is nums is empty " + nums.isEmpty);

  }

}