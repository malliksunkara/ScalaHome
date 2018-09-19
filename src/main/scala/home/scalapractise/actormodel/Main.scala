package home.scalapractise.actormodel

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position

case class HelloActor(myName: String) extends Actor {
  def receive = {
    case "hello" => println(s"hello from ${myName}")
    case _ => println(s"no hello from${myName}")

  }
  override def postStop(){
    super.postStop();
    println("postStop method is called");
  }
}

object Main extends App {

  // an actor needs an ActorSystem
  val system = ActorSystem("HelloSystem")
  // create and start the actor
  /*val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  //above statment for actor message without any argument
  // send the actor two messages
  helloActor ! "hello"
  helloActor ! "buenos dias" */
  // shut down the system

  val helloActor1 = system.actorOf(Props(HelloActor("Mallik")), name = "helloactor")
  //above statemetn with actor with multiple arguments
  //similarly we can have multiple arguments

  helloActor1 ! "hello"
  helloActor1 ! "something else"






}
