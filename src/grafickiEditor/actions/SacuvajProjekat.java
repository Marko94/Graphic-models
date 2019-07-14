package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SacuvajProjekat extends MyAction{

	public SacuvajProjekat(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		putValue(NAME,"Sacuvaj projekat");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/saveproject.png"));
		putValue(SHORT_DESCRIPTION,"Sacuvaj projekat");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Sacuvaj projekat");
	}

}
