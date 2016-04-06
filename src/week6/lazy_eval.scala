package week6

object lazy_eval {
  
  def main(args: Array[String]){
    
    val x = {println("foo") ; 10}
    println("bar")
    print(x)
    
    println("--")
    lazy val y = {println("foo"); 10}
    println("bar")
    print(y)
  }
}