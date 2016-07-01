package week6

/*
 *  for-yield construct
for each iteration of the loop, the yield generates a value which will be remembered in a buffer, 
basically a buffer is nothing but a new collection created of the same type as the collection over which the loop is iterated.
 * */

object ForYield extends App {
  
  
  val collection = for (i <- 1 to 5) yield i
  print(collection) //Vector(1, 2, 3, 4, 5)
  
  
  
  
  
  
}