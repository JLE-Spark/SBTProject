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
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
//play framework
//libraryDependencies += "org.playframework.anorm" %% "anorm" % "2.6.1"
//libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
//jdbc
libraryDependencies += jdbc
//spark
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.11"
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.11"
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.8.11"
//dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-paranamer" % "2.8.11"
//dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.11"
//dependencyOverrides += "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.8.11"
//dependencyOverrides += "com.google.guava" % "guava" % "23.0"
//dependencyOverrides += "com.google.code.findbugs" % "jsr305" % "3.0.2"
//dependencyOverrides += "com.google.code.gson" % "gson" % "2.8.0"
//dependencyOverrides += "com.google.inject" % "guice" % "4.1.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
//resolvers += "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"
libraryDependencies += "datastax" % "spark-cassandra-connector" % "2.0.9-s_2.11"

//for deduplicate for jar modified by assembly
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

