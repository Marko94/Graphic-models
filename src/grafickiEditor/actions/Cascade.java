package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Cascade extends MyAction{

	public Cascade(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
		putValue(NAME,"Prikazi kaskadirane prozore");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/cascade.png"));
		putValue(SHORT_DESCRIPTION,"Prikazi kaskadirane prozore");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Prikazi kaskadirane prozore");
		GrafickiEditor.getInstance().cascade();
	}

}
