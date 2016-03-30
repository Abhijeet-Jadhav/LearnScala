package Week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : Week2.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : Week2.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : Week2.Rational = """ + $show(z ));$skip(11); val res$0 = 
  x.add(y);System.out.println("""res0: Week2.Rational = """ + $show(res$0));$skip(11); val res$1 = 
  
  x.neg;System.out.println("""res1: Week2.Rational = """ + $show(res$1));$skip(14); val res$2 = 
  
  y.add(y);System.out.println("""res2: Week2.Rational = """ + $show(res$2));$skip(12); val res$3 = 
  x.less(y);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(11); val res$4 = 
  x.max(y);System.out.println("""res4: Week2.Rational = """ + $show(res$4));$skip(85); val res$5 = 
  
  //val strange = new Rational(1,0)
  //strange.add(strange)
  
  new Rational(2);System.out.println("""res5: Week2.Rational = """ + $show(res$5))}
}

class Rational(x:Int, y:Int){
	require(y !=0 , "denominator must be nonzero")

	// this is second constructor of the class calling primary constructor
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int, b:Int) : Int = if(b==0) a else gcd(b,a%b)
	
	val numer = x
	val denom = y
	
	def less(that: Rational ) = numer * that.denom < that.numer * denom
	
	def max(that: Rational) = if( this.less(that)) that else this
	
	def add(that: Rational) =
		new Rational (
			numer * that.denom + that.numer * denom,
			denom*that.denom)
			
	override def toString = {
		val g = gcd(numer,denom)
		numer/g + "/" + denom/g
		}
	
	def neg =	new Rational(-numer,denom)
	
	def sub(that: Rational) = add(that.neg)
}
