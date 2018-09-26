package dmp.model

class Config (val sparkCassandraConnectionHost: String,
              val sparkCassandraConnectionPort: String,
              val environment: String,
              val logfilename: String)
