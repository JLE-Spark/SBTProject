package dmp.utils

import com.typesafe.config.ConfigFactory
import dmp.model.Config

object GetConfig {
  val conf = ConfigFactory.load()
  val properties = new Config(conf.getString("data-middle-platform.spark-cassandra-connection-host"),
    conf.getString("data-middle-platform.spark-cassandra-connection-port"),
    conf.getString("data-middle-platform.environment"),
    conf.getString("data-middle-platform.logfilename")
  )

}
