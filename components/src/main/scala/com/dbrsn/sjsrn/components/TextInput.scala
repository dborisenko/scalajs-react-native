package com.dbrsn.sjsrn.components

import com.dbrsn.sjsrn.{ ReactEvent, TextInputEvent }
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.{ Children, CtorType, JsComponent }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TextInput {

  @js.native
  @JSImport("react-native", "TextInput")
  object RawComponent extends js.Object {
    def blur(): Unit = js.native

    def focus(): Unit = js.native
  }

  @js.native
  trait AutoCapitalize extends js.Object

  object AutoCapitalize {
    @inline def NONE: AutoCapitalize = "none".asInstanceOf[AutoCapitalize]

    @inline def SENTENCES: AutoCapitalize = "sentences".asInstanceOf[AutoCapitalize]

    @inline def WORDS: AutoCapitalize = "words".asInstanceOf[AutoCapitalize]

    @inline def CHARACTERS: AutoCapitalize = "characters".asInstanceOf[AutoCapitalize]
  }

  @js.native
  trait DataDetectorTypes extends js.Object

  object DataDetectorTypes {
    @inline def PHONE_NUMBER: DataDetectorTypes = "phoneNumber".asInstanceOf[DataDetectorTypes]

    @inline def LINK: DataDetectorTypes = "link".asInstanceOf[DataDetectorTypes]

    @inline def ADDRESS: DataDetectorTypes = "address".asInstanceOf[DataDetectorTypes]

    @inline def CALENDER_EVENT: DataDetectorTypes = "calendarEvent".asInstanceOf[DataDetectorTypes]

    @inline def NONE: DataDetectorTypes = "none".asInstanceOf[DataDetectorTypes]

    @inline def ALL: DataDetectorTypes = "all".asInstanceOf[DataDetectorTypes]
  }

  @js.native
  trait KeyboardType extends js.Object

  object KeyboardType {
    @inline def DEFAULT: KeyboardType = "default".asInstanceOf[KeyboardType]

    @inline def NUMERIC: KeyboardType = "numeric".asInstanceOf[KeyboardType]

    @inline def EMAIL_ADDRESS: KeyboardType = "email-address".asInstanceOf[KeyboardType]

    @inline def ASCII_CAPABLE: KeyboardType = "ascii-capable".asInstanceOf[KeyboardType]

    @inline def NUMBERS_AND_PUNCTUATION: KeyboardType = "numbers-and-punctuation".asInstanceOf[KeyboardType]

    @inline def URL: KeyboardType = "url".asInstanceOf[KeyboardType]

    @inline def NUMBER_PAD: KeyboardType = "number-pad".asInstanceOf[KeyboardType]

    @inline def PHONE_PAD: KeyboardType = "phone-pad".asInstanceOf[KeyboardType]

    @inline def NUMBER_HONE_PAD: KeyboardType = "name-phone-pad".asInstanceOf[KeyboardType]

    @inline def DECIMAL_PAD: KeyboardType = "decimal-pad".asInstanceOf[KeyboardType]

    @inline def TWITTER: KeyboardType = "twitter".asInstanceOf[KeyboardType]

    @inline def WEB_SEARCH: KeyboardType = "web-search".asInstanceOf[KeyboardType]
  }

  @js.native
  trait ReturnKeyType extends js.Object

  object ReturnKeyType {
    @inline def DEFAULT: ReturnKeyType = "default".asInstanceOf[ReturnKeyType]

    @inline def GO: ReturnKeyType = "go".asInstanceOf[ReturnKeyType]

    @inline def GOOGLE: ReturnKeyType = "google".asInstanceOf[ReturnKeyType]

    @inline def JOIN: ReturnKeyType = "join".asInstanceOf[ReturnKeyType]

    @inline def NEXT: ReturnKeyType = "next".asInstanceOf[ReturnKeyType]

    @inline def ROUTE: ReturnKeyType = "route".asInstanceOf[ReturnKeyType]

    @inline def SEARCH: ReturnKeyType = "search".asInstanceOf[ReturnKeyType]

    @inline def SEND: ReturnKeyType = "send".asInstanceOf[ReturnKeyType]

    @inline def YAHOO: ReturnKeyType = "yahoo".asInstanceOf[ReturnKeyType]

    @inline def DONE: ReturnKeyType = "done".asInstanceOf[ReturnKeyType]

    @inline def EMERGENCY_CALL: ReturnKeyType = "emergency-call".asInstanceOf[ReturnKeyType]
  }

  @js.native
  trait TextAlign extends js.Object

  object TextAlign {
    @inline def START: TextAlign = "start".asInstanceOf[TextAlign]

    @inline def CENTER: TextAlign = "center".asInstanceOf[TextAlign]

    @inline def END: TextAlign = "end".asInstanceOf[TextAlign]
  }

  @js.native
  trait TextAlignVertical extends js.Object

  object TextAlignVertical {
    @inline def TOP: TextAlignVertical = "top".asInstanceOf[TextAlignVertical]

    @inline def CENTER: TextAlignVertical = "center".asInstanceOf[TextAlignVertical]

    @inline def BOTTOM: TextAlignVertical = "bottom".asInstanceOf[TextAlignVertical]
  }

  @js.native
  trait Selection extends js.Object {
    var start: js.UndefOr[Double] = js.undefined
    val end: js.UndefOr[Double] = js.undefined
  }

  @js.native
  trait Props extends View.Props {
    val onBlur: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val placeholderTextColor: js.UndefOr[String] = js.undefined
    val multiline: js.UndefOr[Boolean] = js.undefined
    val maxLength: js.UndefOr[Int] = js.undefined
    val onChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val onScroll: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val onSelectionChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val underlineColorAndroid: js.UndefOr[String] = js.undefined
    val keyboardType: js.UndefOr[KeyboardType] = js.undefined
    val selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
    val selectionColor: js.UndefOr[String] = js.undefined
    val enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
    val clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
    val textAlignVertical: js.UndefOr[TextAlignVertical] = js.undefined
    val onSubmitEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val placeholder: js.UndefOr[String] = js.undefined
    val textAlign: js.UndefOr[TextAlign] = js.undefined
    val onChangeText: js.UndefOr[js.Function1[String, Unit]] = js.undefined
    val tintColor: js.UndefOr[String] = js.undefined
    val autoFocus: js.UndefOr[Boolean] = js.undefined
    val spellCheck: js.UndefOr[Boolean] = js.undefined
    val autoCorrect: js.UndefOr[Boolean] = js.undefined
    val caretHidden: js.UndefOr[Boolean] = js.undefined
    val disableExtractUI: js.UndefOr[Boolean] = js.undefined
    val autoCapitalize: js.UndefOr[AutoCapitalize] = js.undefined
    val bufferDelay: js.UndefOr[Int] = js.undefined
    val selection: js.UndefOr[Selection] = js.undefined
    val onEndEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val returnKeyType: js.UndefOr[ReturnKeyType] = js.undefined
    val returnKeyLabel: js.UndefOr[String] = js.undefined
    val onFocus: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val onContentSizeChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined
    val clearButtonMode: js.UndefOr[String] = js.undefined
    val value: js.UndefOr[String] = js.undefined
    val defaultValue: js.UndefOr[String] = js.undefined
    val selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
    val dataDetectorTypes: js.UndefOr[DataDetectorTypes] = js.undefined
    val editable: js.UndefOr[Boolean] = js.undefined
    val blurOnSubmit: js.UndefOr[Boolean] = js.undefined
    val password: js.UndefOr[Boolean] = js.undefined
  }

  object Props {
    def apply(
      onBlur: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      placeholderTextColor: js.UndefOr[String] = js.undefined,
      multiline: js.UndefOr[Boolean] = js.undefined,
      maxLength: js.UndefOr[Int] = js.undefined,
      onChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      onScroll: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      onSelectionChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      underlineColorAndroid: js.UndefOr[String] = js.undefined,
      keyboardType: js.UndefOr[KeyboardType] = js.undefined,
      selectionState: js.UndefOr[DocumentSelectionState] = js.undefined,
      selectionColor: js.UndefOr[String] = js.undefined,
      enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
      clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
      textAlignVertical: js.UndefOr[TextAlignVertical] = js.undefined,
      onSubmitEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      placeholder: js.UndefOr[String] = js.undefined,
      textAlign: js.UndefOr[TextAlign] = js.undefined,
      onChangeText: js.UndefOr[js.Function1[String, Unit]] = js.undefined,
      tintColor: js.UndefOr[String] = js.undefined,
      autoFocus: js.UndefOr[Boolean] = js.undefined,
      spellCheck: js.UndefOr[Boolean] = js.undefined,
      autoCorrect: js.UndefOr[Boolean] = js.undefined,
      caretHidden: js.UndefOr[Boolean] = js.undefined,
      disableExtractUI: js.UndefOr[Boolean] = js.undefined,
      autoCapitalize: js.UndefOr[AutoCapitalize] = js.undefined,
      bufferDelay: js.UndefOr[Int] = js.undefined,
      selection: js.UndefOr[Selection] = js.undefined,
      onEndEditing: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      returnKeyType: js.UndefOr[ReturnKeyType] = js.undefined,
      returnKeyLabel: js.UndefOr[String] = js.undefined,
      onFocus: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      onContentSizeChange: js.UndefOr[js.Function1[ReactEvent[TextInputEvent], Unit]] = js.undefined,
      clearButtonMode: js.UndefOr[String] = js.undefined,
      value: js.UndefOr[String] = js.undefined,
      defaultValue: js.UndefOr[String] = js.undefined,
      selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
      dataDetectorTypes: js.UndefOr[DataDetectorTypes] = js.undefined,
      editable: js.UndefOr[Boolean] = js.undefined,
      blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
      password: js.UndefOr[Boolean] = js.undefined,
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
      onBlur = onBlur,
      placeholderTextColor = placeholderTextColor,
      multiline = multiline,
      maxLength = maxLength,
      onChange = onChange,
      onScroll = onScroll,
      onSelectionChange = onSelectionChange,
      underlineColorAndroid = underlineColorAndroid,
      keyboardType = keyboardType,
      selectionState = selectionState,
      selectionColor = selectionColor,
      enablesReturnKeyAutomatically = enablesReturnKeyAutomatically,
      clearTextOnFocus = clearTextOnFocus,
      textAlignVertical = textAlignVertical,
      onSubmitEditing = onSubmitEditing,
      placeholder = placeholder,
      textAlign = textAlign,
      onChangeText = onChangeText,
      tintColor = tintColor,
      autoFocus = autoFocus,
      spellCheck = spellCheck,
      autoCorrect = autoCorrect,
      caretHidden = caretHidden,
      disableExtractUI = disableExtractUI,
      autoCapitalize = autoCapitalize,
      bufferDelay = bufferDelay,
      selection = selection,
      onEndEditing = onEndEditing,
      returnKeyType = returnKeyType,
      returnKeyLabel = returnKeyLabel,
      onFocus = onFocus,
      onContentSizeChange = onContentSizeChange,
      clearButtonMode = clearButtonMode,
      value = value,
      defaultValue = defaultValue,
      selectTextOnFocus = selectTextOnFocus,
      dataDetectorTypes = dataDetectorTypes,
      editable = editable,
      blurOnSubmit = blurOnSubmit,
      password = password,
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
