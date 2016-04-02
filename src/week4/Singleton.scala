package week4

class Singleton {

}
class BaseClass {
  def SomeMethod(): String = "Cool!"
}

object SuperCool extends BaseClass {
  override def SomeMethod(): String = "Super " + super.SomeMethod

  val s = SuperCool

  def howCoolIsIt(arg: SuperCool.type) = arg.SomeMethod
  howCoolIsIt(s) //Returns the string "Super Cool!"
}
//Not allowed: object SomeOtherObj extends SuperCool
//Not allowed: object SomeOtherObj extends SuperCool.type
