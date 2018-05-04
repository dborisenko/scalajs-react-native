package com.dbrsn.sjsrn.components

import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Modal {

  @js.native
  @JSImport("react-native", "Modal")
  object RawComponent extends js.Object

  @js.native
  trait AnimationType extends js.Object

  object AnimationType {
    @inline def SLIDE: AnimationType = "slide".asInstanceOf[AnimationType]

    @inline def FADE: AnimationType = "fade".asInstanceOf[AnimationType]

    @inline def NONE: AnimationType = "none".asInstanceOf[AnimationType]
  }

  @js.native
  trait Props extends js.Object {
    val visible: js.UndefOr[Boolean] = js.undefined
    val style: js.UndefOr[js.Any] = js.undefined
    val animationType: js.UndefOr[AnimationType] = js.undefined
    val onDismiss: js.UndefOr[js.Function0[_]] = js.undefined
    val transparent: js.UndefOr[Boolean] = js.undefined
    val onRequestClose: js.UndefOr[js.Function0[_]] = js.undefined
  }

  object Props {
    def apply(
      visible: js.UndefOr[Boolean] = js.undefined,
      style: js.UndefOr[js.Any] = js.undefined,
      animationType: js.UndefOr[AnimationType] = js.undefined,
      onDismiss: js.UndefOr[js.Function0[_]] = js.undefined,
      transparent: js.UndefOr[Boolean] = js.undefined,
      onRequestClose: js.UndefOr[js.Function0[_]] = js.undefined
    ): Props = js.Dynamic.literal(
      visible = visible,
      style = style,
      animationType = animationType,
      onDismiss = onDismiss,
      transparent = transparent,
      onRequestClose = onRequestClose
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
