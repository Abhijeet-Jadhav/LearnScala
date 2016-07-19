package week7
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Success, Failure}


class PromisingFutures{
  
  val oneFuture: Future[Int] = Future {
    Thread.sleep(1000)
    1
  }
  
  val oneDangerousFuture=Future{
    Thread.sleep(2000)
    throw new SomeComputationException("Welcome to the Dark side !")
  }

  case class SomeComputationException(msg: String) extends Exception(msg)
  
  def printFuture[T](future: Future[T]): Unit = future.onComplete {  
    case Success(result) => println(s"Success $result")
    case Failure(throwable) => println(s"Failure $throwable")
  }
  
}
object PromisingFutures  {
  
  
  
  /*def checkState(): Unit = {  
    
    // isCompleted : Returns whether the future has already been completed with a value or an exception.
    
    println("Before the job finishes")
    Thread.sleep(500)
    println(s"Completed : ${oneFuture.isCompleted}, Value : ${oneFuture.value}")

    println("After the job finishes")
    Thread.sleep(1100)
    println(s"Completed : ${oneFuture.isCompleted}, Value : ${oneFuture.value}")

  }*/
  
  
  def main(args: Array[String]){
    //checkState()
    
    val promisingFutures=new PromisingFutures
    promisingFutures.printFuture(promisingFutures.oneFuture)
    promisingFutures.printFuture(promisingFutures.oneDangerousFuture)

    synchronized(wait(3000))
  }
}