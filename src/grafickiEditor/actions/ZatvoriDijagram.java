package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

public class ZatvoriDijagram extends MyAction{

	public ZatvoriDijagram(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK));
		putValue(NAME,"Zatvori ovaj dijagram");
		putValue(SHORT_DESCRIPTION,"Zatvori ovaj dijagram");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Zatvori ovaj dijagram");
		JDesktopPane desktopPane = GrafickiEditor.getInstance().getDesktopPane();
		JInternalFrame selektovaniFrejm  = desktopPane.getSelectedFrame();
		
		if(selektovaniFrejm != null)
			selektovaniFrejm.dispose();
		
	}
}
