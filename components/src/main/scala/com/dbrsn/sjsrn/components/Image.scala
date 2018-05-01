package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.{ ImageEvent, ReactEvent }
import com.github.ghik.silencer.silent
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Image {

  @js.native
  @silent
  @JSImport("react-native", "Image")
  object RawComponent extends js.Object {
    def getSize(uri: String, success: (Double, Double) => Unit, failure: js.Dynamic => Unit): Unit = js.native

    def prefetch(url: String): js.Promise[js.Dynamic] = js.native
  }

  @js.native
  trait Props extends js.Object {
    val source: js.UndefOr[js.Any] = js.undefined
    val onLayout: js.UndefOr[LayoutEvent => js.Any] = js.undefined
    val accessibilityLabel: js.UndefOr[String] = js.undefined
    val onError: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined
    val onLoadEnd: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined
    val onLoad: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined
    val resizeMode: js.UndefOr[ResizeMode] = js.undefined
    val testID: js.UndefOr[String] = js.undefined
    val blurRadius: js.UndefOr[Double] = js.undefined
    val onLoadStart: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined
    val defaultSource: js.UndefOr[js.Dynamic] = js.undefined
    val loadingIndicatorSrc: js.UndefOr[js.Dynamic] = js.undefined
    val onProgress: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined
    val accessible: js.UndefOr[Boolean] = js.undefined
    val style: js.Any = js.undefined
  }

  object Props {
    def apply(
      source: js.UndefOr[Source] = js.undefined,
      onLayout: js.UndefOr[LayoutEvent => js.Any] = js.undefined,
      accessibilityLabel: js.UndefOr[String] = js.undefined,
      onError: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined,
      onLoadEnd: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined,
      onLoad: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined,
      resizeMode: js.UndefOr[ResizeMode] = js.undefined,
      testID: js.UndefOr[String] = js.undefined,
      blurRadius: js.UndefOr[Double] = js.undefined,
      onLoadStart: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined,
      defaultSource: js.UndefOr[Source] = js.undefined,
      loadingIndicatorSrc: js.UndefOr[Source] = js.undefined,
      onProgress: js.UndefOr[ReactEvent[ImageEvent] => js.Any] = js.undefined,
      accessible: js.UndefOr[Boolean] = js.undefined,
      style: js.Any = js.undefined
    ): Props = js.Dynamic.literal(
      source = source,
      onLayout = onLayout,
      accessibilityLabel = accessibilityLabel,
      onError = onError,
      onLoadEnd = onLoadEnd,
      onLoad = onLoad,
      resizeMode = resizeMode,
      testID = testID,
      blurRadius = blurRadius,
      onLoadStart = onLoadStart,
      defaultSource = defaultSource,
      loadingIndicatorSrc = loadingIndicatorSrc,
      onProgress = onProgress,
      accessible = accessible,
      style = style
    ).asInstanceOf[Props]
  }

  @js.native
  trait Source extends js.Object {
    var uri: String
    var isStatic: js.UndefOr[Boolean] = js.undefined
    var scale: js.UndefOr[Double] = js.undefined
    var headers: js.UndefOr[js.Dictionary[String]] = js.undefined
  }

  object Source {
    def apply(
      uri: String,
      isStatic: js.UndefOr[Boolean] = js.undefined,
      scale: js.UndefOr[Double] = js.undefined,
      headers: js.UndefOr[js.Dictionary[String]] = js.undefined
    ): Source = js.Dynamic.literal(
      uri = uri,
      isStatic = isStatic,
      scale = scale,
      headers = headers
    ).asInstanceOf[Source]
  }

  @js.native
  trait ResizeMode extends js.Object

  object ResizeMode {
    val COVER: ResizeMode = "cover".asInstanceOf[ResizeMode]
    val CONTAIN: ResizeMode = "contain".asInstanceOf[ResizeMode]
    val STRETCH: ResizeMode = "stretch".asInstanceOf[ResizeMode]
    val REPEAT: ResizeMode = "repeat".asInstanceOf[ResizeMode]
    val CENTER: ResizeMode = "center".asInstanceOf[ResizeMode]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
