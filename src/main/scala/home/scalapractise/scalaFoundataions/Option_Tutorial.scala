package home.scalapractise.scalaFoundataions

object Option_Tutorial extends App {

   println("case class createion ")
  case class Address (city: String, state: String, zip: String)
  class User(email: String, password: String) {
    var firstName = None: Option[String]
    var lastName = None: Option[String]
    var address = None: Option[Address]
  }

  val u = new User("al@example.com", "secret")
  u.firstName = Some("Al")
  u.lastName = Some("Alexander")
  u.address = Some(Address("Talkeetna", "AK", "99676"))

  println(s"First Name: ${u.firstName.getOrElse("not assigned")}")
  println(s"Last Name:  ${u.lastName.getOrElse("not assigned")}")

  u.address.foreach { a =>
    println(a.city)
    println(a.state)
    println(a.zip)
  }

  println(s"the values of addres of user = ${u.address.map(m => println(m))}")

  println("Step 1: How to use Option and None - a basic example")
  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  // defining the string array
  val arrayString : Option[Array[String]] = Some(Array("one","two","three"))
  val arrayList : Option[List[String]] = Some(List("one","two","three"))
   //below is the wrong declaration
  //val arrayStringList : Option[Array[String],List[Int]] = Some(Array("one","two","three"),List(1,2,3))
  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")
 // defining and printing the array of strings in some
  println(s"array String = ${arrayString.get.mkString(",")}")


  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")



  println("\nStep 3: How to use Pattern Matching with Option")
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None       => println(s"No donut name was found!")
  }

 arrayString match {
   case Some(array) => println(s"array = ${array.mkString(",")}")
   case None => println(s"this is None")


 }

 arrayList match {
   case Some(list) => println(s"List = ${list.mkString(",")}")

 }
  println("\nTip 1: Filter None using map function")

  println("glazedDonutTaste:::" + glazedDonutTaste)
  println("glazedDonutName:::" + glazedDonutName)

  glazedDonutTaste.map(taste => println(s"glazedDonutTaste = $taste"))
  glazedDonutName.map(name => println(s"glazedDonutName = $name"))

  arrayString.map(v => println(v.mkString(",")))

}
