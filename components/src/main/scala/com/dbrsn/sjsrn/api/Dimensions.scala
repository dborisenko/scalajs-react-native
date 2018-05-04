package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("react-native", "Dimensions")
object Dimensions extends js.Object {
  def get(in: String): WindowDimensions = js.native

  def set(dims: js.Object): Boolean = js.native

  def addEventListener(`type`: String, handler: js.Function): js.Any = js.native

  def removeEventListener(`type`: String, handler: js.Function): js.Any = js.native
}

@silent
@js.native
trait WindowDimensions extends js.Object {
  val width: Double = js.native
  val height: Double = js.native
  val scale: Double = js.native
  val fontScale: Double = js.native
}

object WindowDimensions {
  def apply(
    width: Double,
    height: Double,
    scale: Double,
    fontScale: Double
  ): WindowDimensions = js.Dynamic.literal(
    width = width,
    height = height,
    scale = scale,
    fontScale = fontScale
  ).asInstanceOf[WindowDimensions]
}
