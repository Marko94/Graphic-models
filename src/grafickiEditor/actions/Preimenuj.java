package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.model.workspace.Workspace;

import java.awt.event.ActionEvent;

import javax.swing.tree.TreePath;

public class Preimenuj extends MyAction {

	public Preimenuj(){
		putValue(NAME, "Preimenuj");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		GrafickiEditor.getInstance().getWorkspaceTree().startEditingAtPath(GrafickiEditor.getInstance().getWorkspaceTree().getSelectionPath());
	}

}
