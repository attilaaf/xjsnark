package xjsnark.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

public class JBooleanConversion_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_1w7e9o_a(editorContext, node);
  }
  private EditorCell createCollection_1w7e9o_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1w7e9o_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_1w7e9o_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1w7e9o_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1w7e9o_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1w7e9o_d0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_1w7e9o_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new JBooleanConversion_Editor.jTypeSingleRoleHandler_1w7e9o_a0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x26b0c1978f544467L, 0x26b0c1978f544468L, "jType"), editorContext);
    return provider.createCell();
  }
  private class jTypeSingleRoleHandler_1w7e9o_a0 extends SingleRoleCellProvider {
    public jTypeSingleRoleHandler_1w7e9o_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("jType");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_jType");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no jType>";
    }
  }
  private EditorCell createConstant_1w7e9o_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_1w7e9o_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1w7e9o_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new JBooleanConversion_Editor.argumentSingleRoleHandler_1w7e9o_c0(node, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x26b0c1978f544467L, 0x26b0c1978f544469L, "argument"), editorContext);
    return provider.createCell();
  }
  private class argumentSingleRoleHandler_1w7e9o_c0 extends SingleRoleCellProvider {
    public argumentSingleRoleHandler_1w7e9o_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("argument");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_argument");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no argument>";
    }
  }
  private EditorCell createConstant_1w7e9o_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_1w7e9o_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
