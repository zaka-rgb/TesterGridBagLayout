import javax.swing.*;
import java.awt.*;
 class Fenetre5 extends JFrame
 {
 private JButton bouton1, bouton2, bouton3, bouton4, bouton5;
 public Fenetre5(String titre)
 {
	
 setTitle(titre);
 setSize(500, 300);
 Container c = getContentPane();
 
 
 
 c.setLayout(new GridLayout(2, 3) );
 
 
 
 bouton1 = new JButton("BOUTON1");
 c.add(bouton1,"1");
 bouton2 = new JButton("BOUTON2");
 c.add(bouton2, "2");
 bouton3 = new JButton("BOUTON3");
 c.add(bouton3, "3");
 bouton4 = new JButton("BOUTON4");
 c.add(bouton4, "4");
 bouton5 = new JButton("BOUTON5");
 c.add(bouton5, "5");
 setLocationRelativeTo(this.getParent());
 setDefaultCloseOperation(3);
 
 }
 

 
 public static void main(String [] args)
 {
 JFrame f = new Fenetre5("Mise en forme : SMI-S6-2015");
 f.setVisible(true);
 }
 }