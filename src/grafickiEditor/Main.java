package grafickiEditor;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Painter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	public static void main(String[] args){
		staviTemu();
		//uzimanje instance
		GrafickiEditor.getInstance();
	}
	
	public static void staviTemu(){
		//podesavanje look and feel-a
		try 
		  {
		   for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		    if(info.getName().equals("Nimbus"))
		     UIManager.setLookAndFeel(info.getClassName());
		   	 
		   	 Image  img = new ImageIcon("background1.png").getImage();
		  
		   	 UIManager.put("nimbusBase", new Color(70, 70, 70)); 
		   	 UIManager.put("control", new Color(220, 220, 220));
		   	 UIManager.put("ToolBar.background", new Color(0, 0, 250));
		   	 UIManager.getLookAndFeelDefaults().put("DesktopPane[Enabled].backgroundPainter", new Painter<JComponent>() {

				@Override
				public void paint(Graphics2D g, JComponent object, int width, int height) {
					//g.setColor(new Color(100,184,243));
					//g.fillRect(0, 0, width, height);
					g.drawImage(img, 0, 0, width, height, null);
	
					
				}
			}); 
		   	 UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
		   	 UIManager.getLookAndFeelDefaults().put("MenuBar:Menu[Selected].backgroundPainter", new Painter<JComponent>()
	                {
	                        @Override
	                        public void paint(Graphics2D g, JComponent object, int width, int height)
	                        {
	                                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	                                g.setColor(new Color(90, 90, 90));
	                                g.fillRect(0, 0, width, height);
	                        }
	                });	 
		   	
		   	UIManager.put("nimbusSelectionBackground", new Color(235, 235, 235));	   	
		  } 
	    catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) 
		  {
			  	e.printStackTrace();
		  }
	}
}
