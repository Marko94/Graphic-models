package grafickiEditor.controler;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.gui.WorkspaceDrvo;
import grafickiEditor.model.workspace.Dijagram;
import grafickiEditor.model.workspace.Projekat;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MojKeyListener implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_DELETE){
			WorkspaceDrvo drvo = GrafickiEditor.getInstance().getWorkspaceTree();
			Object o = drvo.getLastSelectedPathComponent();
			if(o instanceof Projekat){
				drvo.izbrisiProjekat((Projekat)o);
				GrafickiEditor.getInstance().getAkcija().getNoviDijagram().setEnabled(false);
			}else if(o instanceof Dijagram)
				drvo.izbrisiDijagram((Dijagram)o);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
