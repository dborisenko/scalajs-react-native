package com.dbrsn.sjsrn.component

import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Button {

  @js.native
  @JSImport("react-native", "Button")
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    val title: js.UndefOr[String] = js.undefined
    val disabled: js.UndefOr[Boolean] = js.undefined
    val onPress: js.UndefOr[js.Function0[_]] = js.undefined
    val testID: js.UndefOr[String] = js.undefined
    val color: js.UndefOr[String] = js.undefined
    val accessibilityLabel: js.UndefOr[String] = js.undefined
  }

  object Props {
    def apply(
      title: js.UndefOr[String] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      onPress: js.UndefOr[js.Function0[_]] = js.undefined,
      testID: js.UndefOr[String] = js.undefined,
      color: js.UndefOr[String] = js.undefined,
      accessibilityLabel: js.UndefOr[String] = js.undefined
    ): Props = js.Dynamic.literal(
      title = title,
      disabled = disabled,
      onPress = onPress,
      testID = testID,
      color = color,
      accessibilityLabel = accessibilityLabel
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
