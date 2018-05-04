package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "PixelRatio")
object PixelRatio extends js.Object {

  def get(): Double = js.native

  def getFontScale(): Double = js.native

  def getPixelSizeForLayoutSize(layoutSize: Double): Double = js.native

  def roundToNearestPixel(layoutSize: Double): Double = js.native
}
