package week5

object MapDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(97); 
 	
 	// Map work by applying a function to each element in the list
 	
 	val l = List(1,2,3,4,5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(18); val res$0 = 
 	l.map(x => x*2);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(19); val res$1 = 
 	l.map( x => x*x);System.out.println("""res1: List[Int] = """ + $show(res$1))}
 	
 	
}
