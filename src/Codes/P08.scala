package Codes
/*
 Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object P08 {

  def removeDupFunctional[A](ls: List[A]): List[A] = {
    
    val xs: List[A] = ls.foldLeft(List[A]())( (i,j) => {
      if(i.last != j) 
        j :: i
      else 
        i
    })
    
    return xs
  }

  def main(args: Array[String]) {
    val ls: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    //println(removeDup(ls))
    //println(removeDupTailRec(ls))
    println(removeDupFunctional(ls))

  }
}