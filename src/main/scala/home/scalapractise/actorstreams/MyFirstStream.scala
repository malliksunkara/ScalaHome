package home.scalapractise.actorstreams

import akka.actor.ActorSystem
import akka.stream.{ActorMaterializer}
import scala.concurrent.Future
import akka.stream.scaladsl._

object MyFirstStream {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("MyActorSystem")
    //ActorMaterializer is responsible for creating actors that will eventually run the processing flow and it requires ActorSystem to be available implicitly.
    implicit val materializer = ActorMaterializer()

    val source = Source(1 to 10)
    val sink = Sink.fold[Int, Int](0)(_ + _)

    // connect the Source to the Sink, obtaining a RunnableGraph
    val runnable: RunnableGraph[Future[Int]] = source.toMat(sink)(Keep.right)

    // materialize the flow and get the value of the FoldSink
    val sum: Future[Int] = runnable.run()

    println(sum)

  }

}
