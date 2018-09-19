package home.scalapractise.actorstreams

import akka.actor.ActorSystem
import akka.stream.{ActorMaterializer}
import scala.concurrent.Future
import akka.stream.scaladsl._

object MyFirstStream {
  def main(args: Array[String]): Unit = {

   // sample 1
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

    //sample 2


    val source1 = Source(0 to 20000000)
    val flow1 = Flow[Int].map(_.toString())
    val sink1 = Sink.foreach[String](println(_))
    val runnable1 = source1.via(flow1).to(sink1)
    val result = runnable1.run()
    println(result)

  }

}
