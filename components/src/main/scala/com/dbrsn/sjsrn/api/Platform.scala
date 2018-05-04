package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Platform {

  @silent
  @js.native
  @JSImport("react-native", "Platform")
  object RawPlatform extends js.Object {
    val OS: String = js.native
    val Version: Double = js.native

    def select(obj: Select): js.Object = js.native
  }

  @js.native
  trait Select extends js.Object {
    val ios: js.UndefOr[js.Object] = js.undefined
    val android: js.UndefOr[js.Object] = js.undefined
  }

  object Select {
    def apply(
      ios: js.UndefOr[js.Object],
      android: js.UndefOr[js.Object]
    ): Select = js.Dynamic.literal(
      ios = ios,
      android = android
    ).asInstanceOf[Select]
  }

}
