package dmp.level1

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import dmp.utils.GetConfig
import org.apache.spark.sql.functions.typedLit


object Test{

    def getCompany(): Unit ={

    val spark = SparkSession.builder().appName("Spark SQL basic example")
    .config("spark.master", "local")
    .config("spark.cassandra.connection.host", GetConfig.properties.sparkCassandraConnectionHost)
    .config("spark.cassandra.connection.port", GetConfig.properties.sparkCassandraConnectionPort).getOrCreate()

    val df = spark.read.format("org.apache.spark.sql.cassandra")
    .option("keyspace", "scala")
    .option("table", "company")
    .load()

    val orderDF = df.orderBy(asc("name"))

    import spark.implicits._
    val values = List("1-1","2-2","3-3","4-4","5-5").toDF().withColumn("values", typedLit(Seq("foo", "bar")))
    values.selectExpr("value", "explode(values) as explode").show()




  }
}
