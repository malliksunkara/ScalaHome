package com.allaboutscala.chapter.two.tutorial_12


/*The superclass of all classes scala.Any has two direct subclasses scala.AnyVal and scala.AnyRef representing two different
class worlds: value classes and reference classes. All value classes are predefined; they correspond to the primitive types of Java-like
languages. All other classes define reference types. User-defined classes define reference types by default; i.e. they always (indirectly)
subclass scala.AnyRef. Every user-defined class in Scala implicitly extends the trait scala.ScalaObject.
 Classes from the infrastructure on which Scala is running (e.g. the Java runtime environment) do not extend scala.ScalaObject.
  If Scala is used in the context of a Java runtime environment, then scala.AnyRef corresponds to java.lang.Object.

 */

object TypeHierarchy_Tutorial extends App {


  println("Step 1: Declare a variable of type Any")
  val favoriteDonut: Any = "Glazed Donut"
  println("the type of favoriteDonut type" +  favoriteDonut.getClass.getTypeName)
  println("the class of favoriteDonut type" + favoriteDonut.getClass.getName)

  println(s"favoriteDonut of type Any = $favoriteDonut")


  println("Step 1: Declare a variable of type Any in var")
  var favoriteDonut_var: Any = _

  favoriteDonut_var = "Glazed Donut var"


  var variableone : Any = ()

  println("variableone value" + variableone)

  var variabletwo : String = "one"

   variableone = "hello"

  println("variable one " + variableone)
  variableone = variabletwo




  println("the type of favoriteDonut type" +  favoriteDonut_var.getClass.getTypeName)
  println("the class of favoriteDonut type" + favoriteDonut_var.getClass.getName)

  println("the type of favoriteDonut type" +  favoriteDonut_var.getClass.getTypeName)
  println("the class of favoriteDonut type" + favoriteDonut_var.getClass.getName)
  println(s"favoriteDonut of type Any = $favoriteDonut_var")




  println("\nStep 2: Declare a variable of type AnyRef")
  val donutName: AnyRef = "Glazed Donut"
  println(s"donutName of type AnyRef = $donutName")



  println("\nStep 3: Declare a variable of type AnyVal")
  val donutPrice: AnyVal = 2.50
  println(s"donutPrice of type AnyVal = $donutPrice")
  

}
