import org.scalajs.sbtplugin.impl.DependencyBuilders
import sbt._

object Dependencies extends DependencyBuilders {

  object Versions {
    val scala = "2.12.5"

    // Scala Compiler Plugins
    val paradise = "2.1.1"
    val `kind-projector` = "0.9.6"
    val silencer = "0.6"

    // Scala JS
    val `scalajs-react` = "1.2.0"
    val `scalajs-dom` = "0.9.5"
  }

  // Scala Compiler Plugins
  val paradise = "org.scalamacros" % "paradise" % Versions.paradise
  val `kind-projector` = "org.spire-math" %% "kind-projector" % Versions.`kind-projector`
  val `silencer-plugin` = "com.github.ghik" %% "silencer-plugin" % Versions.silencer
  val silencer = "com.github.ghik" %% "silencer-lib" % Versions.silencer

  // Scala JS
  val `scalajs-dom` = Def.setting("org.scala-js" %%% "scalajs-dom" % Versions.`scalajs-dom`)
  val `scalajs-react-core` = Def.setting("com.github.japgolly.scalajs-react" %%% "core" % Versions.`scalajs-react`)
}
