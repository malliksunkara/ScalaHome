package home.scalapractise.akkaprograms

import akka.actor.{Actor,ActorSystem, Props};

class ActorExample1 extends Actor{
  def receive = {
    case message:String => println("Message received: "+message+ " from - "+ self.path.name);
      println("Sender: "+sender())
      var child = context.actorOf(Props[Actor2], "ChildActor");
      child ! "Hello"


  }
}

class Actor2 extends Actor{
  def receive = {
    case message:String => println("Message received: "+message+ " from - "+ self.path.name);
      println("Sender: "+sender());
  }
}

object ActorExampleTell2{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample1], "RootActor");
    actor ! "Hello"
  }
}