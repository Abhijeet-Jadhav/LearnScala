package Week2

object rationals {
  val x = new Rational(1,3)                       //> x  : Week2.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : Week2.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : Week2.Rational = 3/2
  x.add(y)                                        //> res0: Week2.Rational = 22/21
  
  x.neg                                           //> res1: Week2.Rational = 1/-3
  
  y.add(y)                                        //> res2: Week2.Rational = 10/7
  x.less(y)                                       //> res3: Boolean = true
  x.max(y)                                        //> res4: Week2.Rational = 5/7
  
  //val strange = new Rational(1,0)
  //strange.add(strange)
  
  new Rational(2)                                 //> res5: Week2.Rational = 2/1
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