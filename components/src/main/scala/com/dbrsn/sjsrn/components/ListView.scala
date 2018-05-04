package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.{ ReactEvent, XYValueLiteral }
import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@silent
@js.native
trait VisibleRows extends js.Object {
  val sectionID: VisibleSection = js.native
}

@silent
@js.native
trait VisibleSection extends js.Object {
  val rowID: Boolean = js.native
}

object ListView {

  @silent
  @js.native
  @JSImport("react-native", "ListView")
  object RawComponent extends js.Object {
    def getScrollResponder(): js.Object = js.native

    def scrollTo(position: ScrollPosition): Unit = js.native

    def scrollToEnd(options: ScrollToEndOptions): Unit = js.native
  }

  @js.native
  trait Props[R, H] extends ScrollView.Props {
    val scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined
    val renderFooter: js.UndefOr[js.Function0[React.Element]] = js.undefined
    val pageSize: js.UndefOr[Int] = js.undefined
    val renderHeader: js.UndefOr[js.Function0[React.Element]] = js.undefined
    val renderRow: js.UndefOr[js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit], React.Element]] = js.undefined
    val onEndReachedThreshold: js.UndefOr[Int] = js.undefined
    val dataSource: js.UndefOr[ListViewDataSource[R, H]] = js.undefined
    val renderScrollComponent: js.UndefOr[js.Function1[js.Dynamic, React.Element]] = js.undefined
    val onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined
    val initialListSize: js.UndefOr[Int] = js.undefined
    val renderSeparator: js.UndefOr[js.Function3[String, String, Boolean, React.Element]] = js.undefined
    val onChangeVisibleRows: js.UndefOr[js.Function2[VisibleRows, VisibleRows, Unit]] = js.undefined
    val renderSectionHeader: js.UndefOr[js.Function2[H, String, React.Element]] = js.undefined
  }

  object Props {
    def apply[R, H](
      scrollRenderAheadDistance: js.UndefOr[Int] = js.undefined,
      renderFooter: js.UndefOr[js.Function0[React.Element]] = js.undefined,
      pageSize: js.UndefOr[Int] = js.undefined,
      renderHeader: js.UndefOr[js.Function0[React.Element]] = js.undefined,
      renderRow: js.UndefOr[js.Function4[R, String | Int, String | Int, js.Function2[String | Int, String | Int, Unit], React.Element]] = js.undefined,
      onEndReachedThreshold: js.UndefOr[Int] = js.undefined,
      dataSource: js.UndefOr[ListViewDataSource[R, H]] = js.undefined,
      renderScrollComponent: js.UndefOr[js.Function1[js.Dynamic, React.Element]] = js.undefined,
      onEndReached: js.UndefOr[js.Function0[Unit]] = js.undefined,
      initialListSize: js.UndefOr[Int] = js.undefined,
      renderSeparator: js.UndefOr[js.Function3[String, String, Boolean, React.Element]] = js.undefined,
      onChangeVisibleRows: js.UndefOr[js.Function2[VisibleRows, VisibleRows, Unit]] = js.undefined,
      renderSectionHeader: js.UndefOr[js.Function2[H, String, React.Element]] = js.undefined,
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
    ): Props[R, H] = js.Dynamic.literal(
      scrollRenderAheadDistance = scrollRenderAheadDistance,
      renderFooter = renderFooter,
      pageSize = pageSize,
      renderHeader = renderHeader,
      renderRow = renderRow,
      onEndReachedThreshold = onEndReachedThreshold,
      dataSource = dataSource,
      renderScrollComponent = renderScrollComponent,
      onEndReached = onEndReached,
      initialListSize = initialListSize,
      renderSeparator = renderSeparator,
      onChangeVisibleRows = onChangeVisibleRows,
      renderSectionHeader = renderSectionHeader,
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
    ).asInstanceOf[Props[R, H]]
  }

  private def component[R, H] = JsComponent[Props[R, H], Children.Varargs, Null](RawComponent)

  def apply[R, H](props: Props[R, H])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[R, H], Null, RawMounted[Props[R, H], Null]] =
    component[R, H](props)(children: _*)
}
