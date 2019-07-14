package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

public class ZatvoriSveDijagrame extends MyAction{

	public ZatvoriSveDijagrame(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.ALT_MASK+ActionEvent.SHIFT_MASK));
		putValue(NAME,"Zatvori sve dijagrame");
		putValue(SHORT_DESCRIPTION,"Zatvori sve dijagrame");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Zatvori sve dijagrame");
		JDesktopPane desktopPane = GrafickiEditor.getInstance().getDesktopPane();
		JInternalFrame[] frejmovi  = desktopPane.getAllFrames();
		
		for( int i = 0; i < frejmovi.length; i++){
			System.out.println("zatvoren");
			frejmovi[i].dispose();}
	}

}
