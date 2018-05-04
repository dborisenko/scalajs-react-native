package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.{ ReactEvent, SyntheticEvent }
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

class LineBreakMode private (val value: String) extends AnyVal

object LineBreakMode {

  val HEAD = new LineBreakMode("head")
  val MIDDLE = new LineBreakMode("middle")
  val TAIL = new LineBreakMode("tail")
  val CLIP = new LineBreakMode("clip")
}

object Text {

  @js.native
  @JSImport("react-native", "Text")
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    val suppressHighlighting: js.UndefOr[Boolean] = js.undefined
    val selectionColor: js.UndefOr[String] = js.undefined
    val pressRetentionOffset: js.UndefOr[EdgeInsets] = js.undefined
    val onPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
    val onLongPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined
    val allowFontScaling: js.UndefOr[Boolean] = js.undefined
    val selectable: js.UndefOr[Boolean] = js.undefined
    val adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
    val includeFontPadding: js.UndefOr[Boolean] = js.undefined
    val onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined
    val numberOfLines: js.UndefOr[Int] = js.undefined
    val lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined
    val testID: js.UndefOr[String] = js.undefined
  }

  object Props {
    def apply(
      suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
      selectionColor: js.UndefOr[String] = js.undefined,
      pressRetentionOffset: js.UndefOr[EdgeInsets] = js.undefined,
      onPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined,
      onLongPress: js.UndefOr[js.Function1[ReactEvent[SyntheticEvent], Unit]] = js.undefined,
      allowFontScaling: js.UndefOr[Boolean] = js.undefined,
      selectable: js.UndefOr[Boolean] = js.undefined,
      adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
      includeFontPadding: js.UndefOr[Boolean] = js.undefined,
      onLayout: js.UndefOr[js.Function1[LayoutEvent, _]] = js.undefined,
      numberOfLines: js.UndefOr[Int] = js.undefined,
      lineBreakMode: js.UndefOr[LineBreakMode] = js.undefined,
      testID: js.UndefOr[String] = js.undefined
    ): Props = js.Dynamic.literal(
      suppressHighlighting = suppressHighlighting,
      selectionColor = selectionColor,
      pressRetentionOffset = pressRetentionOffset,
      onPress = onPress,
      onLongPress = onLongPress,
      allowFontScaling = allowFontScaling,
      selectable = selectable,
      adjustsFontSizeToFit = adjustsFontSizeToFit,
      includeFontPadding = includeFontPadding,
      onLayout = onLayout,
      numberOfLines = numberOfLines,
      lineBreakMode = lineBreakMode.asInstanceOf[js.Any],
      testID = testID
    ).asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(props: Props)(children: CtorType.ChildArg*): UnmountedWithRawType[Props, Null, RawMounted[Props, Null]] =
    component(props)(children: _*)
}
