package week6

object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
  val set1 = Set(1,2,3,4,5,6);System.out.println("""set1  : scala.collection.immutable.Set[Int] = """ + $show(set1 ));$skip(102); 
  // diff from sequences = no duplicates, no order of storing elements
  
  val set2 = (1 to 6).toSet;System.out.println("""set2  : scala.collection.immutable.Set[Int] = """ + $show(set2 ));$skip(85); val res$0 = 
  
  // toSet is an operator that converts a sequence to a set
  
  set2 map (_ + 2);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0))}
  
  
}
