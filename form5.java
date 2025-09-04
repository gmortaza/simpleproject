//SEAT BOOKING

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form5 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l;
	JRadioButton l3,l4;
	ButtonGroup g;
	JButton b1,b2;
	ImageIcon img;
	
	form5()
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
		
		g = new ButtonGroup();
		
		img = new ImageIcon(getClass().getResource("Cap.PNG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel(" FootBall Ticket");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(250,50,450,50);
		l.add(l1);
		
		l2 = new JLabel("Choose Class : ");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.black);
		l2.setBounds(230,200,370,30);
		l.add(l2);
		
		l3 = new JRadioButton("1st Class ");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l3.setForeground(Color.blue);
		l3.setBounds(350,270,150,30);
		l3.addActionListener(this);
		l.add(l3);
		
		l4 = new JRadioButton("2nd Class ");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l4.setForeground(Color.blue);
		l4.setBounds(350,330,150,30);
		l4.addActionListener(this);
		l.add(l4);
		
		
		b2 = new JButton("Back");
		b2.setBounds(100,470,100,30);
		b2.setBackground(Color.green);
		b2.addActionListener(this);
		l.add(b2);
		
		g.add(l3);
		g.add(l4);
				
		this.add(p);
		
	}
	

	
public void actionPerformed(ActionEvent ae)
		{
		    
			if(ae.getSource()==l3)
			{
			form6 f = new form6();
			this.setVisible(false);
			f.setVisible(true);	
			}
			
			else if(ae.getSource()==l4)
			{
			form7 f = new form7();
			this.setVisible(false);
			f.setVisible(true);	
			}
			
			else if(ae.getSource()==b2)
			{
				form4 f = new form4();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}

