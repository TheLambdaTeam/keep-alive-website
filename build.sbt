name := """keep-alive-website"""

version := "1.0"

scalaVersion := "2.11.8"

val http4sVersion = "0.17.0-M1"

resolvers += Resolver.sonatypeRepo("snapshots")

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "ch.qos.logback"  %  "logback-classic"  % "1.1.3" % "runtime"
)
