package home.scalapractise.actormodel

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem



class RootActor1 extends Actor{
  def receive = {
    case msg:String => println(msg+" "+self.path.name);
      var childActor =  context.actorOf(Props[Child],"Child");
      childActor ! "Hello"
  }
}
class Child extends Actor{
  def receive = {
    case msg:String => println(msg+" "+self.path.name);
  }
}
object ChildActorExample{
  def main(args:Array[String]){
    var actorSystem = ActorSystem();
    var actor = actorSystem.actorOf(Props[RootActor1],"RootActor");
    actor ! "Hello"
  }
}