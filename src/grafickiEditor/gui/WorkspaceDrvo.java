package grafickiEditor.gui;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.controler.MojKeyListener;
import grafickiEditor.controler.TreeMouseListener;
import grafickiEditor.controler.WorkspaceDrvoKontroler;
import grafickiEditor.model.workspace.Dijagram;
import grafickiEditor.model.workspace.Projekat;
import grafickiEditor.model.workspace.Workspace;
import grafickiEditor.view.WorkspaceDrvoEditor;
import grafickiEditor.view.WorkspaceDrvoRenderer;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;

public class WorkspaceDrvo extends JTree{

	private TreeNode root;	
	
	public WorkspaceDrvo(TreeNode root){
			super(root);
			this.root=root;
			//setComponentPopupMenu(new PopupMeni());
			getSelectionModel().addTreeSelectionListener(new WorkspaceDrvoKontroler());
			setCellEditor(new WorkspaceDrvoEditor(this,new DefaultTreeCellRenderer()));
			setCellRenderer(new WorkspaceDrvoRenderer());
			addMouseListener(new TreeMouseListener());
			addKeyListener(new MojKeyListener());
			setEditable(true);
	}
		
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public void addProjekat(){
		((Workspace)root).addProjekat();
		SwingUtilities.updateComponentTreeUI(this);
}
	
	public void addProjekat(Projekat projekat){
			((Workspace)root).addProjekat(projekat);
			SwingUtilities.updateComponentTreeUI(this);
	}

	public void addDijagram(){
		((Workspace)root).addDijagramUAktivniProjekat();
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void izbrisiProjekat(Projekat p){
		((Workspace)root).izbrisiProjekat(p);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
	public void izbrisiDijagram(Dijagram d){
		d.getProjekat().izbrisiDijagram(d);
		SwingUtilities.updateComponentTreeUI(this);
	}
	
}
