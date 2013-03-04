import sbt._
import Keys._
import com.typesafe.sbt.SbtScalariform.scalariformSettings

object MyBuild extends Build {
  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ scalariformSettings ++ Seq(
      scalaVersion := "2.10.0",
      scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked"),
      libraryDependencies ++= Seq(
        "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
      ) 
    )
  )
}
