package com.dbrsn.sjsrn.components

import com.github.ghik.silencer.silent

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSImport, JSName }
import scala.scalajs.js.{ UndefOr, `|`, Array => JArray }

@js.native
trait ListViewDataSourceInput[R, H] extends js.Object {
  var rowHasChanged: js.UndefOr[js.Function2[R, R, Boolean]] = js.undefined
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[H, H, Boolean]] = js.undefined
  var getRowData: js.UndefOr[js.Function3[_, String | Int, String | Int, _]] = js.undefined
  var getSectionHeaderData: js.UndefOr[js.Function2[_, String | Int, _]] = js.undefined
}

@silent
@js.native
@JSImport("react-native", "ListView.DataSource")
class ListViewDataSource[R, H] extends js.Object {

  def this(params: ListViewDataSourceInput[R, H]) = this()

  def cloneWithRows(dataBlob: JArray[R], rowIdentities: JArray[String]): ListViewDataSource[R, H] = js.native

  @JSName("cloneWithRows")
  def cloneWithRowsWithObject(
    dataBlob: js.Dictionary[Any], rowIdentities: JArray[String]
  ): ListViewDataSource[R, _] = js.native

  def cloneWithRowsAndSections(
    dataBlob: Any, sectionIdentities: JArray[String], rowIdentities: JArray[JArray[String]]
  ): ListViewDataSource[R, H] = js.native

  def getRowCount(): Int = js.native

  def rowShouldUpdate(sectionIndex: Int, rowIndex: Int): Boolean = js.native

  def getRowData(sectionIndex: Int, rowIndex: Int): js.Dynamic = js.native

  def getRowIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionIDForFlatIndex(index: Int): UndefOr[String] = js.native

  def getSectionLengths(): JArray[Int] = js.native

  def sectionHeaderShouldUpdate(sectionIndex: Int): Boolean = js.native

  def getSectionHeaderData(sectionIndex: Int): H = js.native

}
