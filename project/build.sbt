val sbtPgpVersion = "1.1.2"
val sbtReleaseVersion = "1.0.13"
val sbtSonatypeVersion = "3.9.2"
val sbtScalafmtVersion = "2.3.4"

lazy val root = project
  .in(file("."))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    addSbtPlugin("com.jsuereth" % "sbt-pgp" % sbtPgpVersion),
    addSbtPlugin("com.github.gseitz" % "sbt-release" % sbtReleaseVersion),
    addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % sbtSonatypeVersion),
    addSbtPlugin("org.scalameta" % "sbt-scalafmt" % sbtScalafmtVersion),
    buildInfoKeys := Seq[BuildInfoKey](
      "sbtPgpVersion" -> sbtPgpVersion,
      "sbtReleaseVersion" -> sbtReleaseVersion,
      "sbtSonatypeVersion" -> sbtSonatypeVersion,
      "sbtScalafmtVersion" -> sbtScalafmtVersion
    ),
    buildInfoPackage := "sbtsoftwaremill"
  )
