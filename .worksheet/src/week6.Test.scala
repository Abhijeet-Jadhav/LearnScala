package week6

object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(44); 
  
  val arr: Array[Int] = Array(1,2,3,344);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(21); val res$0 = 
  arr map (x => x*x);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(37); 
  
  val str: String = "Hello World";System.out.println("""str  : String = """ + $show(str ));$skip(30); val res$1 = 
  str filter (c => c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(33); val res$2 = 
  
  str exists (c => c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(30); val res$3 = 
  str forall (c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(37); 
  
  val pairs = List(1,2,3) zip str;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$4 = 
  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(34); val res$5 = 
  
  str flatMap (c=>List('.',c));System.out.println("""res5: String = """ + $show(res$5));$skip(13); val res$6 = 
  
  arr.sum;System.out.println("""res6: Int = """ + $show(res$6));$skip(10); val res$7 = 
  arr.max;System.out.println("""res7: Int = """ + $show(res$7))}
}
