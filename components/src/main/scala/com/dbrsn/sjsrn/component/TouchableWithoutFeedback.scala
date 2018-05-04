package com.dbrsn.sjsrn.component

import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TouchableWithoutFeedback {

  @js.native
  @JSImport("react-native", "TouchableWithoutFeedback")
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    val onPressIn: js.UndefOr[js.Function0[_]] = js.undefined
    val onPress: js.UndefOr[js.Function0[_]] = js.undefined
    val delayPressIn: js.UndefOr[Int] = js.undefined
    val onPressOut: js.UndefOr[js.Function0[_]] = js.undefined
    val accessibilityLabel: js.UndefOr[String] = js.undefined
    val accessibilityTraits: js.UndefOr[String] = js.undefined
    val accessibilityComponentType: js.UndefOr[String] = js.undefined
    val disabled: js.UndefOr[Boolean] = js.undefined
    val shouldBlockResponder: js.UndefOr[Boolean] = js.undefined
    val onLongPress: js.UndefOr[js.Function0[_]] = js.undefined
    val delayPressOut: js.UndefOr[Int] = js.undefined
    val style: js.UndefOr[js.Any] = js.undefined
    val delayLongPress: js.UndefOr[Int] = js.undefined
    val accessible: js.UndefOr[Boolean] = js.undefined
  }

  object Props {
    def apply(
      onPressIn: js.UndefOr[js.Function0[_]] = js.undefined,
      onPress: js.UndefOr[js.Function0[_]] = js.undefined,
      delayPressIn: js.UndefOr[Int] = js.undefined,
      onPressOut: js.UndefOr[js.Function0[_]] = js.undefined,
      accessibilityLabel: js.UndefOr[String] = js.undefined,
      accessibilityTraits: js.UndefOr[String] = js.undefined,
      accessibilityComponentType: js.UndefOr[String] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      shouldBlockResponder: js.UndefOr[Boolean] = js.undefined,
      onLongPress: js.UndefOr[js.Function0[_]] = js.undefined,
      delayPressOut: js.UndefOr[Int] = js.undefined,
      style: js.UndefOr[js.Any] = js.undefined,
      delayLongPress: js.UndefOr[Int] = js.undefined,
      accessible: js.UndefOr[Boolean] = js.undefined
    ): Props = js.Dynamic.literal(
      onPressIn = onPressIn,
      onPress = onPress,
      delayPressIn = delayPressIn,
      onPressOut = onPressOut,
      accessibilityLabel = accessibilityLabel,
      accessibilityTraits = accessibilityTraits,
      accessibilityComponentType = accessibilityComponentType,
      disabled = disabled,
      shouldBlockResponder = shouldBlockResponder,
      onLongPress = onLongPress,
      delayPressOut = delayPressOut,
      style = style,
      delayLongPress = delayLongPress,
      accessible = accessible
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
