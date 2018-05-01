
// sbt plugin adding support for source code formatting using Scalariform
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

// plugin that can check maven repositories for dependency updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.3")

// scalastyle
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// Scala.js, the Scala to JavaScript compiler
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")

// Compiler plugin for making type lambdas (type projections) easier to write
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

// Flexible Scala code linting tool
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")
