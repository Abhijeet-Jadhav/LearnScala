package week7
/*
Extractor -
An extractor extracts the parameters from which an object passed to it was created.

Unapply method -
The method that needs to be implemented by an object in order for it to be an extractor.


*/
object Extractors {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
	trait User {
		def name: String
	}
	
	class FreeUser(val name:String) extends User
	class PremiumUser(val name:String) extends User
	
	// companion objects of FreeUser and PremiumUser
	// had these classes been 'case class' scala would have implemented these companion objects by itself
	object FreeUser{
	
		// In this case, the extractor is extracting just one parameter from the given object
		// hence the signature of unapply method looks like this
		def unapply(user: FreeUser): Option[String] = Some(user.name)
	}
	
	object PremiumUser{
		def unapply(user: PremiumUser): Option[String] = Some(user.name)
	}
	
	FreeUser.unapply(new FreeUser("Abhijeet"))//> res0: Option[String] = Some(Abhijeet)
	
	//Scala calls an extractor’s unapply method if the extractor is used as an extractor pattern.
	//Let’s use our extractors for pattern matching:

	val user: User = new PremiumUser("Daniel")//> user  : week7.Extractors.User = week7.Extractors$$anonfun$main$1$PremiumUse
                                                  //| r$2@7f63425a
  user match {
  	// checking the type of object and destructuring it at the same time
  	case FreeUser(name) => "Hello " + name
  	case PremiumUser(name) => "Welcome " + name
  }                                               //> res1: String = Welcome Daniel
  
  
  
	
	
	
}