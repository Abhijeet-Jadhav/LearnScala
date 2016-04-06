package Codes
/*
 Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
 */
object P06 {
  
  def builtin_palindrome[A](ls: List[A]): Boolean ={
    if(ls == ls.reverse)
      true
    else
      false
  }
  
  def palindrome[A](ls: List[A]): Boolean = {
    //println("hello")
    val length = ls.length
    var a = 0
    var b = length-1
    for(a <- 1 to 2; b <- 3 to 4 ){
      println("a="+a+" b="+b)
    }
    return true
  }
  
  def main(args: Array[String]){
    val ls = List(1,2,3,2,0)
    println(builtin_palindrome(ls))
    println(palindrome(ls))
  }
  
}