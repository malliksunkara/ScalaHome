package home.scalapractise.futures

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureSample extends App{

  /*
  n practice, if you want to perform some actions like error checking or logging you would take Await.ready(...) if you want to compose the result and throw an error if something goes wrong take Await.result(...).

As rule of thumb - try to avoid Await.
   */
  val future = Future(1+2).mapTo[Int]
  val sum = Await.result(future, 1000 seconds)
  println(s"Future Result $sum")

}
