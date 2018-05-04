package com.dbrsn.sjsrn.api

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSImport

object Alert {

  @silent
  @js.native
  @JSImport("react-native", "Alert")
  object RawComponent extends js.Object {
    def alert(
      title: String, message: String, buttons: js.Array[Button], options: Options, `type`: Type = Type.DEFAULT
    ): Unit = js.native
  }

  @js.native
  trait Button extends js.Object {
    val text: js.UndefOr[String] = js.undefined
    val onPress: js.UndefOr[js.Function] = js.undefined
    val style: js.UndefOr[Button.Style] = js.undefined
  }

  object Button {

    @js.native
    trait Style extends js.Object

    object Style {
      @inline def DEFAULT: Style = "default".asInstanceOf[Style]

      @inline def CANCEL: Style = "cancel".asInstanceOf[Style]

      @inline def DESTRUCTIVE: Style = "destructive".asInstanceOf[Style]
    }

    @inline
    def apply(
      text: UndefOr[String] = js.undefined, onPress: UndefOr[() => _] = js.undefined, style: UndefOr[Button.Style] = js.undefined
    ): Button = js.Dynamic.literal(
      text = text,
      onPress = onPress.asInstanceOf[js.Any],
      style = style
    ).asInstanceOf[Button]
  }

  @js.native
  trait Options extends js.Object {
    val cancelable: js.UndefOr[Boolean] = js.undefined
    val onDismiss: js.UndefOr[js.Function] = js.undefined
  }

  object Options {
    @inline
    def apply(
      cancelable: js.UndefOr[Boolean] = js.undefined,
      onDismiss: js.UndefOr[js.Function] = js.undefined
    ): Options = js.Dynamic.literal(
      cancelable = cancelable,
      onDismiss = onDismiss
    ).asInstanceOf[Options]
  }

  @js.native
  trait Type extends js.Object

  object Type {
    @inline def DEFAULT: Type = "default".asInstanceOf[Type]

    @inline def PLAIN_TEXT: Type = "plain-text".asInstanceOf[Type]

    @inline def SECURE_TEXT: Type = "secure-text".asInstanceOf[Type]

    @inline def LOGIN_PASSWORD: Type = "login-password".asInstanceOf[Type]
  }

  @inline
  def apply(
    title: String, message: String, buttons: js.Array[Button], options: Options, `type`: Type = Type.DEFAULT
  ): Unit = RawComponent.alert(title, message, buttons, options, `type`)
}
