package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("ReactNativePropRegistry", JSImport.Namespace)
object ReactNativePropRegistry extends js.Object {
  def register(obj: js.Object): Int = js.native

  def getByID(id: Int): js.Object = js.native
}

@silent
@js.native
@JSImport("StyleSheetValidation", JSImport.Namespace)
object StyleSheetValidation extends js.Object {
  def register(obj: js.Object): Int = js.native

  def getByID(id: Int): js.Object = js.native
}

@silent
@js.native
@JSImport("react-native", "StyleSheet")
object StyleSheet extends js.Object {
  def create[T <: js.Object](obj: T): T = js.native

  val hairlineWidth: Double = js.native

  val absoluteFill: js.Any = js.native
}
