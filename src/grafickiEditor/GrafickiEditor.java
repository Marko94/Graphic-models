package grafickiEditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.beans.PropertyVetoException;

import grafickiEditor.actions.Akcije;
import grafickiEditor.controler.MojKeyListener;
import grafickiEditor.gui.Meni;
import grafickiEditor.gui.Paleta;
import grafickiEditor.gui.PopupMeniDesktopPane;
import grafickiEditor.gui.Toolbar;
import grafickiEditor.gui.WorkspaceDrvo;
import grafickiEditor.model.workspace.Workspace;
import grafickiEditor.view.DiagramView;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class GrafickiEditor extends JFrame{

	public ImageIcon ikon = new ImageIcon("logo.png");
	private Akcije akcija;
	private Meni meni;
	private Toolbar toolbar;
	private Paleta paleta;
	private static GrafickiEditor instance = null;
	private WorkspaceDrvo workspaceTree ;
	private JDesktopPane desktopPane;
	private JLabel label;
	private int mod = 0;
	private GrafickiEditor(){}
	
	
	//singleton
	public static GrafickiEditor getInstance(){
		if (instance==null){
			instance = new GrafickiEditor();
			instance.initialize();
		}
		return instance;
	}
	
	//inicijalizacija prozora sa GUI-jem
	private void initialize(){
	setTitle("Graficki editor!!!");
	setIconImage(ikon.getImage());
	setSize(1000,800);
	setLocationRelativeTo(null);
	akcija = new Akcije();
	meni = new Meni();
	toolbar = new Toolbar();
	desktopPane = new JDesktopPane();
	desktopPane.setFocusable(true);
	desktopPane.addKeyListener(new MojKeyListener());
	desktopPane.setComponentPopupMenu(new PopupMeniDesktopPane());
	paleta = new Paleta();
	label = new JLabel();
	label.setPreferredSize(new Dimension(1000,20));
	label.setHorizontalAlignment(JLabel.CENTER);
	setJMenuBar(new Meni());
	getContentPane().add(new Toolbar(), BorderLayout.NORTH);
	getContentPane().add(new Paleta(), BorderLayout.EAST);
	workspaceTree = new WorkspaceDrvo(new Workspace());
	JScrollPane scrollPane = new JScrollPane(workspaceTree);
	scrollPane.setMinimumSize(new Dimension(150,500));
	JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, desktopPane);
	
	splitPane.setDividerLocation(300);
	add(splitPane);
	add(label,BorderLayout.SOUTH);
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);	
	}
	
	
	public JLabel getLabel() {
		return label;
	}
	public Meni getMeni() {
		return meni;
	}
	public Toolbar getToolbar() {
		return toolbar;
	}
	public Paleta getPaleta() {
		return paleta;
	}
	public WorkspaceDrvo getWorkspaceTree() {
		return workspaceTree;
	}
	public JDesktopPane getDesktopPane() {
		return desktopPane;
	}
	public Akcije getAkcija() {
		return akcija;
	}
	public int getMod() {
		return mod;
	}
	
	
	public void cascade(){
		
		JInternalFrame[] frejmovi = desktopPane.getAllFrames();
		JInternalFrame selektovanFrejm = desktopPane.getSelectedFrame();
		int n=0;mod = 0;
		if(frejmovi.length>0){
			for(int i=frejmovi.length-1;i>=0 ;i--)
				if(!frejmovi[i].equals(selektovanFrejm)&&!frejmovi[i].isIcon()){
					frejmovi[i].setLocation(n*35, n++*30);
					frejmovi[i].setSize(450,450);
				}
						selektovanFrejm.setSize(450,450);
						selektovanFrejm.setLocation(n*35, n*30);
		}
	}
	
	public void tileHorizontally(){
		
		JInternalFrame[] frejmovi = desktopPane.getAllFrames();
		JInternalFrame selektovanFrejm = desktopPane.getSelectedFrame();
		int Sirina = desktopPane.getWidth();
		int visina = desktopPane.getHeight();
		if(frejmovi.length>0){
			int offset = desktopPane.getHeight() /  frejmovi.length;
			int n=0;mod = 1;
			for(int i=0;i<frejmovi.length;i++)
				if(!frejmovi[i].equals(selektovanFrejm)&&!frejmovi[i].isIcon()){
					frejmovi[i].setLocation(0, n++*offset);
					frejmovi[i].setSize(Sirina,offset);
				}
					selektovanFrejm.setLocation(0, n*offset);
					selektovanFrejm.setSize(Sirina, offset);
		}
	}

	public void tileVertically(){
		
		JInternalFrame[] frejmovi = desktopPane.getAllFrames();
		JInternalFrame selektovanFrejm = desktopPane.getSelectedFrame();
		int Sirina = desktopPane.getWidth();
		int visina = desktopPane.getHeight();
		if(frejmovi.length>0){
			int offset = desktopPane.getWidth() /  frejmovi.length;
			int n=0;mod = 2;
			for(int i=0;i<frejmovi.length;i++)
				if(!frejmovi[i].equals(selektovanFrejm)&&!frejmovi[i].isIcon()){
					frejmovi[i].setLocation(n++*offset,0);
					frejmovi[i].setSize(offset,visina);
				}
					selektovanFrejm.setLocation(n*offset, 0);
					selektovanFrejm.setSize(offset, visina);
		}
	}
}
