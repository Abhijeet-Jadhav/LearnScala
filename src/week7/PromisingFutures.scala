package week7
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object PromisingFutures  {
  
  val oneFuture: Future[Int] = Future {
    Thread.sleep(1000)
    1
  }
  
  
  def checkState(): Unit = {  
    
    // isCompleted : Returns whether the future has already been completed with a value or an exception.
    
    println("Before the job finishes")
    Thread.sleep(500)
    println(s"Completed : ${oneFuture.isCompleted}, Value : ${oneFuture.value}")

    println("After the job finishes")
    Thread.sleep(1100)
    println(s"Completed : ${oneFuture.isCompleted}, Value : ${oneFuture.value}")

  }
  
  def main(args: Array[String]){
    checkState()
  }
}