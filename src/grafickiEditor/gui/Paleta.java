package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;

import javax.swing.JToolBar;

public class Paleta extends JToolBar{
	
	public Paleta(){
		
		setOrientation(VERTICAL);
		
		
		add(GrafickiEditor.getInstance().getAkcija().getSelekcija());
		
		addSeparator();
		
		add(GrafickiEditor.getInstance().getAkcija().getPravougaonik());
		
		addSeparator();
		
		add(GrafickiEditor.getInstance().getAkcija().getTrougao());
		
		addSeparator();
		
		add(GrafickiEditor.getInstance().getAkcija().getKrug());
	}
}
