package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "DeviceEventEmitter")
object DeviceEventEmitter extends js.Object {
  def removeListener(eventType: String, listener: js.Function): Unit = js.native

  def emit(eventType: String): Unit = js.native
}
