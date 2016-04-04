package week6

object pairs {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def isPrime(n:Int) = (2 until n) forall (n % _ != 0)
                                                  //> isPrime: (n: Int)Boolean
	
  val n = 6                                       //> n  : Int = 6
  (1 until n) flatMap (i =>
   (1 until i) map (j => (i, j))) filter (pair =>
   	isPrime(pair._1 + pair._2))               //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2))
  
                                                  
	// higher-order functions like map, flatMap and filter
	// provide powerful constructs for manipulating lists but are difficult to understand

	/*
	use 'for' expression
	for (s) yield e
	for {s} yield e
	
	s - sequence of generators and filters
	e - expression whose value is returned by an iteration
	
	generator:  p <- e
							p pattern
							e expression whose value is collection
	
	filter: if (f)
	
	*/
	
	for {
		i <- 1 until n
		j <- 1 until i
		if isPrime(i+j)
	} yield (i,j)                             //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2))
}