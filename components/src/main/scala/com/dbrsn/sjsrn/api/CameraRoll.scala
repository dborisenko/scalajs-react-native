package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "CameraRoll")
object CameraRoll extends js.Object {
  def saveImageWithTag(tag: String, successCallback: js.Function, errorCallback: js.Function): Unit = js.native

  def getPhotos(params: js.Object, callback: js.Function, errorCallback: js.Function): Unit = js.native
}
