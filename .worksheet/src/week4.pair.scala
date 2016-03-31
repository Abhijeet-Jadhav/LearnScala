package week4

object pair {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(27); 
  val pair = ("answer",42);System.out.println("""pair  : (String, Int) = """ + $show(pair ));$skip(28); 
  val (label, value) = pair;System.out.println("""label  : String = """ + $show(label ));System.out.println("""value  : Int = """ + $show(value ))}
}
