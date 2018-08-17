package home.scalapractise.functions

object CreateAndUseFunction_Tutorial1 extends App {


  println("Step 1: How to define and use a function which has a return type")
  def favoriteDonut(): String = {
    "Glazed Donut"
  }


  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")



  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavoriteDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavoriteDonut")



  println("\nStep 3: How to define and use a function with no return type")
  def printDonutSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }
  printDonutSalesReport()



  println("\nStep 4: Use type inference to define function with no return type")
  def printReport {
    // lookup sales data in database and create some report
    println("Printing donut report... done!")
  }
  printReport

  // these are the following ways we can define the functions in scala

  // "normal" method definition
  def add1(a: Int, b: Int) = a + b

  // same method, but with the return type declared
  def add2(a: Int, b: Int): Int = a + b

  // define the method body in a block (in curly braces)
  def add3(a: Int, b: Int): Int = {
    a + b
  }

   println("add1" + add1(2,3) + "add2" + add2(4,5) + "add3" + add3(5,6))

  //following is the error we can't change the parameters since they are val
  //def change(a: Int, b: Int ) = { a=3, b =4}


}
