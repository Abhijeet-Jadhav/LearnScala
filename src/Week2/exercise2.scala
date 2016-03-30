package Week2

object exercise2 extends App{
  
  def sumInts(a: Int, b:Int) : Int = {
    if(a>b) 0 else a + sumInts(a+1,b)
  }
    
    
  val a = sumInts(1,10)
  
  println(a)
  
}