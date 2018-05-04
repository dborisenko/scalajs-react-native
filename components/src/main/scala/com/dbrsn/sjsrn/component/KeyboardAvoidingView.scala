package com.dbrsn.sjsrn.component

import com.dbrsn.sjsrn.component.AnimatedImage.RawComponent
import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait ScreenRect extends js.Object {
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
}

@js.native
trait KeyboardChangeEvent extends js.Object {
  var startCoordinates: js.UndefOr[ScreenRect] = js.undefined

  var endCoordinates: ScreenRect

  var duration: js.UndefOr[Double] = js.undefined

  var easing: js.UndefOr[String] = js.undefined
}

object KeyboardAvoidingView {

  @js.native
  trait Behaviour extends js.Object

  object Behaviour {
    @inline def HEIGHT: Behaviour = "height".asInstanceOf[Behaviour]

    @inline def POSITION: Behaviour = "position".asInstanceOf[Behaviour]

    @inline def PADDING: Behaviour = "padding".asInstanceOf[Behaviour]
  }

  @silent
  @js.native
  @JSImport("react-native", "KeyboardAvoidingView")
  object KeyboardAvoidingViewComponent extends js.Object {
    def relativeKeyboardHeight(keyboardFrame: ScreenRect): Double = js.native

    def onKeyboardChange(event: KeyboardChangeEvent): Unit = js.native

    def onLayout(event: LayoutEvent): Unit = js.native
  }

  @js.native
  trait Props extends View.Props {
    val behavior: js.UndefOr[Behaviour] = js.undefined
    val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
    val keyboardVerticalOffset: js.UndefOr[Double] = js.undefined
  }

  object Props {
    def apply(
      behavior: js.UndefOr[Behaviour] = js.undefined,
      contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
      keyboardVerticalOffset: js.UndefOr[Double] = js.undefined,
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
    ): Props = js.Dynamic.literal(
      behavior = behavior,
      contentContainerStyle = contentContainerStyle,
      keyboardVerticalOffset = keyboardVerticalOffset,
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
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
