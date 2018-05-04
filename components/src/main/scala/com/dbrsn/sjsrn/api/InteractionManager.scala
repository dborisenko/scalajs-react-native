package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "InteractionManager")
object InteractionManager extends js.Object {
  def runAfterInteractions(callback: js.Function): Unit = js.native

  def createInteractionHandle(): Unit = js.native

  def clearInteractionHandle(handle: Int): Unit = js.native
}
