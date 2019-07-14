package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SacuvajWorkspace extends MyAction{

	public SacuvajWorkspace(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
		putValue(NAME,"Sacuvaj workspace");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/saveworkspace.png"));
		putValue(SHORT_DESCRIPTION,"Sacuvaj workspace");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Sacuvaj workspace");
	}

}
