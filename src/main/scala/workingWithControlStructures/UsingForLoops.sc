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
val amounts2 = Array(10, 24, 35, 23, 12)
for (amount  <- amounts2) {

  sum = sum + amount
}
  println(sum)

// scope - defined at top level in file, inside a function or inside a pair of curly braces
// scopes are nested - means the inner scope can access the enclosing scope
// so can access the variable 'amounts' and amount inside curly braces


// in order to make a for loop an expression - need the yield keyword
val result: Array[Int] = for (amount  <- amounts) yield{
  amount
}


