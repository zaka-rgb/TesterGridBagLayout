import javax.swing.*;
import java.awt.*;
public class Exercice1 extends JFrame{

	public Exercice1(){
	this.setTitle("Exercice1");
	this.setSize(500, 500);
	this.setLocationRelativeTo(this.getParent());
	this.setDefaultCloseOperation(3);
	
	Container c=this.getContentPane();
	
	JButton b0=new JButton("0");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton bp=new JButton(".");
	JButton be=new JButton("=");

	
	JPanel pan1=new JPanel();
	JPanel pan2=new JPanel();
	JPanel pan3=new JPanel();
	JPanel pan4=new JPanel();
	
	
	c.add(pan2);
	c.add(pan3,"East");
	
	
	JTextField txt=new JTextField(15);
	c.add(txt,"North");
	

	

	
	GridLayout grid=new GridLayout(4,3);
	pan2.setLayout(grid);
	
	pan2.add(b0);
	pan2.add(b1,"2");
	pan2.add(b2,"3");
	pan2.add(b3,"4");
	pan2.add(b4,"5");
	pan2.add(b5,"6");
	pan2.add(b6,"7");
	pan2.add(b7,"8");
	pan2.add(b8,"9");
	pan2.add(b9,"10");
	pan2.add(bp,"11");
	pan2.add(be);
	
	
	GridLayout grid2= new GridLayout(4,1);
	pan3.setLayout(grid2);
	JButton bpl =new JButton("+");
	JButton bm = new JButton("-");
	JButton bml =new JButton("*");
	JButton bd = new JButton("/");
	
	pan3.add(bpl);
	pan3.add(bm);
	pan3.add(bml);
	pan3.add(bd);
	
	
	}

public static void main(String [] args)
{
	JFrame d=new Exercice1();
	d.setVisible(true);
}	
}
