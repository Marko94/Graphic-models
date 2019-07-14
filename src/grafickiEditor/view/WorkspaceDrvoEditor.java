package grafickiEditor.view;

import grafickiEditor.GrafickiEditor;
import grafickiEditor.model.workspace.Dijagram;
import grafickiEditor.model.workspace.Projekat;
import grafickiEditor.model.workspace.Workspace;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.EventObject;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;

public class WorkspaceDrvoEditor extends DefaultTreeCellEditor implements ActionListener {

	private JTextField textField;
	
	public WorkspaceDrvoEditor(JTree tree, DefaultTreeCellRenderer renderer) {
		super(tree, renderer);	
	}
	/*
	@Override
	public boolean isCellEditable(EventObject event) {
		if(event instanceof MouseEvent && ((MouseEvent)event).getClickCount() == 2)
		{
			Object o = GrafickiEditor.getInstance().getWorkspaceTree().getLastSelectedPathComponent();	
			if(o instanceof Dijagram){
				selektujDijagram((Dijagram)o);	
			}	
			else if(event instanceof KeyEvent && ((KeyEvent)event).getKeyCode() == KeyEvent.VK_ENTER)
				return true;
		}
		return false;
	}
	*/

	
	@Override
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row) {
		JPanel panel = new JPanel();
		JLabel slika = new JLabel(new ImageIcon());
		
		if(value instanceof Workspace){
			URL lokacija = getClass().getResource("images/workspace.png");
			slika = new JLabel(new ImageIcon(lokacija));
		}else if(value instanceof Projekat){
			if (expanded){
				URL lokacija = getClass().getResource("images/otvorenprojekat.gif");
				slika = new JLabel(new ImageIcon(lokacija));
			}else{
				URL lokacija = getClass().getResource("images/zatvorenprojekat.gif");
				slika = new JLabel(new ImageIcon(lokacija));
			}
		}else{
			URL lokacija = getClass().getResource("images/dijagram.png");
			slika = new JLabel(new ImageIcon(lokacija));
		}
		
		textField = new JTextField(value.toString());
		textField.setPreferredSize(new Dimension(150,26));
		textField.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(value instanceof Projekat){
					Projekat p = ((Projekat)value);
				if (((Workspace)GrafickiEditor.getInstance().getWorkspaceTree().getRoot()).proveriIme(textField.getText()))
					p.setName(textField.getText());
					GrafickiEditor.getInstance().getLabel().setText(p.getName());
				}
				else if(value instanceof Dijagram){
					Dijagram d = (Dijagram)value;
					if(d.getProjekat().proveriIme(textField.getText())){
					d.setIme(textField.getText());
					GrafickiEditor.getInstance().getLabel().setText(d.getProjekat().getName() + " - " + textField.getText());
					}
				}
				try {
					GrafickiEditor.getInstance().getWorkspaceTree().stopEditing();
				} catch (ClassCastException e2) {
				}
			}
		});
		
		panel.add(slika);
		panel.add(textField);
		return panel;
	}

	@Override
	public boolean isCellEditable(EventObject event) {
		if(event == null)
			return true;
		return false;
	}
}
