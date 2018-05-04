package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.Promise

@silent
@js.native
trait AccessibilityInfo extends js.Object {
  def fetch(): Promise[Boolean] = js.native

  def addEventListener(eventName: String, handler: js.Function): js.Object = js.native

  def removeEventListener(eventName: String, handler: js.Function): Unit = js.native

  def setAccessibilityFocus(reactTag: Double): Unit = js.native

  def announceForAccessibility(announcement: String): Unit = js.native
}
