package com.dbrsn.sjsrn.component

import com.dbrsn.sjsrn.component.ImageBackground.RawComponent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object View {

  @js.native
  @JSImport("react-native", "View")
  object ViewComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    val onStartShouldSetResponder: js.UndefOr[js.Function] = js.undefined
    val onMoveShouldSetResponder: js.UndefOr[js.Function] = js.undefined
    val onStartShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined
    val onMoveShouldSetResponderCapture: js.UndefOr[js.Function] = js.undefined
    val onResponderGrant: js.UndefOr[js.Function] = js.undefined
    val onResponderReject: js.UndefOr[js.Function] = js.undefined
    val onResponderMove: js.UndefOr[js.Function] = js.undefined
    val onResponderTerminationRequest: js.UndefOr[js.Function] = js.undefined
    val onResponderTerminate: js.UndefOr[js.Function] = js.undefined
    val renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    val onResponderRelease: js.UndefOr[js.Function] = js.undefined
    val onMagicTap: js.UndefOr[js.Function] = js.undefined
    val collapsable: js.UndefOr[Boolean] = js.undefined
    val shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
    val onAccessibilityTap: js.UndefOr[js.Function0[_]] = js.undefined
    val accessibilityLabel: js.UndefOr[String] = js.undefined
    val AccessibilityComponentType: js.UndefOr[js.Any] = js.undefined
    val removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    val style: js.UndefOr[js.Any] = js.undefined
    val accessibilityTraits: js.UndefOr[js.Array[AccessibilityTraits]] = js.undefined
    val onAcccessibilityTap: js.UndefOr[js.Function] = js.undefined
    val collapsible: js.UndefOr[Boolean] = js.undefined
    val accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    val needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    val testID: js.UndefOr[String] = js.undefined
    val pointerEvents: js.UndefOr[PointerEvents] = js.undefined
    val importantForAccessibility: js.UndefOr[ImportantForAccessibility] = js.undefined
    val accessible: js.UndefOr[Boolean] = js.undefined
  }

  object Props {
    def apply(
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

object GestureEvent {

  @js.native
  trait NativeEvent extends js.Any {
    def changedTouches: js.Array[NativeEvent] = js.native

    def identifier: Int = js.native

    def locationX: Double = js.native

    def locationY: Double = js.native

    def pageX: Double = js.native

    def pageY: Double = js.native

    def target: Int = js.native

    def timestamp: Double = js.native

    def touches: js.Array[NativeEvent] = js.native
  }

}

@js.native
trait GestureEvent extends js.Any {
  def nativeEvent: GestureEvent.NativeEvent = js.native
}

@js.native
trait AccessibilityTraits extends js.Object

object AccessibilityTraits {
  @inline def NONE: AccessibilityTraits = "none".asInstanceOf[AccessibilityTraits]

  @inline def BUTTON: AccessibilityTraits = "button".asInstanceOf[AccessibilityTraits]

  @inline def LINK: AccessibilityTraits = "link".asInstanceOf[AccessibilityTraits]

  @inline def HEADER: AccessibilityTraits = "header".asInstanceOf[AccessibilityTraits]

  @inline def SEARCH: AccessibilityTraits = "search".asInstanceOf[AccessibilityTraits]

  @inline def IMAGE: AccessibilityTraits = "image".asInstanceOf[AccessibilityTraits]

  @inline def SELECTED: AccessibilityTraits = "selected".asInstanceOf[AccessibilityTraits]

  @inline def PLAYS: AccessibilityTraits = "plays".asInstanceOf[AccessibilityTraits]

  @inline def KEY: AccessibilityTraits = "key".asInstanceOf[AccessibilityTraits]

  @inline def TEXT: AccessibilityTraits = "text".asInstanceOf[AccessibilityTraits]

  @inline def SUMMARY: AccessibilityTraits = "summary".asInstanceOf[AccessibilityTraits]

  @inline def DISABLED: AccessibilityTraits = "disabled".asInstanceOf[AccessibilityTraits]

  @inline def FREQUENT_UPDATES: AccessibilityTraits = "frequentUpdates".asInstanceOf[AccessibilityTraits]

  @inline def STARTS_MEDIA: AccessibilityTraits = "startsMedia".asInstanceOf[AccessibilityTraits]

  @inline def ADJUSTABLE: AccessibilityTraits = "adjustable".asInstanceOf[AccessibilityTraits]

  @inline def ALLOWS_DIRECT_INTERACTION: AccessibilityTraits = "allowsDirectInteraction".asInstanceOf[AccessibilityTraits]

  @inline def PAGE_TURN: AccessibilityTraits = "pageTurn".asInstanceOf[AccessibilityTraits]
}

@js.native
trait PointerEvents extends js.Object

object PointerEvents {
  @inline def BOX_NONE: PointerEvents = "box-none".asInstanceOf[PointerEvents]

  @inline def BOX_ONLY: PointerEvents = "box-only".asInstanceOf[PointerEvents]

  @inline def NONE: PointerEvents = "none".asInstanceOf[PointerEvents]

  @inline def AUTO: PointerEvents = "auto".asInstanceOf[PointerEvents]
}

@js.native
trait ImportantForAccessibility extends js.Object

object ImportantForAccessibility {
  @inline def AUTO: ImportantForAccessibility = "auto".asInstanceOf[ImportantForAccessibility]

  @inline def YES: ImportantForAccessibility = "yes".asInstanceOf[ImportantForAccessibility]

  @inline def NO: ImportantForAccessibility = "no".asInstanceOf[ImportantForAccessibility]

  @inline def NO_HIDE_DESCEDANTS: ImportantForAccessibility = "no-hide-descendants".asInstanceOf[ImportantForAccessibility]
}

@js.native
trait ActivityIndicatorSize extends js.Object

object ActivityIndicatorSize {
  @inline def SMALL: ActivityIndicatorSize = "small".asInstanceOf[ActivityIndicatorSize]

  @inline def LARGE: ActivityIndicatorSize = "large".asInstanceOf[ActivityIndicatorSize]
}

@js.native
trait EdgeInsets extends js.Object {
  val top: js.UndefOr[Double] = js.undefined
  val left: js.UndefOr[Double] = js.undefined
  val bottom: js.UndefOr[Double] = js.undefined
  val right: js.UndefOr[Double] = js.undefined
}
