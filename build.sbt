name := "SBTExampleProject"

version := "0.1"

scalaVersion := "2.11.8"

mainClass := Some("example.Main")

//Dependencies
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1"
//test
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
//environment switch
libraryDependencies += "com.typesafe" % "config" % "1.3.2"
//log
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3" % Test
//spark
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

//for deduplicate for jar
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}