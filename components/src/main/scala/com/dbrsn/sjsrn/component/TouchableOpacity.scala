package com.dbrsn.sjsrn.component

import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TouchableOpacity {

  @silent
  @js.native
  @JSImport("react-native", "TouchableOpacity")
  object RawComponent extends js.Object {
    def setOpacityTo(value: Double, duration: Double): Unit = js.native
  }

  @js.native
  trait Props extends TouchableWithoutFeedback.Props {
    val activeOpacity: js.UndefOr[Double] = js.undefined
  }

  object Props {
    def apply(
      activeOpacity: js.UndefOr[Double] = js.undefined,
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
      activeOpacity = activeOpacity,
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
