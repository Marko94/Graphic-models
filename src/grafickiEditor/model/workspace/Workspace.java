package grafickiEditor.model.workspace;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.SwingUtilities;
import javax.swing.tree.TreeNode;

public class Workspace implements TreeNode{

	private ArrayList<Projekat> projekti;
	private static int projectCount = 0;
	private Projekat aktivniProjekat;
	
	public Workspace(){
		projekti= new ArrayList<>();
	}
	
	public ArrayList<Projekat> getProjekti() {
		return projekti;
	}
	@Override
	public String toString(){
		return "Workspace";
	}

	@Override
	public Enumeration children() {

		return null;
	}

	@Override
	public boolean getAllowsChildren() {

		return true;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {

		return getProjekat(childIndex);
	}

	@Override
	public int getChildCount() {

		return projekti.size();
	}

	@Override
	public int getIndex(TreeNode node) {

		return projekti.indexOf(node);
	}

	@Override
	public TreeNode getParent() {

		return null;
	}

	@Override
	public boolean isLeaf() {

		return false;
	}
	
	public Projekat getAktivniProjekat() {
			return aktivniProjekat;
		}
	
		public void setAktivniProjekat(Projekat aktivniProjekat) {
			this.aktivniProjekat = aktivniProjekat;
		}
	public void addProjekat(){
		String s = "";
		while(!proveriIme(s = "Projekat" + projectCount++));
		projekti.add(new Projekat(s));
	}
	
	public void addProjekat(Projekat p){
		projekti.add(p);
	}
	
	public void addDijagramUAktivniProjekat(){
		aktivniProjekat.dodajDijagram();
	}
	
	public Projekat getProjekat(int index){
		return projekti.get(index);
	}
	
	public boolean proveriIme(String ime){
		for(Projekat p: projekti)
			if(p.getName().equals(ime))
				return false;
			return true;
		
	}
	
	public void izbrisiProjekat(Projekat p){
		p.izbrisi();
		projekti.remove(p);
		projectCount--;
	}

	
}
