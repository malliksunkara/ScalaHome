package home.scalapractise.actormodel

import akka.actor.{Actor,ActorSystem, Props};
import akka.util.Timeout;
import scala.concurrent.Await
import akka.pattern.ask
import scala.concurrent.duration._

class ActorExample2 extends Actor{
  def receive = {
    case message:String => println("Message recieved: "+message);
  }
}

object ActorExampleAsk1{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample2], "RootActor");
    implicit val timeout = Timeout(20 seconds);
    //val future = actor ? "Hello";
    val future = actor.ask("hello")
    val result = Await.result(future, timeout.duration);
    println("messages received" + result);
  }
}