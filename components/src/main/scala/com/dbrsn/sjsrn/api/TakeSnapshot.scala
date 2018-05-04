package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

object TakeSnapshot {

  @silent
  @js.native
  @JSImport("react-native", "takeSnapshot")
  object RawTakeSnapshot extends js.Object {
    def apply(view: js.Any, options: Options): Promise[js.Any] = js.native
  }

  @js.native
  trait Options extends js.Object {
    var width: js.UndefOr[Double] = js.undefined
    var height: js.UndefOr[Double] = js.undefined
    var format: js.UndefOr[String] = js.undefined
    var quality: js.UndefOr[Double] = js.undefined
  }

  object Options {
    @inline
    def apply(
      width: js.UndefOr[Double] = js.undefined,
      height: js.UndefOr[Double] = js.undefined,
      format: js.UndefOr[String] = js.undefined,
      quality: js.UndefOr[Double] = js.undefined
    ): Options = js.Dynamic.literal(
      width = width,
      height = height,
      format = format,
      quality = quality
    ).asInstanceOf[Options]
  }

  @inline
  def apply(view: js.Any, options: Options): Promise[js.Any] = RawTakeSnapshot(view, options)
}
