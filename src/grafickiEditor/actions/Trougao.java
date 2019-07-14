package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Trougao extends MyAction{

	public Trougao(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_3,ActionEvent.CTRL_MASK));
		putValue(NAME,"Iscrtavanje trougla");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/triangle.png"));
		putValue(SHORT_DESCRIPTION,"Iscrtavanje trougla");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Iscrtavanje trougla");
	}

}
