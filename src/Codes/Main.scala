package Codes

object Main extends App {
  val lineIt = scala.io.Source.fromInputStream(System.in).getLines()
  println(s"\n$lineIt.next()")
  val n = lineIt.next().toInt
  println(s"n = $n")
  for (i <- 1 to n) {
    val cts = Array(0, 0, 0)
    val len = lineIt.next().toInt
    lineIt.next().toCharArray.foreach(x => x match {
      case 'R' => cts(0) += 1
      case 'G' => cts(1) += 1
      case _   => cts(2) += 1
    })
    println(len - cts.max)
  }
}