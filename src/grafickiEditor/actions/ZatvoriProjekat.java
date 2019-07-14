package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.model.workspace.Projekat;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;
import javax.swing.tree.TreePath;

public class ZatvoriProjekat extends MyAction{

	public ZatvoriProjekat(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.ALT_MASK));
		putValue(NAME,"Zatvori ovaj projekat");
		putValue(SHORT_DESCRIPTION,"Zatvori ovaj projekat");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Zatvori ovaj projekat");
		TreePath path = GrafickiEditor.getInstance().getWorkspaceTree().getSelectionPath();
		Object o = GrafickiEditor.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		if(o instanceof Projekat){
			Projekat p = (Projekat)o;
			p.zatvoriSveDijagrame();
			GrafickiEditor.getInstance().getWorkspaceTree().collapsePath(path);
		}
		
	}
}
