package home.scalapractise.two

object PatternMatching_Tutorial extends App {

  case class employee(id: Int, employee_name: String)

  val a = new employee(1,"abc")

  val b  = new employee(2,"xyz")

  val c  = new employee(3,"pqr")

 case class  teacher(name:String,salary:Float)

  val t1= teacher("ram",12000)
  val t2= teacher("rahim",13000)
  val t3 = teacher("robert",11000)
  /*for (employee <- List(a, b, c)) {

    employee match {

      case employee(1, "abc") => println("Hello abc")

      case employee(2, "def") => println("Hello def")

      case employee(id, employee_name) => println("ID: " + id + ", Employee:" + employee_name)

    }  } */
  var list = List(a,t1,b,t2,c,t3)
    list.map( x => x match {
      case employee(id, employee_name) => println("ID: " + id + ", Employee:" + employee_name)
      case teacher(name,sal) => println("name:" + name +", salary :"+ sal)
    }
    )


  println("Step 1: Pattern matching 101 - a very basic example")
  val donutType = "Glazed Donut"
  donutType match {
    case "Glazed Donut" => println("Very tasty")
    case "Plain Donut"  => println("Tasty")
  }



  println("\nStep 2: Pattern matching and return the result")
  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut"  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel")



  println("\nStep 3: Pattern matching using the wildcard operator")
  val tasteLevel2 = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _              => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel2")



  println("\nStep 4: Pattern matching with two or more items on the same condition")
  val tasteLevel3 = donutType match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel3")



  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val tasteLevel4 = donutType match {
    case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel4")



  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int     => "Int"
    case price: Double  => "Double"
    case price: Float   => "Float"
    case price: String  => "String"
    case price: Boolean => "Boolean"
    case price: Char    => "Char"
    case price: Long    => "Long"
  }
  println(s"Donut price type = $priceType")

}
