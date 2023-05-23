import javax.swing.*;
import java.awt.*;
public class Exercice2 extends JFrame {
	
	public Exercice2(){
		this.setTitle("Exercice2");
		this.setSize(500, 500);
		this.setLocationRelativeTo(this.getParent());
		this.setDefaultCloseOperation(3);
		
		Container c=this.getContentPane();
		GridLayout gr=new GridLayout(7,7);
		c.setLayout(gr);
		
		
		
		
		
		
		for(int i=0;i<63;i++) {
			JPanel ii=new JPanel();
			c.add(ii);
			Color co=Color.white;
			Color coo=Color.gray;
			 
			if(i%2==0)
				ii.setBackground(co);
			else
			ii.setBackground(coo);
			
			
		}
		
	
	}
	public static void main(String [] args)
	{
		JFrame d=new Exercice2();
		d.setVisible(true);
	}	

}
