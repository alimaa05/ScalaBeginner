var amount = 100

// remove code duplication
// replace hardcoded number in the case with a variable

// use guards - start with case statement and variable
// we use variables with guards to achieve our pattern matching and remove hard-coded literal patterns in matching
// between arrow symbol and variable you add the guards
amount match {

//  case a if a >= 50 => println("bill is >= 50, it's " + a) // this first case is still true hence why it would be returned
    case a if a == 50 => println("bill is == 50")
  // add another case statement to match against 100
  case a if a == 100 => println("bill is £100")
  case a => println("The amount is " + a) // no checking is performed - this will match everything everytime
}

// use variable pattern matching because it allows you to reuse the variable alter in the code execution


// pattern matching as expression
// means you can use pattern matching for more computations and save the results to variable to use further
// it can ease the testing process as every component being an expression returns a value and you can test against an expected value

// add the result of match expression to variable called result
val result: String = amount match {
  case a if a == 50 => "bill is == 50"
  case a if a == 100 =>"bill is £100"
  case a => "The amount is " + a
}
