package home.scalapractise.two

object VariablesBasics_Tutorial extends App {

  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5

//    donutsToBuy = 10 // you will get compile error because donutToBuy is immutable



  println("\nStep 2: Mutable variable")
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"



  println("\nStep 3: lazy initialization")
  lazy val donutService = "initialize some donut service"

  println("\n what is lazy")

  val e = {
    println("string evaluation")
    9
  }
  lazy val l = {
    println("lazy evaluation")
    9
  }


  println("\nStep 4: Scala Types")
  val donutsBought: Int = 5

  val bigNumberOfDonuts: Long = 100000000L

  val smallNumberOfDonuts: Short = 1

  val priceOfDonut: Double = 2.50

  val donutPrice: Float = 2.50f

  val donutStoreName: String = "Allaboutscala Donut Store"

  val donutByte: Byte = 0xa

  val donutFirstLetter: Char = 'D'

  val nothing: Unit = ()




  println("\nStep 5: Declare a variable without initialization")
  var leastFavoriteDonut: String = _

  leastFavoriteDonut = "Plain Donut"

}
