package week5

object MapDemo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 	
 	// Map work by applying a function to each element in the list
 	
 	val l = List(1,2,3,4,5)                   //> l  : List[Int] = List(1, 2, 3, 4, 5)
 	l.map(x => x*2)                           //> res0: List[Int] = List(2, 4, 6, 8, 10)
 	l.map( x => x*x)                          //> res1: List[Int] = List(1, 4, 9, 16, 25)
 	
 	
}