def square (x: Int): Int = {
  // where the function implementation will reside
  x * x
} // this is a complete function
// variable x is created inside the function so scope ends when function evaluation is complete


// to call the function - write name of function and in parenthesis give a value

val sq_2 = square(2) // input to a function is called arguments BUT when we declare inputs they're known as parameters


//function with more than one input

def multiply( x: Int, y: Int) = x * y
val mul_10_30 = multiply(10,30)

// overload multiply function
def multiply (nums: Int*): Int = { // Int* known as varags
//varags parameter provide the sequence of the type parameter (get sequence of integers)
  var product = 1
  for (num <- nums) product = product * num
  product
}

val mul_10_20_30 = multiply(10,20,30)

