package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("react-native", "NetInfo")
object NetInfo extends NetInfoMethods {
  def isConnected: NetInfoMethods = js.native

  def isConnectionExpensive(): js.Promise[Boolean] = js.native
}

@silent
@js.native
trait NetInfoMethods extends js.Object {
  def addEventListener(eventName: String, handler: js.Function1[Boolean, _]): Unit = js.native

  def removeEventListener(eventName: String, handler: js.Function1[Boolean, _]): Unit = js.native

  def fetch(): js.Promise[js.Dynamic] = js.native
}

