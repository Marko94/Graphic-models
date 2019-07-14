package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.actions.ZatvoriProgram;

import javax.swing.JToolBar;

public class Toolbar extends JToolBar {

	public Toolbar(){
		add(GrafickiEditor.getInstance().getAkcija().getNoviProjekat());
   	 	add(GrafickiEditor.getInstance().getAkcija().getNoviDijagram());
   	 	
   	 	addSeparator();
   	 	
   	 	add(GrafickiEditor.getInstance().getAkcija().getOtvoriWorkspaceIkonica());
   	 	add(GrafickiEditor.getInstance().getAkcija().getOtvoriProjekatIkonica());
   	 	
   	 	addSeparator();
   	 	
   	 	add(GrafickiEditor.getInstance().getAkcija().getSacuvajDijagram());
   	 	add(GrafickiEditor.getInstance().getAkcija().getSacuvajProjekat());
   	 	add(GrafickiEditor.getInstance().getAkcija().getSacuvajWorkspace());
   	 	
   	 	addSeparator();
   	 	
   	 	add(GrafickiEditor.getInstance().getAkcija().getZatvoriDijagram());
   	 	add(GrafickiEditor.getInstance().getAkcija().getZatvoriSveDijagrame());
   	 	add(GrafickiEditor.getInstance().getAkcija().getZatvoriProjekat());
   	 	
   	 	addSeparator();
   	 
   	 	add(GrafickiEditor.getInstance().getAkcija().getPrethodniDijagram());
   	 	add(GrafickiEditor.getInstance().getAkcija().getSledeciDijagram());
   	 	
   	 	addSeparator();
   	 	
   	 	add(GrafickiEditor.getInstance().getAkcija().getCascade());
   	 	add(GrafickiEditor.getInstance().getAkcija().getTilehorizontally());
   	 	add(GrafickiEditor.getInstance().getAkcija().getTileVertically());
	}
	
}
