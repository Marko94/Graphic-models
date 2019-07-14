package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Icon;

public class OEditoru extends MyAction{

	public OEditoru(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		putValue(NAME,"Informacije o editoru");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/info.png"));
		putValue(SHORT_DESCRIPTION,"Informacije o editoru");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null, "Student: Marko Nenadovic RN 41/14 \n email: mnenadovic14@raf.edu.rs", "O Editoru", 0, napraviIkonicu("ikonice/about.png"));
		System.out.println("Informacije o editoru");
	}
}
