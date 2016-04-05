package week6

object sets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val set1 = Set(1,2,3,4,5,6)                     //> set1  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  // diff from sequences = no duplicates, no order of storing elements
  
  val set2 = (1 to 6).toSet                       //> set2  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  
  // toSet is an operator that converts a sequence to a set
  
  set2 map (_ + 2)                                //> res0: scala.collection.immutable.Set[Int] = Set(5, 6, 7, 3, 8, 4)
  
  
}