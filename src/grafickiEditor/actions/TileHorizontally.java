package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class TileHorizontally extends MyAction{

	public TileHorizontally(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.ALT_MASK));
		putValue(NAME,"Prikazi prozore jedan ispod drugog");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/horizontally.png"));
		putValue(SHORT_DESCRIPTION,"Prikazi prozore jedan ispod drugog");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Prikazi prozore jedan ispod drugog");
		GrafickiEditor.getInstance().tileHorizontally();
	}

}
