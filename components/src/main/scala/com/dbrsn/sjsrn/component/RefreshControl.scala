package com.dbrsn.sjsrn.component

import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object RefreshControl {

  @silent
  @js.native
  @JSImport("react-native", "RefreshControl")
  object RawComponent extends js.Object {
    val SIZE: js.Dynamic = js.native
  }

  @js.native
  trait Size extends js.Object

  object Size {
    @inline def DEFAULT: Size = RawComponent.SIZE.DEFAULT.asInstanceOf[Size]

    @inline def LARGE: Size = RawComponent.SIZE.LARGE.asInstanceOf[Size]
  }

  @js.native
  trait Props extends View.Props {
    val onRefresh: js.UndefOr[js.Function0[_]] = js.undefined
    val refreshing: js.UndefOr[Boolean] = js.undefined
    val tintColor: js.UndefOr[String] = js.undefined
    val title: js.UndefOr[String] = js.undefined
    val enabled: js.UndefOr[Boolean] = js.undefined
    val colors: js.UndefOr[js.Array[String]] = js.undefined
    val progressBackgroundColor: js.UndefOr[String] = js.undefined
    val progressViewOffset: js.UndefOr[Double] = js.undefined
    val size: js.UndefOr[Size] = js.undefined
  }

  object Props {
    def apply(
      onRefresh: js.UndefOr[js.Function0[_]] = js.undefined,
      refreshing: js.UndefOr[Boolean] = js.undefined,
      tintColor: js.UndefOr[String] = js.undefined,
      title: js.UndefOr[String] = js.undefined,
      enabled: js.UndefOr[Boolean] = js.undefined,
      colors: js.UndefOr[js.Array[String]] = js.undefined,
      progressBackgroundColor: js.UndefOr[String] = js.undefined,
      progressViewOffset: js.UndefOr[Double] = js.undefined,
      size: js.UndefOr[Size] = js.undefined,
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
      onRefresh = onRefresh,
      refreshing = refreshing,
      tintColor = tintColor,
      title = title,
      enabled = enabled,
      colors = colors,
      progressBackgroundColor = progressBackgroundColor,
      progressViewOffset = progressViewOffset,
      size = size,
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
