package week5

object ImplicitDemo {
  
  //implicit val multiplier = 2
  implicit def f: Int = 4
  
  
  def multiply(implicit by:Int) = 3 * by
  
  def main(args: Array[String]){
    println(multiply)
  }
}