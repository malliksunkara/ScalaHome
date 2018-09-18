package home.scalapractise.akkaprograms

import akka.actor.{Actor,ActorSystem, Props};

class ActorExample extends Actor{
  def receive = {
    case message:String => println("Message received: "+message+ " from - "+ self.path.name);
      println("sender:"+ sender());  // returns ActorRef
  }
}

object ActorExampleTell{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorExample], "RootActor");
    actor ! "Hello"             // Sending message by using !
    actor.tell("Hello",null);  // Sending message by using tell() method
    // Sender is not passed here.
    actorSystem.stop(actor)
  }
}