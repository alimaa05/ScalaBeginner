// 'sumOdd' function has another function within it called 'getOdd'
// 'getOdd' is a local function
def sumOdd(n: Int):Int = {
// create another function called getOdd
  def getOdd(x: Int): Array[Int] = {
    var result = Array[Int]()
    var current = 1
    while (current <= x) {
      if (current % 2 == 1) result = result :+ current
      current = current + 1
    }
    result
  }
  val odds = getOdd(n)
  println(odds.mkString(","))
  odds.sum
}

// call the function here
sumOdd(10)

// if you think your functions can be divided into smaller functions
// and aren't required to be shared outside - consider local functions for clear code




