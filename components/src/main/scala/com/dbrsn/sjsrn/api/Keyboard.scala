package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "Keyboard")
object Keyboard extends js.Object {
  def addListener(eventName: String, callback: KeyboardEventData => _): js.Dynamic = js.native

  def removeListener(eventName: String, callback: js.Function): Unit = js.native

  def removeAllListeners(eventName: String): Unit = js.native

  def dismiss(): Unit = js.native
}

@silent
@js.native
trait KeyboardEventData extends js.Object {
  val endCoordinates: js.Dynamic = js.native
}

object KeyboardEventData {
  def apply(
    endCoordinates: js.Dynamic
  ): KeyboardEventData = js.Dynamic.literal(
    endCoordinates = endCoordinates
  ).asInstanceOf[KeyboardEventData]
}
