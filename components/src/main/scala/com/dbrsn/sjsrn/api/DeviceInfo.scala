package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "DeviceInfo")
object DeviceInfo extends js.Object {
  val Dimensions: Dimensions = js.native
}
