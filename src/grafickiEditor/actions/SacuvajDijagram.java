package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SacuvajDijagram extends MyAction{

	public SacuvajDijagram(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		putValue(NAME,"Sacuvaj dijagram");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/savediagram.png"));
		putValue(SHORT_DESCRIPTION,"Sacuvaj dijagram");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Sacuvaj dijagram");
	}
}
