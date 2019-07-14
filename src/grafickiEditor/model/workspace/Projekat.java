package grafickiEditor.model.workspace;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.view.DiagramView;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

public class Projekat implements TreeNode {
	private int diagramCount=0;
	private String name;
	private ArrayList<Dijagram> dijagrami;
	
	public Projekat(String name){
		this.name = name;
		dijagrami = new ArrayList<>();
		dodajDijagram();
	}
	
	public void dodajDijagram(){
		String s = "";
		while(!proveriIme(s = name + " " + "Dijagram " + diagramCount));
		Dijagram d = new Dijagram(s , this );
		diagramCount++;	
		d.setProjekat(this);
		dijagrami.add(d);
	}	
	
	@Override
	public Enumeration children() {

		return (Enumeration)dijagrami;
	}

	public ArrayList<Dijagram> getDijagrami() {
		return dijagrami;
	}
	
	public void izbrisi(){
		for (Dijagram d: dijagrami)
			d.izbrisi();
		dijagrami.clear();
	}
	
	public void izbrisiDijagram(Dijagram d){
		d.izbrisi();
		dijagrami.remove(d);
		diagramCount--;
	}

	@Override
	public boolean getAllowsChildren() {

		return true;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {

		return dijagrami.get(childIndex);
	}

	@Override
	public int getChildCount() {

		return dijagrami.size();
	}

	@Override
	public int getIndex(TreeNode node) {

		return dijagrami.indexOf(node);
	}

	@Override
	public TreeNode getParent() {

		return null;
	}

	@Override
	public boolean isLeaf() {

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return name;
	}

	public boolean proveriIme(String ime){
		for(Dijagram d: dijagrami)
			if(d.getIme().equals(ime))
				return false;
			return true;
		
	}
	
	public void zatvoriSveDijagrame(){
		for(Dijagram d:dijagrami){
			DiagramView view = d.nadjiDiagramView();
			if(view != null)
				view.dispose();
		}
	}
	
}
