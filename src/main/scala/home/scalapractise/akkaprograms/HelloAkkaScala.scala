package home.scalapractise.akkaprograms

import akka.actor.{Actor, ActorSystem, Props}

//Define actor messages
case class WhotoGreet(who:String)

//Define Greater actor
class Greeter extends Actor {
  override def receive: Receive = {
    case WhotoGreet(who) => println(s"Hello $who")
  }
}

object HelloAkkaScala extends App
{

  //create the hello akka actor system
  val system = ActorSystem("Hello-Akka")
  // create the greeter actor
  val greeter = system.actorOf(Props[Greeter],"greeter")
  // send whoose to greet message actors
  println(greeter.getClass.getName)
  greeter ! WhotoGreet("Welocm Apritam for Akka")
  system.terminate()
}
