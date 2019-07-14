package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Krug extends MyAction{

	public Krug(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.CTRL_MASK));
		putValue(NAME,"Iscrtavanje kruga");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/circle.png"));
		putValue(SHORT_DESCRIPTION,"Iscrtavanje kruga");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Iscrtavanje kruga");
	}


}
