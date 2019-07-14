package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.actions.Akcije;
import grafickiEditor.actions.Preimenuj;

import javax.swing.JPopupMenu;

public class PopupMeni extends JPopupMenu{

	public PopupMeni(){
		Akcije akcije = GrafickiEditor.getInstance().getAkcija();
		add(new Preimenuj());
		add(akcije.getNoviDijagram());
		add(akcije.getIzbrisiDijagram());
	}
	
}
