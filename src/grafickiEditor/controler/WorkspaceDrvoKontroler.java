package grafickiEditor.controler;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.actions.Akcije;
import grafickiEditor.model.workspace.Dijagram;
import grafickiEditor.model.workspace.Projekat;
import grafickiEditor.model.workspace.Workspace;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class WorkspaceDrvoKontroler implements TreeSelectionListener {
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		Object o = GrafickiEditor.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		Akcije akcije = GrafickiEditor.getInstance().getAkcija();
		if (o instanceof Projekat){
			akcije.getNoviDijagram().setEnabled(true);
			((Workspace)GrafickiEditor.getInstance().getWorkspaceTree().getRoot()).setAktivniProjekat((Projekat)o);
			GrafickiEditor.getInstance().getLabel().setText(((Projekat)o).toString());
		}
		else if(o instanceof Dijagram){
			Dijagram d = (Dijagram)o;
			((Workspace)GrafickiEditor.getInstance().getWorkspaceTree().getRoot()).setAktivniProjekat(d.getProjekat());
			GrafickiEditor.getInstance().getLabel().setText(((Dijagram)o).getProjekat().toString()+ "/" + ((Dijagram)o).toString());
		}
		else 
			akcije.getNoviDijagram().setEnabled(false);
		}

}
