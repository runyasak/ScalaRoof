scalaVersion := "2.13.7"
lazy val hello = (project in file("."))
  .settings(
    name := "HelloScala"
  )

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.2",
  "org.scala-lang.modules" %% "scala-xml" % "2.0.1",
  "org.scalatest" %% "scalatest" % "3.2.7" % Test
)
