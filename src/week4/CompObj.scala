package week4

class CompObj {
  def hello = println("hello")
}

object CompObj{
  def hi = println("hi")
}

object main1 extends App{
  var aMain : CompObj = new CompObj()
  println( aMain.hello)
  println(CompObj.hi)
}

