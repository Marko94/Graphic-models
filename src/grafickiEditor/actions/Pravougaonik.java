package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Pravougaonik extends MyAction{

	public Pravougaonik(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.CTRL_MASK));
		putValue(NAME,"Iscrtavanje pravougaonik");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/rectangle.png"));
		putValue(SHORT_DESCRIPTION,"Iscrtavanje pravougaonika");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Iscrtavanje ravougaonika");
	}

}
