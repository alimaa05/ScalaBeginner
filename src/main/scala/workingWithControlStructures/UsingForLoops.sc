// in parenthesis need to provide a generator
// a generator is a way to define an unnamed variable - which is assigned a series of values on each iteration
// generator name can be anything e.g. i

// series of values comes from generator expression - generates series of values
// named variable and generator expression are separated by arrow function

// generator expression can come from anywhere including Array

val amounts = Array(10, 24, 35, 23, 12)
for (amount  <- amounts) { // variable name = amount - generator expression = amounts
  println(amount)
}

// adding all the variables together

var sum = 0
for (amount  <- amounts) {
  sum = sum + amount
}
  println(sum)


// scope - defined at top level in file, inside a function or inside a pair of curly braces
// scopes are nested - means the inner scope can access the enclosing scope
// so can access the variable 'amounts' and amount inside curly braces

// Converting for loops to expressions
// in order to make a for loop an expression - need the yield keyword
// return type is Array[Int] - we're iterating through the numbers and should get all numbers not a one number
val result: Array[Int] = for (amount  <- amounts) yield{
  amount
}

// can iterate on more than one collection - more than one generator for a single loop
// basic structure for for expression when you have more than one generator
val currencies = Array("USD", "NZD")

// first curly braces - add generators - one generator per line
val result: Array[String] = for {
  amount<- amounts
  currency <- currencies
} yield currency + " " + amount

// Guards
// first pair of braces is V useful - can have generators and add conditionals - this is called guards
// acts as a filter
val result: Array[String] = for {
  amount<- amounts
  currency <- currencies
  if amount > 20  //when generator is generating values - code block in curly braces only executes if amount is greater than 20
} yield currency + " " + amount

// can add more conditional expressions using logical 'and' and 'or'
// i.e. && = and
// i.e. || = or

val result: Array[String] = for {
  amount<- amounts
  currency <- currencies
  if amount > 20 && amount < 30
} yield currency + " " + amount

// can put any variable in the conditional and use or to add another condition
val result: Array[String] = for {
  amount<- amounts
  currency <- currencies
  if amount > 20 && (currency == "NZD" || currency == "USD")
} yield currency + " " + amount


// for each statement
// its available as a method of collections like array
// for each is a statement - doesn't yield a value
// uses higher order functions
// here it means that for each iteration we'll receive one element per iteration which needs to be named
amounts.foreach(amount => println(amount * 1000))

// another e.g. of for each is list data structure
List(1,2,3,4).foreach(num => println(num * 20))
