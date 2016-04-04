package week6

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(44); 
  
  val arr: Array[Int] = Array(1,2,3,344);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(21); val res$0 = 
  arr map (x => x*x);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(37); 
  
  val str: String = "Hello World";System.out.println("""str  : String = """ + $show(str ));$skip(30); val res$1 = 
  str filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1))}
  
}
