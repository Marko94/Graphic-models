package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.actions.Cascade;
import grafickiEditor.actions.NoviDijagram;
import grafickiEditor.actions.NoviProjekat;
import grafickiEditor.actions.OEditoru;
import grafickiEditor.actions.OtvoriProjekatIkonica;
import grafickiEditor.actions.OtvoriWorkspaceIkonica;
import grafickiEditor.actions.PrethodniDijagram;
import grafickiEditor.actions.SacuvajDijagram;
import grafickiEditor.actions.SacuvajProjekat;
import grafickiEditor.actions.SacuvajWorkspace;
import grafickiEditor.actions.SledeciDijagram;
import grafickiEditor.actions.TileHorizontally;
import grafickiEditor.actions.TileVertically;
import grafickiEditor.actions.ZatvoriDijagram;
import grafickiEditor.actions.ZatvoriProgram;
import grafickiEditor.actions.ZatvoriProjekat;
import grafickiEditor.actions.ZatvoriSveDijagrame;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Meni extends JMenuBar{
     public Meni(){
    //Meni
    	 JMenu fajl = new JMenu("Fajl");
    	 JMenu prozor = new JMenu("Prozor");
    	 JMenu pomoc = new JMenu("Pomoc");
    //mnemonici
    	 fajl.setMnemonic(KeyEvent.VK_F);
    	 prozor.setMnemonic(KeyEvent.VK_W);
    	 pomoc.setMnemonic(KeyEvent.VK_H);
    //dodavanje u fajl
    	 
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getNoviProjekat());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getNoviDijagram());
    	 fajl.addSeparator();
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getOtvoriWorkspaceIkonica());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getOtvoriProjekatIkonica());
    	 fajl.addSeparator();
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getSacuvajDijagram());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getSacuvajProjekat());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getSacuvajWorkspace());
    	 fajl.addSeparator();
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getZatvoriDijagram());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getZatvoriSveDijagrame());
    	 fajl.add(GrafickiEditor.getInstance().getAkcija().getZatvoriProjekat());
    	 fajl.addSeparator();
    	 fajl.add(new ZatvoriProgram());
    	 
    	 prozor.add(GrafickiEditor.getInstance().getAkcija().getSledeciDijagram());
    	 prozor.add(GrafickiEditor.getInstance().getAkcija().getPrethodniDijagram());
    	 prozor.addSeparator();
    	 prozor.add(GrafickiEditor.getInstance().getAkcija().getCascade());
    	 prozor.add(GrafickiEditor.getInstance().getAkcija().getTilehorizontally());
    	 prozor.add(GrafickiEditor.getInstance().getAkcija().getTileVertically());
    	 
    	 pomoc.add(new OEditoru());
    	 //dodavanje menija u JMenuBar	
    	 add(fajl);
    	 add(prozor);
    	 add(pomoc);
     }
}
