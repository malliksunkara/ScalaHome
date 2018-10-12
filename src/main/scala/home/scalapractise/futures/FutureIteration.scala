package home.scalapractise.futures

import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureIteration extends App {

   val futureA = Future("hi" + "hello")
   val futureB = Future("hru" + "doing")

   val finalFuture : Future[String] = for {
     a <- futureA
     b <- futureB
   } yield  a+b

   println("the  Future result is" + Await.result(finalFuture,10 seconds))

}
