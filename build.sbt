//name := "spark"

//version := "0.1"

//scalaVersion := "2.12.6"

lazy val root = (project in file("."))
  .settings(
    name := "Hello",
    scalaVersion := "2.12.6"
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.10",
  "com.typesafe.akka" %% "akka-http"   % "10.1.5",
"com.typesafe.akka" %% "akka-stream" % "2.5.12",
  "com.typesafe.akka" %% "akka-agent" % "2.5.17",
  "com.typesafe.akka" %% "akka-persistence" % "2.5.17",
  "org.iq80.leveldb" % "leveldb" % "0.10",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.17" % Test,
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,


)