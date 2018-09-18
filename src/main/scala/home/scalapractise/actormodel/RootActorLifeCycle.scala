package home.scalapractise.actormodel

import akka.actor.{ActorSystem, Props,Actor}
class RootActor3 extends Actor{
  def receive = {
    case msg => println("Message received: "+msg);
      10/0;
  }
  override def preStart(){
    super.preStart();
    println("preStart method is called");
  }
  override def postStop(){
    super.postStop();
    println("postStop method is called");
  }
  override def preRestart(reason:Throwable, message: Option[Any]){
    super.preRestart(reason, message);
    println("preRestart method is called");
    println("Reason: "+reason);
  }
  override def postRestart(reason:Throwable){
    super.postRestart(reason);
    println("postRestart is called");
    println("Reason: "+reason);
  }
}
object RootActorLifeCycle {
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[LifeCyleMethodsExample],"RootActor");
    actor ! "Hello"


  }

}
