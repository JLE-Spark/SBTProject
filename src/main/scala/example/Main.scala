package example
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger

object Main extends App{

  val ages = Seq(42,75,29,64)
  println(s"The oldest person is ${ages.max}")
  println(s"The youngest person is ${ages.min}")

  val logger = Logger(this.getClass)
  logger.info("load environment config")
  val conf = ConfigFactory.load()
  println("The answer is: " + conf.getString("myapp.server-address"))

}
