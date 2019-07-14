package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.gui.WorkspaceDrvo;
import grafickiEditor.model.workspace.Dijagram;

import java.awt.event.ActionEvent;

public class IzbrisiDijagram extends MyAction {
	public IzbrisiDijagram(){
		putValue(NAME, "Izbrisi dijagram");
		putValue(SHORT_DESCRIPTION, "Izbrisi dijagram");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		WorkspaceDrvo drvo = GrafickiEditor.getInstance().getWorkspaceTree();
		drvo.izbrisiDijagram((Dijagram)drvo.getLastSelectedPathComponent());
	}		
}
