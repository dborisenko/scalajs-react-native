package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "Linking")
object Linking extends js.Object {
  def addEventListener(tpe: String, handler: js.Function): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function): Unit = js.native

  def openURL(url: String): Promise[Boolean] = js.native

  def getInitialURL(): Promise[String] = js.native

  def canOpenURL(url: String): Promise[Boolean] = js.native
}
