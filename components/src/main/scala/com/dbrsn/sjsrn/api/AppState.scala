package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "AppState")
object AppState extends js.Object {

  def addEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function1[String, _]): Unit = js.native

  def currentState: js.UndefOr[String] = js.native
}
