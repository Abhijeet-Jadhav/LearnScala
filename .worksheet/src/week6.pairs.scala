package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(55); 

	def isPrime(n:Int) = (2 until n) forall (n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(15); 
	
  val n = 6;System.out.println("""n  : Int = """ + $show(n ));$skip(110); val res$0 = 
  (1 until n) flatMap (i =>
   (1 until i) map (j => (i, j))) filter (pair =>
   	isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(542); val res$1 = 
  
                                                  
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
	} yield (i,j);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1))}
}
