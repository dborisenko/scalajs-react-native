package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@silent
@js.native
@JSImport("nativeImageSource", JSImport.Default)
object NativeImageSource extends js.Object {
  def apply(spec: NativeSourceSpec): js.Object = js.native
}

@js.native
trait NativeSourceSpec extends js.Object {
  var ios: js.UndefOr[String] = js.undefined
  var android: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
}

object NativeSourceSpec {
  def apply(
    ios: js.UndefOr[String] = js.undefined,
    android: js.UndefOr[String] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined
  ): NativeSourceSpec = js.Dynamic.literal(
    ios = ios,
    android = android,
    width = width,
    height = height
  ).asInstanceOf[NativeSourceSpec]
}
