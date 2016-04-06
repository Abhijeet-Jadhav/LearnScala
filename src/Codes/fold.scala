package Codes
// fold, foldLeft, foldRight

object fold {
  
  val sentence = List("Mary","had","a","little","lamb")
  println(sentence.foldLeft("start")( (a,b) => a+b))
  
  println(sentence.foldLeft("start")((a,b) =>{
    println("[a:"+a+"] [b:"+b+"]");
    a+b
  }))
  
  /*println("\nfoldRight")
  println(sentence.foldRight("start")((a,b) =>{
    println("[a:"+a+"] [b:"+b+"]");
    a+b
  }))*/
  
  /*println(sentence.foldRight("start")((b,a) =>{
    println("[a:"+a+"] [b:"+b+"]");
    a+b
  }))*/
  
  println("\n")
  val str= List("A","B","C")
  println(str.foldLeft("Z")( (i,j) => i+j  )) // ZABC
  println(str.foldLeft("Z")( (i,j) => j+i  )) // CBAZ
  println(str.foldRight("Z")( (i,j) => i+j  )) // ABCZ
  println(str.foldRight("Z")( (i,j) => j+i  )) //ZCBA
  
  println("\nfoldRight")
  println(str.foldRight("Z")((i,j) =>{
    println("[i:"+i+"] [j:"+j+"]");
    i+j
  }))
  
  def main(args: Array[String]){
    
  }
  
}