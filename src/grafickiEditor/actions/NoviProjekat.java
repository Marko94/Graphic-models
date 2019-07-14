package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.model.workspace.Projekat;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class NoviProjekat extends MyAction{

	public NoviProjekat(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		putValue(NAME,"Napravi novi projekat");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/newproject.png"));
		putValue(SHORT_DESCRIPTION,"Napravi novi projekat");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		GrafickiEditor.getInstance().getWorkspaceTree().addProjekat();
		System.out.println("Napravi novi projekat");
	}

}
