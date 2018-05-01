package com.dbrsn.sjsrn

import com.github.ghik.silencer.silent

import scala.scalajs.js

@js.native
@silent
trait ReactEvent[T <: js.Object] extends js.Object {

  val nativeEvent: T = js.native
}

@js.native
@silent
trait TextInputEvent extends js.Object {

  val text: String = js.native

  val contentOffset: TextContentOffset = js.native
}

@js.native
@silent
trait TextInputContentSize extends js.Object {

  val width: Double = js.native

  val height: Double = js.native
}

@js.native
@silent
trait TextContentOffset extends js.Object {

  val x: Double = js.native

  val y: Double = js.native
}

@js.native
trait ImageEvent extends js.Object {}

@js.native
@silent
trait WebViewEvent extends js.Object {
  val data: String = js.native
}

@js.native
trait SyntheticEvent extends js.Object {}
