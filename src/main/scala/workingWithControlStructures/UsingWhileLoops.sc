// while loop checks condition first before exiting the code in the loop
// in parenthesis define the condition
// code in the curly braces is executed as long as condition applied is true
// if condition fails - loop breaks - so the code in curly braces no longer applies

var i = 1
while (i <= 10) {
  println(i)
  i = i + 1 // increasing the value of i for each iteration of the loop
}

// can decrement
var i = 10
while (i > 0) {
  println(i)
  i = i - 1 // decreasing the value of i for each iteration of the loop
}

// do by loop
// inside curly braces you define what you want to do each time you iterate through the loop
// after curly braces use while keyword and ()
// which will contain the condition the loop will execute, as long as condition holds true

// do while loop executes the loop code once before checking the condition
var i = 10
do {
  println(i)
  i = i - 1
} while (i > 0)









