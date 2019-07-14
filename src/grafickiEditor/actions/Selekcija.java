package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Selekcija extends MyAction{

	public Selekcija(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.CTRL_MASK));
		putValue(NAME,"Udji u mod za selektovanje");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/cursor.png"));
		putValue(SHORT_DESCRIPTION,"Udji u mod za selektovanje");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Udji u mod za selektovanje");
	}
}
