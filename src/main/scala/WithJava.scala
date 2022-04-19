import java.util
import scala.jdk.CollectionConverters._

object WithJava extends App{

  // creating variable with type java list of integers
  // initialise this by calling Arrays.asList method from util package
  // number 1-4 as values
  val numbersInJava: util.List[Int] = util.Arrays.asList(1,2,3,4)
//  val numbersScala: scala.collection.mutable.Buffer[Int] = numbersScala.asScala

//  numbersScala.foreach(number => println(number))
}
