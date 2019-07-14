package grafickiEditor.model.workspace;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.model.DijagramModel;
import grafickiEditor.view.DiagramView;

import java.beans.PropertyVetoException;
import java.util.Enumeration;

import javax.swing.JInternalFrame;
import javax.swing.tree.TreeNode;

public class Dijagram implements TreeNode{
	
	private String ime;
	private DijagramModel dijagramModel;
	private Projekat projekat;

	public Dijagram(String ime, Projekat p){
		this.ime = ime;
		projekat = p;
		DiagramView view = new DiagramView(this);
		GrafickiEditor.getInstance().getDesktopPane().add(view);
		
		try{
			view.setSelected(true);
		}
		catch (PropertyVetoException e){
			e.printStackTrace();
		}
		
		switch(GrafickiEditor.getInstance().getMod()){
			case 0:GrafickiEditor.getInstance().cascade();break;
			case 1:GrafickiEditor.getInstance().tileHorizontally();break;
			case 2:GrafickiEditor.getInstance().tileVertically();break;
		}
	}
	
	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
		DiagramView view = nadjiDiagramView();
			if(view != null)
				view.setTitle(ime);
	}



	public DijagramModel getDijagramModel() {
		return dijagramModel;
	}



	public void setDijagramModel(DijagramModel dijagramModel) {
		this.dijagramModel = dijagramModel;
	}

	public Projekat getProjekat() {
		return projekat;
	}

	public void setProjekat(Projekat projekat) {
		this.projekat = projekat;
	}
	
	
	public DiagramView nadjiDiagramView()
	 {
	  for(JInternalFrame frame : GrafickiEditor.getInstance().getDesktopPane().getAllFrames())
	   if(((DiagramView)frame).getDijagram().equals(this))
	    return (DiagramView)frame;
	  return null;
	 }
	
	public void izbrisi(){
		DiagramView view = nadjiDiagramView();
		if(view != null) view.dispose();
	}
	
	@Override
	public String toString() {
		return ime;
	}
	

	@Override
	public Enumeration children() {

		return null;
	}

	@Override
	public boolean getAllowsChildren() {

		return false;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {

		return null;
	}

	@Override
	public int getChildCount() {

		return 0;
	}

	@Override
	public int getIndex(TreeNode node) {

		return 0;
	}

	@Override
	public TreeNode getParent() {

		return projekat;
	}

	@Override
	public boolean isLeaf() {

		return true;
	}
}
