package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "Clipboard")
object Clipboard extends js.Object {
  def setString(content: String): Unit = js.native

  def getString(): Promise[String] = js.native
}
