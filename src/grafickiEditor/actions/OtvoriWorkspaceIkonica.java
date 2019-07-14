package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;


public class OtvoriWorkspaceIkonica extends MyAction{

	public OtvoriWorkspaceIkonica(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.ALT_MASK));
		putValue(NAME,"Otvori Workspace");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/OtvoriWorkspace.png"));
		putValue(SHORT_DESCRIPTION,"Otvori Workspace");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Otvori workspace");
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(GrafickiEditor.getInstance());
	}
	
	
}
