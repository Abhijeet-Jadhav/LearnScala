package week6

object forLoop {
  
  val ls: List[Int] = List(1,2,4,4,65) 
  for (i <- 0 until ls.length)
    print(ls(i)+" ")
  
  println(ls.filter { x => x >=4 })  
    
  def main(args: Array[String]){
    
  }
}