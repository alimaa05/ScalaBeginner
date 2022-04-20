// extracting data from pattern matching

val anArray = Array(734, 285, 425)

// perform pattern match on array variable

// extracting the data out of an array directly
// when code is evaluated the numbers from array are mapped to the variables in case statement
anArray match {
  // created shape of an array in the case matching the array declared in like 3
  // instead of hard coding the numbers, three variable names created
  case Array(first, second, third) => println("second= " + second) // can print any of the variables that have been instantiated on the left-hand side
  // currently variables 'first' and 'third' are not being declared, but had to write something to keep the structure of the array the same as line 3
  // instead of creating variable in these places can use an underscore to replace them
  // e.g case Array(_, second, _) => println("second= " + second) - retrains the shape but doesn't create a new variable that's not needed

}


// another example using Tuple
// a collection like an array - but doesn't require to add the elements of the same type like arrays

// creating variable with two different types
val aTuple = ("NZD", 100)

// to initialise a tuple - add values in parenthesis, separated by comma
// with tuples you can access respective values using their positions
println(aTuple._1)

// to perform pattern matches on tuples - use same match keyword (similar to array example)
aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount) //adding guard to allow USD currency and on right printing the amount with currency
  case (currency, amount) if currency == "NZD" => println("NZD " + amount * (1/1.50))
}


