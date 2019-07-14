package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;

public class OtvoriProjekatIkonica  extends MyAction{

	public OtvoriProjekatIkonica(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		putValue(NAME,"Otvori Projekat");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/OtvoriProjekat.png"));
		putValue(SHORT_DESCRIPTION,"Otvori Projekat");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Otvori projekat");
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(GrafickiEditor.getInstance());
	}
}
