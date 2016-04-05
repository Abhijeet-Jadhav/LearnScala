package Codes
/*
Find the last but one element of a list.
Example:
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5 
 */
object P02 {

  def lib_penultimate[T](ls: List[T]): T = {
    return ls(ls.length-2)
  }
  
  def penultimate[T](ls: List[T]): T = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail) 
    case _  => throw new NoSuchElementException 
    }
  
  def main(args: Array[String]){
    val ls: List[Int] = List(1,2,3,3,4,5,8)
    println(lib_penultimate(ls))
    println(penultimate(ls))
  }
}