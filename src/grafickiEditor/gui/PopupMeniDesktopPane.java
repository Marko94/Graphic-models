package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.actions.Akcije;

import javax.swing.JPopupMenu;

public class PopupMeniDesktopPane extends JPopupMenu {

	public PopupMeniDesktopPane() {
		Akcije akcije = GrafickiEditor.getInstance().getAkcija();
		add(akcije.getPrethodniDijagram());
		add(akcije.getSledeciDijagram());
		add(akcije.getCascade());
		add(akcije.getTilehorizontally());
		add(akcije.getTileVertically());
	}
}
