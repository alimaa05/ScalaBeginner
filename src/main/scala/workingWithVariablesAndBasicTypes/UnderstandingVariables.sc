// don't need to explicitly say the data type for most cases
var number_1: Int = 10
// here scala has automatically inferred the type as integer
var number_2 = 20

// here nothing is printed back related to its value
// says we mutated it
number_1 = -30
// we have now assigned a diff value
// var allows us to assign diff value at a later time
println(number_1)

// now using val
val number_3: Int = 45
// this will throw an error because we are typing to reassign a value with the val keyword
//number_3 = 65

// var allows reassignment of variable at a later time, val does not
// best default is to use var at all times
// its common to want to change the value of variables

/**
 * testing
 * multiline comments
 */

// Escape character in string sequences

var aString = "He said"
// wont be able to read this - quoting a text within string
//var aString = "He said - "I am good, how are you?""

// need to tell scala that the code before I... is also part of the value

// need to show this quote is an escape character - so scala doesn't treat this code as the end of the string
// need to add backslash before the code and at the end
var aString = "He said - \"I am good, how are you?\""