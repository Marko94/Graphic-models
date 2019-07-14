package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class TileVertically extends MyAction{

	public TileVertically(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.ALT_MASK));
		putValue(NAME,"Prikazi prozore jedan pored drugog");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/vertically.png"));
		putValue(SHORT_DESCRIPTION,"Prikazi prozore jedan pored drugog");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Prikazi prozore jedan pored drugog");
		GrafickiEditor.getInstance().tileVertically();
	}

}
