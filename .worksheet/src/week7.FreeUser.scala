package week7
/*
Extractor -
An extractor extracts the parameters from which an object passed to it was created.

Unapply method -
The method that needs to be implemented by an object in order for it to be an extractor.


*/

trait user {
	def name: String
}

class FreeUser(val name:String) extends user
class PremiumUser(val name:String) extends user

object FreeUser{
	
}


object Extractors {
  println("Welcome to the Scala worksheet")
}
