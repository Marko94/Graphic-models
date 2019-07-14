package grafickiEditor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class ZatvoriProgram extends MyAction{

	public ZatvoriProgram(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
		putValue(NAME,"Zatvori program");
		putValue(SHORT_DESCRIPTION,"Zatvori program");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
		System.out.println("Zatvori program");
	}
	
}
