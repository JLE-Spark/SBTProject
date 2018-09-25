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
//libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"

//jdbc
libraryDependencies += jdbc

//spark
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.0"
libraryDependencies += "datastax" % "spark-cassandra-connector" % "2.0.9-s_2.11"

assemblyMergeStrategy in assembly := {
  case PathList("org","aopalliance", xs @ _*) => MergeStrategy.last
  case PathList("javax", "inject", xs @ _*) => MergeStrategy.last
  case PathList("javax", "servlet", xs @ _*) => MergeStrategy.last
  case PathList("javax", "activation", xs @ _*) => MergeStrategy.last
  case PathList("org", "apache", xs @ _*) => MergeStrategy.last
  case PathList("com", "google", xs @ _*) => MergeStrategy.last
  case PathList("com", "esotericsoftware", xs @ _*) => MergeStrategy.last
  case PathList("com", "codahale", xs @ _*) => MergeStrategy.last
  case PathList("com", "yammer", xs @ _*) => MergeStrategy.last
  case "about.html" => MergeStrategy.rename
  case "META-INF/ECLIPSEF.RSA" => MergeStrategy.last
  case "META-INF/mailcap" => MergeStrategy.last
  case "META-INF/mimetypes.default" => MergeStrategy.last
  case "plugin.properties" => MergeStrategy.last
  case "log4j.properties" => MergeStrategy.last
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}

