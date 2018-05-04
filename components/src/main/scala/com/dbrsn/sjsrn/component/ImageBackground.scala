package com.dbrsn.sjsrn.component

import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object ImageBackground {

  @silent
  @js.native
  @JSImport("react-native", "ImageBackground")
  object RawComponent extends js.Object {
    def getSize(uri: String, success: (Double, Double) => Unit, failure: js.Dynamic => Unit): Unit = js.native

    def prefetch(url: String): js.Promise[js.Dynamic] = js.native
  }

  type Props = Image.Props
  final val Props = Image.Props

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
