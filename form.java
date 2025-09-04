// HOME PAGE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l,l1;
	JButton b1,b2,b3;
	ImageIcon img;
	
	form()
	{
		super(" FootBall Ticket ");	
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(new Dimension(450,300));
		p.setBackground(Color.gray);
		p.setLayout(null);
		
		img = new ImageIcon(getClass().getResource("Bunyodkor.PNG"));
		
		l = new JLabel(img);
		l.setBounds(25,5,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel("FootBall Management System");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(110,10,600,50);
		l.add(l1);
		
		b1 = new JButton("Log In");
		b1.setBounds(160,430,120,30);
		b1.setBackground(Color.green);
		b1.addActionListener(this);
		l.add(b1);
		
		b2 = new JButton("Sign Up");
		b2.setBounds(450,430,120,30);
		b2.setBackground(Color.green);
		b2.addActionListener(this);
		l.add(b2);
		
		
		b3 = new JButton(" Exit ");
		b3.setBounds(600,500,120,30);
		b3.setBackground(Color.red);
		b3.addActionListener(this);
		l.add(b3);
		
		this.add(p);
		
	}


	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    form2 f = new form2();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
			    form3 f = new form3();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit this program?","quit",JOptionPane.YES_NO_OPTION);
				
				if(choice == JOptionPane.YES_OPTION)
				{
					
				   System.exit(0);
				   
				}
				else 
				{
					form f = new form();
				    this.setVisible(false);
				    f.setVisible(true);
			    }
			}
		}


}
