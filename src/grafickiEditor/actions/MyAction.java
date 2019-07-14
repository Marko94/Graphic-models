package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class MyAction extends AbstractAction{

	public Icon napraviIkonicu(String ime){
		
		URL URLikonice =getClass().getResource(ime);
		Icon ikonica = null;
		
		if(URLikonice!= null)
			ikonica = new ImageIcon(URLikonice);
		else
			System.err.println("GRESKA!");
			
		return ikonica;		
	}
}
	
