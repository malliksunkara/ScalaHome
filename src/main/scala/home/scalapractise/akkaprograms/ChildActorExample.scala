package home.scalapractise.akkaprograms

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem



class RootActor extends Actor{
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
    var actor = actorSystem.actorOf(Props[RootActor],"RootActor");
    actor ! "Hello"
  }
}