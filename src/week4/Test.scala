package week4

object Test {
  def main(args: Array[String]) {
    val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil
    val fruit2 = List("mangoes", "grapes")

    // concatenation
    //val fruit = fruit1 ::: fruit2;
    //val fruit = fruit1.:::(fruit2)
    val fruit = List.concat(fruit1, fruit2)

    println("Head of fruit : " + fruit1.head)
    println("Tail of fruit : " + fruit1.tail)
    println("Check if fruit is empty : " + fruit1.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    println(fruit.length)
    println(fruit.last)
    println(fruit.init)
    println(fruit.length)
    println(fruit.take(2))
    println(fruit.drop(1))
    println(fruit.length)
    println(fruit(2))
    println(fruit.length)
    
  }
}