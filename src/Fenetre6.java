import javax.swing.*;
import java.awt.*;

 class Fenetre6 extends JFrame
 {
 private JButton bouton1, bouton2, bouton3, bouton4, bouton5;
private Box boxHorizontal;
 public Fenetre6(String titre)
 {
 setTitle(titre);
 setSize(500, 300);
 Container c = getContentPane();

 boxHorizontal = Box.createHorizontalBox();
 c.add(boxHorizontal);

 bouton1 = new JButton("BOUTON1");
 boxHorizontal.add(bouton1);
 bouton2 = new JButton("BOUTON2");
 boxHorizontal.add(bouton2);
 bouton3 = new JButton("BOUTON3");
 boxHorizontal.add(bouton3);
 bouton4 = new JButton("BOUTON4");
 boxHorizontal.add(bouton4);
 bouton5 = new JButton("BOUTON5");
 boxHorizontal.add(bouton5);

 setLocationRelativeTo(this.getParent());
 setDefaultCloseOperation(3);
 }
 


 public static void main(String [] args)
 {
 JFrame f = new Fenetre6("Mise en forme : SMI-S6-2015");
 f.setVisible(true);
 }
}