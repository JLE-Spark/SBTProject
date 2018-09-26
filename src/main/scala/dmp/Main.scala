package dmp

import org.slf4j.LoggerFactory
import dmp.level1.Test
import dmp.utils.GetConfig

object Main extends App{

  try{
    System.setProperty("logfilename", GetConfig.properties.logfilename)

    val logger = LoggerFactory.getLogger(this.getClass)
    logger.info("load environment config " + GetConfig.properties.environment)
    logger.info("load logfilename config " + GetConfig.properties.logfilename)
    
    Test.getCompany()
  }
  catch{
    case e: Exception => e.printStackTrace()
  }

}
