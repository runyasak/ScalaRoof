scalaVersion := "2.13.7"
lazy val hello = (project in file("."))
  .settings(
    name := "HelloScala",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test
  )
