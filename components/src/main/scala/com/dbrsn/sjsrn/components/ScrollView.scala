package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.{ ReactEvent, XYValueLiteral }
import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSImport

@js.native
trait ScrollToEndOptions extends js.Object {
  val animated: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait OverScrollMode extends js.Object

object OverScrollMode {
  @inline def AUTO: OverScrollMode = "auto".asInstanceOf[OverScrollMode]

  @inline def ALWAYS: OverScrollMode = "always".asInstanceOf[OverScrollMode]

  @inline def NEVER: OverScrollMode = "never".asInstanceOf[OverScrollMode]
}

@js.native
trait ScrollViewKeyboardPersistTaps extends js.Object

object ScrollViewKeyboardPersistTaps {
  @inline def ALWAYS: ScrollViewKeyboardPersistTaps = "always".asInstanceOf[ScrollViewKeyboardPersistTaps]

  @inline def NEVER: ScrollViewKeyboardPersistTaps = "never".asInstanceOf[ScrollViewKeyboardPersistTaps]

  @inline def HANDLED: ScrollViewKeyboardPersistTaps = "handled".asInstanceOf[ScrollViewKeyboardPersistTaps]
}

@js.native
trait ScrollViewKeyboardDismissMode extends js.Object

object ScrollViewKeyboardDismissMode {
  @inline def NONE: ScrollViewKeyboardDismissMode = "none".asInstanceOf[ScrollViewKeyboardDismissMode]

  @inline def INTERACTIVE: ScrollViewKeyboardDismissMode = "interactive".asInstanceOf[ScrollViewKeyboardDismissMode]

  @inline def ON_DRAG: ScrollViewKeyboardDismissMode = "on-drag".asInstanceOf[ScrollViewKeyboardDismissMode]
}

@js.native
trait ScrollViewIndicatorStyle extends js.Object

object ScrollViewIndicatorStyle {
  @inline def DEFAULT: ScrollViewIndicatorStyle = "default".asInstanceOf[ScrollViewIndicatorStyle]

  @inline def BLACK: ScrollViewIndicatorStyle = "black".asInstanceOf[ScrollViewIndicatorStyle]

  @inline def WHITE: ScrollViewIndicatorStyle = "white".asInstanceOf[ScrollViewIndicatorStyle]
}

@js.native
trait ScrollPosition extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
}

@silent
@js.native
trait ScrollEvent extends js.Object {

  val contentInset: ContentInset = js.native

  val contentOffset: ContentOffset = js.native

  val layoutMeasurement: Size2d = js.native

  val contentSize: Size2d = js.native

  val zoomScale: Double = js.native
}

@silent
@js.native
trait ContentInset extends js.Object {

  val top: Double = js.native

  val left: Double = js.native

  val right: Double = js.native

  val bottom: Double = js.native
}

object ContentInset {
  @inline
  def apply(
    top: UndefOr[Double] = js.undefined,
    left: UndefOr[Double] = js.undefined,
    right: UndefOr[Double] = js.undefined,
    bottom: UndefOr[Double] = js.undefined
  ): ContentInset = js.Dynamic.literal(
    top = top,
    left = left,
    right = right,
    bottom = bottom
  ).asInstanceOf[ContentInset]
}

@silent
@js.native
trait ContentOffset extends js.Object {
  val x: Double = js.native
  val y: Double = js.native
}

@silent
@js.native
trait Size2d extends js.Object {
  val width: Double = js.native
  val height: Double = js.native
}

object ScrollView {

  @silent
  @js.native
  @JSImport("react-native", "ScrollView")
  object RawComponent extends js.Object {
    def scrollTo(position: ScrollPosition): Unit = js.native

    def scrollToEnd(options: ScrollToEndOptions): Unit = js.native

    def flashScrollIndicators(): Unit = js.native
  }

  @js.native
  trait Props extends View.Props {
    val zoomScale: js.UndefOr[Int] = js.undefined
    val contentContainerStyle: js.UndefOr[js.Any] = js.undefined
    val contentInset: js.UndefOr[EdgeInsets] = js.undefined
    val alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
    val decelerationRate: js.UndefOr[Double] = js.undefined
    val minimumZoomScale: js.UndefOr[Double] = js.undefined
    val scrollsToTop: js.UndefOr[Boolean] = js.undefined
    val keyboardDismissMode: js.UndefOr[ScrollViewKeyboardDismissMode] = js.undefined
    val horizontal: js.UndefOr[Boolean] = js.undefined
    val contentOffset: js.UndefOr[XYValueLiteral] = js.undefined
    val centerContent: js.UndefOr[Boolean] = js.undefined
    val onScroll: js.UndefOr[js.Function1[ReactEvent[ScrollEvent], Unit]] = js.undefined
    val scrollEventThrottle: js.UndefOr[Int] = js.undefined
    val throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined
    val showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    val endFillColor: js.UndefOr[String] = js.undefined
    val refreshControl: js.UndefOr[React.Element] = js.undefined
    val scrollEnabled: js.UndefOr[Boolean] = js.undefined
    val indicatorStyle: js.UndefOr[ScrollViewIndicatorStyle] = js.undefined
    val bouncesZoom: js.UndefOr[Boolean] = js.undefined
    val alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
    val bounces: js.UndefOr[Boolean] = js.undefined
    val maximumZoomScale: js.UndefOr[Double] = js.undefined
    val automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
    val onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    val stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined
    val directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
    val keyboardShouldPersistTaps: js.UndefOr[ScrollViewKeyboardPersistTaps] = js.undefined
    val pagingEnabled: js.UndefOr[Boolean] = js.undefined
    val scrollPerfTag: js.UndefOr[String] = js.undefined
    val canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
    val showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
    val scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined
    val overScrollMode: js.UndefOr[OverScrollMode] = js.undefined
  }

  object Props {
    def apply(
      zoomScale: js.UndefOr[Int] = js.undefined,
      contentContainerStyle: js.UndefOr[js.Any] = js.undefined,
      contentInset: js.UndefOr[EdgeInsets] = js.undefined,
      alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
      decelerationRate: js.UndefOr[Double] = js.undefined,
      minimumZoomScale: js.UndefOr[Double] = js.undefined,
      scrollsToTop: js.UndefOr[Boolean] = js.undefined,
      keyboardDismissMode: js.UndefOr[ScrollViewKeyboardDismissMode] = js.undefined,
      horizontal: js.UndefOr[Boolean] = js.undefined,
      contentOffset: js.UndefOr[XYValueLiteral] = js.undefined,
      centerContent: js.UndefOr[Boolean] = js.undefined,
      onScroll: js.UndefOr[js.Function1[ReactEvent[ScrollEvent], Unit]] = js.undefined,
      scrollEventThrottle: js.UndefOr[Int] = js.undefined,
      throttleScrollCallbackMS: js.UndefOr[Int] = js.undefined,
      showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
      endFillColor: js.UndefOr[String] = js.undefined,
      refreshControl: js.UndefOr[React.Element] = js.undefined,
      scrollEnabled: js.UndefOr[Boolean] = js.undefined,
      indicatorStyle: js.UndefOr[ScrollViewIndicatorStyle] = js.undefined,
      bouncesZoom: js.UndefOr[Boolean] = js.undefined,
      alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
      bounces: js.UndefOr[Boolean] = js.undefined,
      maximumZoomScale: js.UndefOr[Double] = js.undefined,
      automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
      onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined,
      stickyHeaderIndices: js.UndefOr[js.Array[Int]] = js.undefined,
      directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
      keyboardShouldPersistTaps: js.UndefOr[ScrollViewKeyboardPersistTaps] = js.undefined,
      pagingEnabled: js.UndefOr[Boolean] = js.undefined,
      scrollPerfTag: js.UndefOr[String] = js.undefined,
      canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
      showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
      scrollIndicatorInsets: js.UndefOr[EdgeInsets] = js.undefined,
      overScrollMode: js.UndefOr[OverScrollMode] = js.undefined,
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
      zoomScale = zoomScale,
      contentContainerStyle = contentContainerStyle,
      contentInset = contentInset,
      alwaysBounceVertical = alwaysBounceVertical,
      decelerationRate = decelerationRate,
      minimumZoomScale = minimumZoomScale,
      scrollsToTop = scrollsToTop,
      keyboardDismissMode = keyboardDismissMode,
      horizontal = horizontal,
      contentOffset = contentOffset,
      centerContent = centerContent,
      onScroll = onScroll,
      scrollEventThrottle = scrollEventThrottle,
      throttleScrollCallbackMS = throttleScrollCallbackMS,
      showsHorizontalScrollIndicator = showsHorizontalScrollIndicator,
      endFillColor = endFillColor,
      refreshControl = refreshControl,
      scrollEnabled = scrollEnabled,
      indicatorStyle = indicatorStyle,
      bouncesZoom = bouncesZoom,
      alwaysBounceHorizontal = alwaysBounceHorizontal,
      bounces = bounces,
      maximumZoomScale = maximumZoomScale,
      automaticallyAdjustContentInsets = automaticallyAdjustContentInsets,
      onScrollAnimationEnd = onScrollAnimationEnd,
      stickyHeaderIndices = stickyHeaderIndices,
      directionalLockEnabled = directionalLockEnabled,
      keyboardShouldPersistTaps = keyboardShouldPersistTaps,
      pagingEnabled = pagingEnabled,
      scrollPerfTag = scrollPerfTag,
      canCancelContentTouches = canCancelContentTouches,
      showsVerticalScrollIndicator = showsVerticalScrollIndicator,
      scrollIndicatorInsets = scrollIndicatorInsets,
      overScrollMode = overScrollMode,
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
