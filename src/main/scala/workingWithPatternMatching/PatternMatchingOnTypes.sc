abstract class Currency // blueprint from which multiple objects can be created
// abstract means this class is blank and contains no implementation

// creating three case classes
// case class in Scala provides many benefits
// like immutable instances, easier instance cloning using copy, automatic generated equals and hash code methods etc.
// all of them inheriting from Currency using extends keyword
case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

// creating instance of type Currency by instantiating NZD case class
// NZD is of type Currency - so can assign an instance of type of Currency
val currency: Currency = NZD() // can change the Currency variable
val amount = 100

// pattern matching on currency variable using match keyword
currency match {
  case u: USD => println("USD " + amount) // if 'u' is of type USD then print USD with amount
  case u: CAD => println("USD " + amount * (1/1.30)) // converting currencies to respective USD amounts
  case u: NZD => println("USD " + amount * (1/1.50))
}



