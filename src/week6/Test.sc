package week6

object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val arr: Array[Int] = Array(1,2,3,344)          //> arr  : Array[Int] = Array(1, 2, 3, 344)
  arr map (x => x*x)                              //> res0: Array[Int] = Array(1, 4, 9, 118336)
  
  val str: String = "Hello World"                 //> str  : String = Hello World
  str filter (c => c.isUpper)                     //> res1: String = HW
  
  str exists (c => c.isUpper)                     //> res2: Boolean = true
  str forall (c => c.isUpper)                     //> res3: Boolean = false
  
  val pairs = List(1,2,3) zip str                 //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
  
  str flatMap (c=>List('.',c))                    //> res5: String = .H.e.l.l.o. .W.o.r.l.d
  
  arr.sum                                         //> res6: Int = 350
  arr.max                                         //> res7: Int = 344
}