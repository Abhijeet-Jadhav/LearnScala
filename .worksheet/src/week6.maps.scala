package week6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(139); 

  // Empty hash table whose keys are strings and values are integers
  var emptyMap: Map[Char, Int] = Map();System.out.println("""emptyMap  : Map[Char,Int] = """ + $show(emptyMap ));$skip(25); 
  emptyMap += ('C' -> 3);$skip(76); 

  // A map with keys and values
  val alphabets = Map("A" -> 1, "B" -> 2);System.out.println("""alphabets  : scala.collection.immutable.Map[String,Int] = """ + $show(alphabets ));$skip(17); val res$0 = 

	alphabets("A");System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
	alphabets get "a";System.out.println("""res1: Option[Int] = """ + $show(res$1));$skip(48); 
  println("keys in colours: " + alphabets.keys);$skip(52); 
  println("values in colours: " + alphabets.values);$skip(61); 

  println("is alphabets map empty ? " + alphabets.isEmpty);$skip(154); 

  // concatenate map1 ++ map2 ++ map3

  // print map
  alphabets.keys.foreach { i =>
    print("key=" + i)
    println(" Value= " + alphabets(i))
  };$skip(98); 

	if(alphabets.contains("B")){
		println("contains B")
	}else{
		println("does not contain B")
	};$skip(295); 

	// Option type is retuned by get
	// since option are defined as case classes, they can be decomposed
	// using pattern matching
	
	// gives integer associated with alphabet
	def give(alpha: String) = alphabets.get(alpha) match {
		case Some(int) => int
		case None => "no such key in map"
	};System.out.println("""give: (alpha: String)Any""");$skip(13); val res$2 = 
	
	give("A");System.out.println("""res2: Any = """ + $show(res$2))}
}
