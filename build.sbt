import Dependencies._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "org.scaladl"
ThisBuild / organizationName := "sami-badawi"

lazy val root = (project in file("."))
  .settings(
    name := "tf_scala_ex",
    libraryDependencies ++= Seq(
      "org.platanios" %% "tensorflow-api" % "0.5.10",
      "org.platanios" %% "tensorflow-data" % "0.5.10",
      "org.platanios" %% "tensorflow-examples" % "0.5.10",
      "org.platanios" %% "tensorflow-jni" % "0.5.10",
      "org.platanios" %% "tensorflow" % "0.5.10",
      "org.platanios" %% "tensorflow" % "0.5.10" classifier "linux"
    )
  )
