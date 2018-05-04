package com.dbrsn.sjsrn.api

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("react-native", "DeviceEventEmitter")
object DeviceEventEmitter extends js.Object {
  def removeListener(eventType: String, listener: js.Function): Unit = js.native

  def emit(eventType: String): Unit = js.native
}
