package home.scalapractise.akkaprograms

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem

class LifeCyleMethodsExample extends Actor{
  def receive = {
    case msg:String => println(msg+" "+self.path.name);  // Getting name of Actor
  }
  override def postStop(){    // Overriding postStop method
    println("postStop method is called");
  }
  override def preStart(){    // overriding preStart method
    println("preStart method is called");
  }

  var a:Int =  10/0;      // ArithmethicException occurred

override def preRestart(reason:Throwable, message: Option[Any]){    // Overriding preRestart method
println("preRestart method is called");
println("Reason: "+reason)
}
  override def postRestart(reason:Throwable){    // Overriding preRestart method
    println("postRestart method is called");
    println("Reason: "+reason)
  }
}

object ActorMainPostPre
{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[LifeCyleMethodsExample],"RootActor");
    actor ! "Hello"

    println("stopping Actor");
    actorSystem.stop(actor);      // Stopping Actor by passing actor reference.
  }
}
