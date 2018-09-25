package dmp

import org.slf4j.LoggerFactory
import dmp.level1.Test
import dmp.utils.GetConfig

object Main extends App{

  try{

    val logger = LoggerFactory.getLogger(this.getClass)

    logger.info("load environment config " + GetConfig.properties.environment)
    
    Test.getCompany()
  }
  catch{
    case e: Exception => e.printStackTrace()
  }

}
