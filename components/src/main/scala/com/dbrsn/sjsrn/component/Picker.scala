package com.dbrsn.sjsrn.component

import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Picker {

  @silent
  @js.native
  @JSImport("react-native", "Picker")
  object RawComponent extends js.Object {
    val MODE_DIALOG: Mode = js.native
    val MODE_DROPDOWN: Mode = js.native
  }

  @js.native
  trait Mode extends js.Object

  @js.native
  trait Props[T] extends View.Props {
    val itemStyle: js.UndefOr[js.Any] = js.undefined
    val prompt: js.UndefOr[String] = js.undefined
    val enabled: js.UndefOr[Boolean] = js.undefined
    val mode: js.UndefOr[Mode] = js.undefined
    val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
    val selectedValue: js.UndefOr[T] = js.undefined
  }

  object Props {
    @inline
    def apply[T](
      itemStyle: js.UndefOr[js.Any] = js.undefined,
      prompt: js.UndefOr[String] = js.undefined,
      enabled: js.UndefOr[Boolean] = js.undefined,
      mode: js.UndefOr[Mode] = js.undefined,
      onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined,
      selectedValue: js.UndefOr[T] = js.undefined,
      onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
      onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined,
      onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
      onMoveShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined,
      onResponderGrant: js.UndefOr[js.Function] = js.undefined,
      onResponderReject: js.UndefOr[js.Function] = js.undefined,
      onResponderMove: js.UndefOr[js.Function] = js.undefined,
      onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined,
      onResponderTerminate: js.UndefOr[js.Function] = js.undefined,
      renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
      onResponderRelease: js.UndefOr[js.Function] = js.undefined,
      onMagicTap: js.UndefOr[js.Function] = js.undefined,
      collapsable: js.UndefOr[Boolean] = js.undefined,
      shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
      onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined,
      onAccessibilityTap: js.UndefOr[js.Function0[_]] = js.undefined,
      accessibilityLabel: js.UndefOr[String] = js.undefined,
      AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined,
      removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
      style: js.UndefOr[js.Any] = js.undefined,
      accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] = js.undefined,
      onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined,
      collapsible: js.UndefOr[Boolean] = js.undefined,
      accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
      needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
      testID: js.UndefOr[String] = js.undefined,
      pointerEvents: js.UndefOr[PointerEvents] = js.undefined,
      importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined,
      accessible: js.UndefOr[Boolean] = js.undefined
    ): Props[T] = js.Dynamic.literal(
      itemStyle = itemStyle,
      prompt = prompt,
      enabled = enabled,
      mode = mode,
      onValueChange = onValueChange,
      selectedValue = selectedValue.asInstanceOf[js.Any],
      onStartShouldSetResponder = onStartShouldSetResponder,
      onMoveShouldSetResponder = onMoveShouldSetResponder,
      onStartShouldSetResponderCapture = onStartShouldSetResponderCapture,
      onMoveShouldSetResponderCapture = onMoveShouldSetResponderCapture,
      onResponderGrant = onResponderGrant,
      onResponderReject = onResponderReject,
      onResponderMove = onResponderMove,
      onResponderTerminationRequest = onResponderTerminationRequest,
      onResponderTerminate = onResponderTerminate,
      renderToHardwareTextureAndroid = renderToHardwareTextureAndroid,
      onResponderRelease = onResponderRelease,
      onMagicTap = onMagicTap,
      collapsable = collapsable,
      shouldRasterizeIOS = shouldRasterizeIOS,
      onLayout = onLayout,
      onAccessibilityTap = onAccessibilityTap,
      accessibilityLabel = accessibilityLabel,
      AccessibilityComponentType = AccessibilityComponentType,
      removeClippedSubviews = removeClippedSubviews,
      style = style,
      accessibilityTraits = accessibilityTraits,
      onAcccessibilityTap = onAcccessibilityTap,
      collapsible = collapsible,
      accessibilityViewIsModal = accessibilityViewIsModal,
      needsOffscreenAlphaCompositing = needsOffscreenAlphaCompositing,
      testID = testID,
      pointerEvents = pointerEvents,
      importantForAccessibility = importantForAccessibility,
      accessible = accessible
    ).asInstanceOf[Props[T]]
  }

  private def component[T] = JsComponent[Props[T], Children.Varargs, Null](RawComponent)

  def apply[T](props: Props[T])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[T], Null, RawMounted[Props[T], Null]] =
    component[T](props)(children: _*)
}

object PickerItem {

  @js.native
  @JSImport("react-native", "Picker.Item")
  object RawComponent extends js.Object

  @js.native
  trait Props[T] extends js.Object {
    val label: js.UndefOr[String] = js.undefined
    val color: js.UndefOr[String] = js.undefined
    val style: js.UndefOr[js.Any] = js.undefined
    val testID: js.UndefOr[String] = js.undefined
    val value: js.UndefOr[T] = js.undefined
  }

  object Props {
    @inline
    def apply[T](
      label: js.UndefOr[String] = js.undefined,
      color: js.UndefOr[String] = js.undefined,
      style: js.UndefOr[js.Any] = js.undefined,
      testID: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[T] = js.undefined
    ): Props[T] = js.Dynamic.literal(
      label = label,
      color = color,
      style = style,
      testID = testID,
      value = value.asInstanceOf[js.Any]
    ).asInstanceOf[Props[T]]
  }

  private def component[T] = JsComponent[Props[T], Children.Varargs, Null](RawComponent)

  def apply[T](props: Props[T])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[T], Null, RawMounted[Props[T], Null]] =
    component[T](props)(children: _*)
}
