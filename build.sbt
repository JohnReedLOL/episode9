name := "episode9"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "johnreed2 bintray" at "http://dl.bintray.com/content/johnreed2/maven"

libraryDependencies += "scala.trace" %% "scala-trace-debug" % "2.2.17"

libraryDependencies += "com.twitter" %% "util-collection" % "6.34.0"

resolvers += Resolver.sonatypeRepo("releases")

/*
def macroDependencies(version: String) =
  Seq(
    "org.scala-lang" % "scala-reflect" % version % "provided",
    "org.scala-lang" % "scala-compiler" % version % "provided"
  )
*/
libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

// libraryDependencies ++= macroDependencies(scalaVersion.value)

libraryDependencies ++= Seq( // for sized types.
  "com.chuusai" %% "shapeless" % "2.3.1"
)

// "-Xprint:typer"

libraryDependencies += "joda-time" % "joda-time" % "2.1"

libraryDependencies += "org.joda" % "joda-convert" % "1.3"

scalacOptions ++= Seq("-Xprint:typer", "-unchecked", "-deprecation", "-feature", "-Xlint", "-Xfatal-warnings", "-Yinline-warnings", "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-nullary-unit")