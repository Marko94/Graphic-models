package grafickiEditor.actions;

import grafickiEditor.GrafickiEditor;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

public class SledeciDijagram extends MyAction{

	public SledeciDijagram(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		putValue(NAME,"Prebaci na sledeci dijagram");
		putValue(SMALL_ICON, napraviIkonicu("ikonice/desno.png"));
		putValue(SHORT_DESCRIPTION,"Prebaci na sledeci dijagram");
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Prebaci na sledeci dijagram");
		JDesktopPane desktopPane = GrafickiEditor.getInstance().getDesktopPane();
		JInternalFrame[] frejmovi = desktopPane.getAllFrames();
		JInternalFrame selektovaniFrejm = desktopPane.getSelectedFrame();
		int index = 0;
		if(frejmovi.length > 0){
			for(int i = 0; i < frejmovi.length; i++)
				if(frejmovi[i].equals(selektovaniFrejm))
				         index = i+1;
			index  %= frejmovi.length;
			selektovaniFrejm.toBack();
			try{
				frejmovi[index].setSelected(true);
			}catch (PropertyVetoException ex){
				ex.printStackTrace();
			}
		}	
	}

}
