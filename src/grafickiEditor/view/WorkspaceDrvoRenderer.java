package grafickiEditor.view;

import grafickiEditor.model.workspace.Projekat;
import grafickiEditor.model.workspace.Workspace;

import java.awt.Component;
import java.io.ObjectInputStream.GetField;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class WorkspaceDrvoRenderer extends DefaultTreeCellRenderer{
		
		@Override
		public Component getTreeCellRendererComponent(JTree tree, Object value,boolean sel, boolean expanded, boolean leaf, int row,boolean hasFocus) {
			super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
			if(value instanceof Workspace){
				URL lokacija = getClass().getResource("images/workspace.png");
				setIcon(new ImageIcon(lokacija));
			}else if(value instanceof Projekat){
				if (expanded){
					URL lokacija = getClass().getResource("images/otvorenprojekat.gif");
					setIcon(new ImageIcon(lokacija));
				}else{
					URL lokacija = getClass().getResource("images/zatvorenprojekat.gif");
					setIcon(new ImageIcon(lokacija));
				}
			}else{
				URL lokacija = getClass().getResource("images/dijagram.png");
				setIcon(new ImageIcon(lokacija));
			}
			return this;
		}
}
