package grafickiEditor.view;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.controler.MojKeyListener;
import grafickiEditor.model.workspace.Dijagram;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.tree.TreePath;

public class DiagramView extends JInternalFrame{

	private Dijagram dijagram;


	
	public DiagramView(Dijagram d){
		dijagram = d;
		this.setSize(450,450);
		int n = GrafickiEditor.getInstance().getDesktopPane().getComponentCount();
		setLocation(n*35, n*30);				
		setName(dijagram.getIme());
		setTitle(dijagram.getIme());
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setIconifiable(true);
		setFocusable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
				addKeyListener(new MojKeyListener());
		addInternalFrameListener(new InternalFrameListener() {
			
			@Override
			public void internalFrameOpened(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameIconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeiconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeactivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameActivated(InternalFrameEvent e) {
				Object[] a = new Object[3];
				a[0] = GrafickiEditor.getInstance().getWorkspaceTree().getRoot();
				a[1] = dijagram.getProjekat();
				a[2] = dijagram;
				GrafickiEditor.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(a));

			}
						
		});
		
		setVisible(true);
	}



	public Dijagram getDijagram() {
		return dijagram;
	}
}
