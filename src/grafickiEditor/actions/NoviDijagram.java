package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

public class NoviDijagram extends MyAction{

	public NoviDijagram(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		putValue(NAME,"Napravi novi dijagram");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/newdiagram.png"));
		putValue(SHORT_DESCRIPTION,"Napravi novi dijagram");
		setEnabled(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Napravi novi dijagram");
		GrafickiEditor.getInstance().getWorkspaceTree().addDijagram();
	}
}
