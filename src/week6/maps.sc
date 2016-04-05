package week6

object maps {

  // Empty hash table whose keys are strings and values are integers
  var emptyMap: Map[Char, Int] = Map()            //> emptyMap  : Map[Char,Int] = Map()
  emptyMap += ('C' -> 3)

  // A map with keys and values
  val alphabets = Map("A" -> 1, "B" -> 2)         //> alphabets  : scala.collection.immutable.Map[String,Int] = Map(A -> 1, B -> 2
                                                  //| )

	alphabets("A")                            //> res0: Int = 1
	alphabets get "a"                         //> res1: Option[Int] = None
  println("keys in colours: " + alphabets.keys)   //> keys in colours: Set(A, B)
  println("values in colours: " + alphabets.values)
                                                  //> values in colours: MapLike(1, 2)

  println("is alphabets map empty ? " + alphabets.isEmpty)
                                                  //> is alphabets map empty ? false

  // concatenate map1 ++ map2 ++ map3

  // print map
  alphabets.keys.foreach { i =>
    print("key=" + i)
    println(" Value= " + alphabets(i))
  }                                               //> key=A Value= 1
                                                  //| key=B Value= 2

	if(alphabets.contains("B")){
		println("contains B")
	}else{
		println("does not contain B")
	}                                         //> contains B

	// Option type is retuned by get
	// since option are defined as case classes, they can be decomposed
	// using pattern matching
	
	// gives integer associated with alphabet
	def give(alpha: String) = alphabets.get(alpha) match {
		case Some(int) => int
		case None => "no such key in map"
	}                                         //> give: (alpha: String)Any
	
	give("A")                                 //> res2: Any = 1
}