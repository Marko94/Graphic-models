package grafickiEditor.controler;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.gui.PopupMeni;
import grafickiEditor.gui.WorkspaceDrvo;
import grafickiEditor.model.workspace.Dijagram;
import grafickiEditor.model.workspace.Projekat;
import grafickiEditor.model.workspace.Workspace;
import grafickiEditor.view.DiagramView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.tree.TreePath;

public class TreeMouseListener implements MouseListener{
	PopupMeni pm = new PopupMeni();
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3){
			WorkspaceDrvo drvo = GrafickiEditor.getInstance().getWorkspaceTree();
			TreePath t = GrafickiEditor.getInstance().getWorkspaceTree().getPathForLocation(e.getX(), e.getY());
			if(t != null && !(t.getLastPathComponent() instanceof Workspace)){
				if(t.getLastPathComponent() instanceof Projekat)
					GrafickiEditor.getInstance().getAkcija().getIzbrisiDijagram().setEnabled(false);
				else
					GrafickiEditor.getInstance().getAkcija().getIzbrisiDijagram().setEnabled(true);
				pm.show(GrafickiEditor.getInstance().getWorkspaceTree(), e.getX(), e.getY());
				drvo.getSelectionModel().setSelectionPath(t);
				
			}
		}
		else if(e.getButton() == MouseEvent.BUTTON1 && e.getClickCount()==2)
		{
			Object o = GrafickiEditor.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
			if(o instanceof Dijagram)
				selektujDijagram((Dijagram)o);
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	private void selektujDijagram(Dijagram d){
		JInternalFrame[] frejmovi = (JInternalFrame[])GrafickiEditor.getInstance().getDesktopPane().getAllFrames();
		
		boolean otvoren = false;
		int index = 0;
		for(int i = 0 ; i < frejmovi.length; i++)
			if(((DiagramView)frejmovi[i]).getDijagram().equals(d)){
				otvoren = true;
				index = i;
				break;
			}
			if(otvoren){
				try{
					frejmovi[index].setSelected(true);
				}
				catch(PropertyVetoException e){
					e.printStackTrace();
				}
			}else{
				DiagramView view = new DiagramView(d);
				GrafickiEditor.getInstance().getDesktopPane().add(view);
				try{
					view.setSelected(true);
				}
				catch(PropertyVetoException e){
					e.printStackTrace();
				}
			}
	}
}
