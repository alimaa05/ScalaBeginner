val number = 100


// If conditions
// these are also expressions

// in parenthesis should be an expression and should be of type Boolean
val condition_1: Unit = if (number > 10) {
// if its true to performs this bit
  println("greater than 10")
} else if (number == 10) {
  println("equal to 10")
} else {  // if its false it will do this
 println("less than or equal to 10")
}

// can also write if conditions in one line if there are just one if and else statement
// string is the return value for the conditional 
val condition_2: String = if (number > 10) {
 "greater than 10"
} else if (number == 10) {
  "equal to 10"
} else {
  "less than or equal to 10"
}

