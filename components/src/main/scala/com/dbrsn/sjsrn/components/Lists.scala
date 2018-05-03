package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.ReactEvent
import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.raw.React
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSImport

@js.native
trait ListItemLayout extends js.Object {
  val length: Double
  val offset: Int
  val index: Int
}

@js.native
trait OnEndReachedInfo extends js.Object {
  val distanceFromEnd: Double
}

@js.native
trait ViewToken[I] extends js.Object {
  val item: I
  val key: String
  val index: UndefOr[Int]
  val isViewable: Boolean
  val section: UndefOr[Any]
}

@js.native
trait ListItem[I] extends js.Object {
  val item: I
  val index: Int
}

@js.native
trait OnViewableItemsChanged[I] extends js.Object {
  val viewableItems: js.Array[ViewToken[I]]
  val changed: js.Array[ViewToken[I]]
}

@js.native
trait ViewabilityConfig extends js.Object {
  val minimumViewTime: UndefOr[Double] = js.undefined
  val viewAreaCoveragePercentThreshold: UndefOr[Double] = js.undefined
  val itemVisiblePercentThreshold: UndefOr[Double] = js.undefined
  val waitForInteraction: UndefOr[Boolean] = js.undefined

}

@js.native
trait ScrollToEndParams extends js.Object {
  val animated: UndefOr[Boolean] = js.undefined
}

@js.native
trait ScrollToIndexParams extends ScrollToEndParams {
  val viewPosition: UndefOr[Double] = js.undefined
  val index: Int
}

@js.native
trait ScrollToItemParams extends ScrollToEndParams {
  val item: Any
  val viewPosition: UndefOr[Int] = js.undefined
}

@js.native
trait ScrollToOffsetParams extends ScrollToEndParams {
  val offset: Int
}

@js.native
trait SectionBase[I] extends js.Object {
  val data: js.Array[I]
  val key: UndefOr[String] = js.undefined
  val renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined
  val SeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined
  val keyExtractor: UndefOr[js.Function1[I, String]] = js.undefined
}

@js.native
trait SectionItem[I] extends js.Object {
  val section: SectionBase[I]
}

object VirtualizedList {

  @silent
  @js.native
  @JSImport("react-native", "VirtualizedList")
  object RawComponent extends js.Object {
    def scrollToEnd(params: ScrollToEndParams): Unit = js.native

    def scrollToIndex(params: ScrollToIndexParams): Unit = js.native

    def scrollToItem(params: ScrollToItemParams): Unit = js.native

    def scrollToOffset(params: ScrollToEndParams): Unit = js.native

    def recordInteraction(): Unit = js.native
  }

  @js.native
  trait Props[D, I] extends js.Object {
    val ListFooterComponent: UndefOr[js.Function0[React.Element]] = js.undefined
    val ListHeaderComponent: UndefOr[js.Function0[React.Element]] = js.undefined
    val ItemSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined
    val debug: UndefOr[Boolean] = js.undefined
    val data: UndefOr[D] = js.undefined
    val extraData: UndefOr[js.Any] = js.undefined
    val horizontal: UndefOr[Boolean] = js.undefined
    val initialNumToRender: UndefOr[Int] = js.undefined
    val maxToRenderPerBatch: UndefOr[Int] = js.undefined
    val windowSize: UndefOr[Int] = js.undefined
    val updateCellsBatchingPeriod: UndefOr[Int] = js.undefined
    val onEndReachedThreshold: UndefOr[Int] = js.undefined
    val viewabilityConfig: UndefOr[ViewabilityConfig] = js.undefined
    val disableVirtualization: UndefOr[Boolean] = js.undefined
    val refreshing: UndefOr[Boolean] = js.undefined
    val removeClippedSubviews: UndefOr[Boolean] = js.undefined
    val onEndReached: UndefOr[OnEndReachedInfo] = js.undefined
    val getItem: UndefOr[js.Function2[D, Int, I]] = js.undefined
    val getItemCount: UndefOr[js.Function1[D, Int]] = js.undefined
    val onViewableItemsChanged: UndefOr[js.Function1[OnViewableItemsChanged[I], Unit]] = js.undefined
    val onLayout: UndefOr[js.Function1[ReactEvent[LayoutEvent], _]] = js.undefined
    val renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined
    val renderScrollComponent: UndefOr[js.Function1[js.Object, React.Element]] = js.undefined
    val onRefresh: UndefOr[js.Function0[_]] = js.undefined
    val keyExtractor: UndefOr[js.Function2[I, Int, String]] = js.undefined
    val getItemLayout: UndefOr[js.Function2[D, Int, ListItemLayout]] = js.undefined
  }

  object Props {
    def apply[D, I](
      ListFooterComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ListHeaderComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ItemSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      debug: UndefOr[Boolean] = js.undefined,
      data: UndefOr[D] = js.undefined,
      extraData: UndefOr[js.Any] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      initialNumToRender: UndefOr[Int] = js.undefined,
      maxToRenderPerBatch: UndefOr[Int] = js.undefined,
      windowSize: UndefOr[Int] = js.undefined,
      updateCellsBatchingPeriod: UndefOr[Int] = js.undefined,
      onEndReachedThreshold: UndefOr[Int] = js.undefined,
      viewabilityConfig: UndefOr[ViewabilityConfig] = js.undefined,
      disableVirtualization: UndefOr[Boolean] = js.undefined,
      refreshing: UndefOr[Boolean] = js.undefined,
      removeClippedSubviews: UndefOr[Boolean] = js.undefined,
      onEndReached: UndefOr[OnEndReachedInfo] = js.undefined,
      getItem: UndefOr[js.Function2[D, Int, I]] = js.undefined,
      getItemCount: UndefOr[js.Function1[D, Int]] = js.undefined,
      onViewableItemsChanged: UndefOr[js.Function1[OnViewableItemsChanged[I], Unit]] = js.undefined,
      onLayout: UndefOr[js.Function1[ReactEvent[LayoutEvent], _]] = js.undefined,
      renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined,
      renderScrollComponent: UndefOr[js.Function1[js.Object, React.Element]] = js.undefined,
      onRefresh: UndefOr[js.Function0[_]] = js.undefined,
      keyExtractor: UndefOr[js.Function2[I, Int, String]] = js.undefined,
      getItemLayout: UndefOr[js.Function2[D, Int, ListItemLayout]] = js.undefined
    ): Props[D, I] = js.Dynamic.literal(
      ListFooterComponent = ListFooterComponent,
      ListHeaderComponent = ListHeaderComponent,
      ItemSeparatorComponent = ItemSeparatorComponent,
      debug = debug,
      data = data.asInstanceOf[js.Any],
      extraData = extraData,
      horizontal = horizontal,
      initialNumToRender = initialNumToRender,
      maxToRenderPerBatch = maxToRenderPerBatch,
      windowSize = windowSize,
      updateCellsBatchingPeriod = updateCellsBatchingPeriod,
      onEndReachedThreshold = onEndReachedThreshold,
      viewabilityConfig = viewabilityConfig,
      disableVirtualization = disableVirtualization,
      refreshing = refreshing,
      removeClippedSubviews = removeClippedSubviews,
      onEndReached = onEndReached,
      getItem = getItem,
      getItemCount = getItemCount,
      onViewableItemsChanged = onViewableItemsChanged,
      onLayout = onLayout,
      renderItem = renderItem,
      renderScrollComponent = renderScrollComponent,
      onRefresh = onRefresh,
      keyExtractor = keyExtractor,
      getItemLayout = getItemLayout
    ).asInstanceOf[Props[D, I]]
  }

  private def component[D, I] = JsComponent[Props[D, I], Children.Varargs, Null](RawComponent)

  def apply[D, I](props: Props[D, I])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[D, I], Null, RawMounted[Props[D, I], Null]] =
    component[D, I](props)(children: _*)
}

object FlatList {

  @silent
  @js.native
  @JSImport("react-native", "FlatList")
  object RawComponent extends js.Object {
    def scrollToEnd(params: ScrollToEndParams): Unit = js.native

    def scrollToIndex(params: ScrollToIndexParams): Unit = js.native

    def scrollToItem(params: ScrollToItemParams): Unit = js.native

    def scrollToOffset(params: ScrollToEndParams): Unit = js.native

    def recordInteraction(): Unit = js.native

    def flashScrollIndicators(): Unit = js.native
  }

  type Props[I] = VirtualizedList.Props[js.Array[I], I]

  object Props {
    def apply[I](
      ListFooterComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ListHeaderComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ItemSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      debug: UndefOr[Boolean] = js.undefined,
      data: UndefOr[js.Array[I]] = js.undefined,
      extraData: UndefOr[js.Any] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      initialNumToRender: UndefOr[Int] = js.undefined,
      maxToRenderPerBatch: UndefOr[Int] = js.undefined,
      windowSize: UndefOr[Int] = js.undefined,
      updateCellsBatchingPeriod: UndefOr[Int] = js.undefined,
      onEndReachedThreshold: UndefOr[Int] = js.undefined,
      viewabilityConfig: UndefOr[ViewabilityConfig] = js.undefined,
      disableVirtualization: UndefOr[Boolean] = js.undefined,
      refreshing: UndefOr[Boolean] = js.undefined,
      removeClippedSubviews: UndefOr[Boolean] = js.undefined,
      onEndReached: UndefOr[OnEndReachedInfo] = js.undefined,
      getItem: UndefOr[js.Function2[js.Array[I], Int, I]] = js.undefined,
      getItemCount: UndefOr[js.Function1[js.Array[I], Int]] = js.undefined,
      onViewableItemsChanged: UndefOr[js.Function1[OnViewableItemsChanged[I], Unit]] = js.undefined,
      onLayout: UndefOr[js.Function1[ReactEvent[LayoutEvent], _]] = js.undefined,
      renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined,
      renderScrollComponent: UndefOr[js.Function1[js.Object, React.Element]] = js.undefined,
      onRefresh: UndefOr[js.Function0[_]] = js.undefined,
      keyExtractor: UndefOr[js.Function2[I, Int, String]] = js.undefined,
      getItemLayout: UndefOr[js.Function2[js.Array[I], Int, ListItemLayout]] = js.undefined
    ): Props[I] = js.Dynamic.literal(
      ListFooterComponent = ListFooterComponent,
      ListHeaderComponent = ListHeaderComponent,
      ItemSeparatorComponent = ItemSeparatorComponent,
      debug = debug,
      data = data.asInstanceOf[js.Any],
      extraData = extraData,
      horizontal = horizontal,
      initialNumToRender = initialNumToRender,
      maxToRenderPerBatch = maxToRenderPerBatch,
      windowSize = windowSize,
      updateCellsBatchingPeriod = updateCellsBatchingPeriod,
      onEndReachedThreshold = onEndReachedThreshold,
      viewabilityConfig = viewabilityConfig,
      disableVirtualization = disableVirtualization,
      refreshing = refreshing,
      removeClippedSubviews = removeClippedSubviews,
      onEndReached = onEndReached,
      getItem = getItem,
      getItemCount = getItemCount,
      onViewableItemsChanged = onViewableItemsChanged,
      onLayout = onLayout,
      renderItem = renderItem,
      renderScrollComponent = renderScrollComponent,
      onRefresh = onRefresh,
      keyExtractor = keyExtractor,
      getItemLayout = getItemLayout
    ).asInstanceOf[Props[I]]
  }

  private def component[I] = JsComponent[Props[I], Children.Varargs, Null](RawComponent)

  def apply[I](props: Props[I])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[I], Null, RawMounted[Props[I], Null]] =
    component[I](props)(children: _*)
}

object SectionList {

  @silent
  @js.native
  @JSImport("react-native", "SectionList")
  object RawComponent extends js.Object {
    def scrollToEnd(params: ScrollToEndParams): Unit = js.native

    def scrollToIndex(params: ScrollToIndexParams): Unit = js.native

    def scrollToItem(params: ScrollToItemParams): Unit = js.native

    def scrollToOffset(params: ScrollToEndParams): Unit = js.native

    def recordInteraction(): Unit = js.native

    def flashScrollIndicators(): Unit = js.native
  }

  type Props[I] = VirtualizedSectionList.Props[js.Array[I], I]

  object Props {
    def apply[I](
      sections: UndefOr[js.Array[SectionBase[I]]] = js.undefined,
      enableVirtualization: UndefOr[Boolean] = js.undefined,
      stickySectionHeadersEnabled: UndefOr[Boolean] = js.undefined,
      SectionSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      renderSectionHeader: UndefOr[js.Function1[SectionItem[I], React.Element]] = js.undefined,
      ListFooterComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ListHeaderComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ItemSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      debug: UndefOr[Boolean] = js.undefined,
      data: UndefOr[js.Array[I]] = js.undefined,
      extraData: UndefOr[js.Any] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      initialNumToRender: UndefOr[Int] = js.undefined,
      maxToRenderPerBatch: UndefOr[Int] = js.undefined,
      windowSize: UndefOr[Int] = js.undefined,
      updateCellsBatchingPeriod: UndefOr[Int] = js.undefined,
      onEndReachedThreshold: UndefOr[Int] = js.undefined,
      viewabilityConfig: UndefOr[ViewabilityConfig] = js.undefined,
      disableVirtualization: UndefOr[Boolean] = js.undefined,
      refreshing: UndefOr[Boolean] = js.undefined,
      removeClippedSubviews: UndefOr[Boolean] = js.undefined,
      onEndReached: UndefOr[OnEndReachedInfo] = js.undefined,
      getItem: UndefOr[js.Function2[js.Array[I], Int, I]] = js.undefined,
      getItemCount: UndefOr[js.Function1[js.Array[I], Int]] = js.undefined,
      onViewableItemsChanged: UndefOr[js.Function1[OnViewableItemsChanged[I], Unit]] = js.undefined,
      onLayout: UndefOr[js.Function1[ReactEvent[LayoutEvent], _]] = js.undefined,
      renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined,
      renderScrollComponent: UndefOr[js.Function1[js.Object, React.Element]] = js.undefined,
      onRefresh: UndefOr[js.Function0[_]] = js.undefined,
      keyExtractor: UndefOr[js.Function2[I, Int, String]] = js.undefined,
      getItemLayout: UndefOr[js.Function2[js.Array[I], Int, ListItemLayout]] = js.undefined
    ): Props[I] = js.Dynamic.literal(
      sections = sections,
      enableVirtualization = enableVirtualization,
      stickySectionHeadersEnabled = stickySectionHeadersEnabled,
      SectionSeparatorComponent = SectionSeparatorComponent,
      renderSectionHeader = renderSectionHeader,
      ListFooterComponent = ListFooterComponent,
      ListHeaderComponent = ListHeaderComponent,
      ItemSeparatorComponent = ItemSeparatorComponent,
      debug = debug,
      data = data,
      extraData = extraData,
      horizontal = horizontal,
      initialNumToRender = initialNumToRender,
      maxToRenderPerBatch = maxToRenderPerBatch,
      windowSize = windowSize,
      updateCellsBatchingPeriod = updateCellsBatchingPeriod,
      onEndReachedThreshold = onEndReachedThreshold,
      viewabilityConfig = viewabilityConfig,
      disableVirtualization = disableVirtualization,
      refreshing = refreshing,
      removeClippedSubviews = removeClippedSubviews,
      onEndReached = onEndReached,
      getItem = getItem,
      getItemCount = getItemCount,
      onViewableItemsChanged = onViewableItemsChanged,
      onLayout = onLayout,
      renderItem = renderItem,
      renderScrollComponent = renderScrollComponent,
      onRefresh = onRefresh,
      keyExtractor = keyExtractor,
      getItemLayout = getItemLayout
    ).asInstanceOf[Props[I]]
  }

  private def component[I] = JsComponent[Props[I], Children.Varargs, Null](RawComponent)

  def apply[I](props: Props[I])(children: CtorType.ChildArg*): UnmountedWithRawType[Props[I], Null, RawMounted[Props[I], Null]] =
    component[I](props)(children: _*)
}

object VirtualizedSectionList {

  @silent
  @js.native
  @JSImport("react-native", "VirtualizedSectionList")
  object RawComponent extends js.Object {
    def scrollToEnd(params: ScrollToEndParams): Unit = js.native

    def scrollToIndex(params: ScrollToIndexParams): Unit = js.native

    def scrollToItem(params: ScrollToItemParams): Unit = js.native

    def scrollToOffset(params: ScrollToEndParams): Unit = js.native

    def recordInteraction(): Unit = js.native
  }

  @js.native
  trait Props[D, I] extends VirtualizedList.Props[D, I] {
    val sections: UndefOr[js.Array[SectionBase[I]]] = js.undefined
    val enableVirtualization: UndefOr[Boolean] = js.undefined
    val stickySectionHeadersEnabled: UndefOr[Boolean] = js.undefined
    val SectionSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined
    val renderSectionHeader: UndefOr[js.Function1[SectionItem[I], React.Element]] = js.undefined
  }

  object Props {
    def apply[D, I](
      sections: UndefOr[js.Array[SectionBase[I]]] = js.undefined,
      enableVirtualization: UndefOr[Boolean] = js.undefined,
      stickySectionHeadersEnabled: UndefOr[Boolean] = js.undefined,
      SectionSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      renderSectionHeader: UndefOr[js.Function1[SectionItem[I], React.Element]] = js.undefined,
      ListFooterComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ListHeaderComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      ItemSeparatorComponent: UndefOr[js.Function0[React.Element]] = js.undefined,
      debug: UndefOr[Boolean] = js.undefined,
      data: UndefOr[D] = js.undefined,
      extraData: UndefOr[js.Any] = js.undefined,
      horizontal: UndefOr[Boolean] = js.undefined,
      initialNumToRender: UndefOr[Int] = js.undefined,
      maxToRenderPerBatch: UndefOr[Int] = js.undefined,
      windowSize: UndefOr[Int] = js.undefined,
      updateCellsBatchingPeriod: UndefOr[Int] = js.undefined,
      onEndReachedThreshold: UndefOr[Int] = js.undefined,
      viewabilityConfig: UndefOr[ViewabilityConfig] = js.undefined,
      disableVirtualization: UndefOr[Boolean] = js.undefined,
      refreshing: UndefOr[Boolean] = js.undefined,
      removeClippedSubviews: UndefOr[Boolean] = js.undefined,
      onEndReached: UndefOr[OnEndReachedInfo] = js.undefined,
      getItem: UndefOr[js.Function2[D, Int, I]] = js.undefined,
      getItemCount: UndefOr[js.Function1[D, Int]] = js.undefined,
      onViewableItemsChanged: UndefOr[js.Function1[OnViewableItemsChanged[I], Unit]] = js.undefined,
      onLayout: UndefOr[js.Function1[ReactEvent[LayoutEvent], _]] = js.undefined,
      renderItem: UndefOr[js.Function1[ListItem[I], React.Element]] = js.undefined,
      renderScrollComponent: UndefOr[js.Function1[js.Object, React.Element]] = js.undefined,
      onRefresh: UndefOr[js.Function0[_]] = js.undefined,
      keyExtractor: UndefOr[js.Function2[I, Int, String]] = js.undefined,
      getItemLayout: UndefOr[js.Function2[D, Int, ListItemLayout]] = js.undefined
    ): Props[D, I] = js.Dynamic.literal(
      sections = sections,
      enableVirtualization = enableVirtualization,
      stickySectionHeadersEnabled = stickySectionHeadersEnabled,
      SectionSeparatorComponent = SectionSeparatorComponent,
      renderSectionHeader = renderSectionHeader,
      ListFooterComponent = ListFooterComponent,
      ListHeaderComponent = ListHeaderComponent,
      ItemSeparatorComponent = ItemSeparatorComponent,
      debug = debug,
      data = data.asInstanceOf[js.Any],
      extraData = extraData,
      horizontal = horizontal,
      initialNumToRender = initialNumToRender,
      maxToRenderPerBatch = maxToRenderPerBatch,
      windowSize = windowSize,
      updateCellsBatchingPeriod = updateCellsBatchingPeriod,
      onEndReachedThreshold = onEndReachedThreshold,
      viewabilityConfig = viewabilityConfig,
      disableVirtualization = disableVirtualization,
      refreshing = refreshing,
      removeClippedSubviews = removeClippedSubviews,
      onEndReached = onEndReached,
      getItem = getItem,
      getItemCount = getItemCount,
      onViewableItemsChanged = onViewableItemsChanged,
      onLayout = onLayout,
      renderItem = renderItem,
      renderScrollComponent = renderScrollComponent,
      onRefresh = onRefresh,
      keyExtractor = keyExtractor,
      getItemLayout = getItemLayout
    ).asInstanceOf[Props[D, I]]
  }

}
