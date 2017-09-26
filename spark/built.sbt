name := "price_data"

version := "1.0"

scalaVersion := "2.10.4"
sparkVersion := "2.1.1"
sparkComponents ++= Seq("core")

assemblyJarName in assembly := "priceData_Sep19.jar"


libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "2.0.0" % "provided",
"org.apache.spark" %% "spark-sql" % "2.0.0" % "provided",
"org.apache.spark" %% "spark-streaming" % "2.0.0" % "provided",
"org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.0.0",
"com.datastax.spark" %% "spark-cassandra-connector" % 2.0.1,
"org.apache.spark" %% "spark-streaming-kafka" % "1.6.2"
)

mergeStrategy in assembly := {
  case m if m.toLowerCase.endsWith("manifest.mf")          => MergeStrategy.discard
  case m if m.toLowerCase.matches("meta-inf.*\\.sf$")      => MergeStrategy.discard
  case "log4j.properties"                                  => MergeStrategy.discard
  case m if m.toLowerCase.startsWith("meta-inf/services/") => MergeStrategy.filterDistinctLines
  case "reference.conf"                                    => MergeStrategy.concat
  case _                                                   => MergeStrategy.first
}
