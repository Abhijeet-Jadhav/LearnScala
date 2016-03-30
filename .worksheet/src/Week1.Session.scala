package Week1

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(42); 
  def abs(x : Double) = if(x<0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(128); 
  
  def sqrtIter(guess: Double, x: Double): Double =
  	if (isGoodEnough(guess, x)) guess
  	else sqrtIter(improve(guess,x),x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(85); 
  	
  def isGoodEnough(guess: Double, x: Double) =
  	abs(guess * guess - x) < 0.001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(71); 
  	
  def improve(guess: Double, x: Double) =
  	(guess + x/guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(44); 
  
  def sqrt(x :Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1))}
  		
}
