
def square(n:Int): Int = n * n // (Int) => (input type and output type separated by arrow) Int
// (Int) => Int --> type of the function

def cube(n: Int): Int = n * n * n // Int => Int = function type

def sum(a:Int, b: Int):Int = a + b // (Int, Int) => Int

// input and output types won't always be the same
def length(a: String): Int = a.length // String => Int

// higher order function

// first parameter to this transform function is another function called f
// add a function type to f
// adding another parameter called numbers and its a varargs of type Int

// transform is a higher order function bec it takes another function as input
// map is also a higher order function bec it takes one input which is a function signature
// map function transform a value of type A to type B e.g. a String to Int
def transform (f: Int => Int, numbers: Int*)= numbers.map(f)

// map iterates on numbers and for each element it provides that element to function f
// function f takes the input and returns the output
// map function collects the output and returns the result with transform type, but using same container, in this example, a sequence
// hence scala compiler inferred the return type as sequence of Int - sequence bec of the container and Int bec of the function f returns Int

// calling the function
// providing the function as a value - ability to pass function as other data types is called 'function as first-class citizens'
transform(square, 1,2,3,4)
transform(cube, 1,2,3,4)

// creating function first before passing it as argument might not always be good
// might want to use a function once so keeping it in a  variable isn't useful
// in such cases, can write function implementation in place of the argument without creating a variable for it

transform((n: Int) => n * n, 1,2,3)
// input followed by arrow followed by function implementation
// another way to write functions
// called function literal - bec we give the literal implementation of function in arguments
// also known as anonymous function as theres no name for the function and can't use it anywhere by referring to it

// scala knows what type it expects so can even remove the type
// and it only takes one Int so don't need the extra parenthesis
transform(n => n * n * n, 1,2,3)


val numbers = Array(965, 245, 196, 555, 910)
numbers.map(number => number * 2)
// another higher order function called filter
// takes a number and returns a boolean
// it executes the function in the argument - collects the number for which the function returns true
numbers.filter(num => num % 2 == 0)
