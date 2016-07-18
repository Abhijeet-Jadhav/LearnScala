package week7

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

// Run this program multiple times 
// sometimes Future will completed before "This is last." statement and sometimes after!!
// This implies concurrent execution of the blocks in program using Futures

object FutureTest extends App {
  println("This is first.")
  val f = Future{
    println("Printing in the Future.")    
  }
  Thread.sleep(1)
  println("This is last.")  
  Thread.sleep(100)
}