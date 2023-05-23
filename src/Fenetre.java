import javax.swing.*;
import java.awt.*;




public class Fenetre extends JFrame {

	private JButton bo1;
	private JButton bo2;
	private JButton bo3;
	private JButton bo4;
	private JButton bo5;
	public Fenetre(String titre) {
		
		this.setTitle(titre);
		this.setVisible(true);
		this.setSize(300,150);
		
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel j1=new JPanel();
		j1.setBackground(Color.black);
		JPanel j2=new JPanel();
		j2.setBackground(Color.white);
		JPanel j3=new JPanel();
		j3.setBackground(Color.GREEN);
		
		/*j1.setLayout(new BorderLayout());
		j2.setLayout(new BorderLayout());
		j3.setLayout(new BorderLayout());*/
		bo1=new JButton("Bouton 1");
		bo2=new JButton("Bouton 2");
		bo3=new JButton("Bouton 3");
		bo4=new JButton("Bouton 4");
		bo5=new JButton("Bouton 5");
		//c.add(bo1);
		this.setLocationRelativeTo(this.getParent());
		this.setDefaultCloseOperation(3);
		
		c.add(j1,BorderLayout.NORTH);
		c.add(j2,BorderLayout.WEST);
		c.add(j3,BorderLayout.EAST);
		
		/*j1.add(bo1,BorderLayout.CENTER);
		j1.add(bo2,BorderLayout.SOUTH);
		j2.add(bo3,BorderLayout.EAST);
		j2.add(bo4,BorderLayout.WEST);
		j3.add(bo5,BorderLayout.NORTH);*/
		
		
		}
		 public static void main(String [] args)
		 {
		 JFrame f = new Fenetre("Mise en forme : SMI-S6-2015");
		 f.setVisible(true);
		 }
		
	
	
	
	
}
