package week6
// fold, foldLeft, foldRight
/*
fold - takes data in one format and return in another
 
 
 */
class Foo(val name: String, val age: Int, val gender: Symbol) {

  // companion object - same class and object name
  object Foo {

    def apply(name: String, age: Int, gender: Symbol) = new Foo(name, age, gender)

    //val nums = List(1,2,3,4)
    //val sum = nums.fold(0)((z,i)=>z+i)
    //println(sum)
    //def main(args: Array[String]){}

  }

  val fooList = Foo("A", 45, 'male) ::
    Foo("B", 50, 'male) ::
    Foo("C", 55, 'female) ::
    Nil

  //And we want to turn it into a list of strings in the format of [title] [name], [age]
  val stringList = fooList.foldLeft(List[String]()) { (z, f) =>
    val title = f.gender match {
      case 'male   => "Mr."
      case 'female => "Ms."
    }
    z :+ s"$title ${f.name}, ${f.age}"

  }

}





