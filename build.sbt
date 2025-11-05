ThisBuild / scalaVersion := "2.13.14"
ThisBuild / version := "0.1"
ThisBuild / organization := "com.littlewizards"

lazy val root = (project in file("."))
  .aggregate(core, desktop)
  .settings(
    name := "LittleWizards"
  )

lazy val core = (project in file("core"))
  .settings(
    name := "core",
    libraryDependencies ++= Seq(
      "com.badlogicgames.gdx" % "gdx" % "1.12.0",
      "com.badlogicgames.gdx" % "gdx-platform" % "1.12.0" classifier "natives-desktop"
    )
  )

lazy val desktop = (project in file("desktop"))
  .dependsOn(core)
  .settings(
    name := "desktop",
    libraryDependencies ++= Seq(
      "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.12.0",
      "com.badlogicgames.gdx" % "gdx-platform" % "1.12.0" classifier "natives-desktop"
    )
  )
