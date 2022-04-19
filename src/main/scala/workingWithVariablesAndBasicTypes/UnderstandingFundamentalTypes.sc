 val aInt = 5

 val aDouble = 3.2

 // f at the end represents a single precision 32-bit floating-point number
 val aFloat = 1.3f

//  create long by appending capital L at the end
 val aLong = 199L

 val anotherLong = 1999

 val aChar = 'a'

 val aShort = 120

 val aByte = 1

// non-numeric types

//Unit type
 val aUnit = ()  // has one value and is represented by opening and closing parenthesis
 // the Unit type is usually used in functions to represent the absence of return value

// Boolean - has two values true and false

 val aFalse = false
 val aTrue = true

 // Examples of AnyRef type

/* Array inherits from AnyRef
  creating an instance of array
 */

 var arr = Array(1,2) // all the values in an array much be of the same type

 // getting a value by specific index
 // call on the variable then in parenthesis call on the position the index is in
 // if you try call for an index larger than an array you get a out of bounds exception
 println(arr(0))

 // Null type
// lowercase null is the only instance value it can have

 val aNull = null

// Nothing type
 // at the bottom of every type
 // there is no existing instance for this type
 // benefit is to use it as a return type when computation doesn't happen normally
 // i.e. signal failures
 // can be used for methods like exit and error

 // Converting a value of one type to another

 val aShort = 128
 // create variable Int and assign it a value of type Short
 val anInt: Int = aShort
 // but it wouldn't work the other way around
// val aShortFromInt: Short = anInt