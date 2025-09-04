// 2nd CLASS

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form7 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l;
	JTextField t1,t2,t3;
	JButton b1,b2;
	ImageIcon img;
	
	form7()
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
		
		img = new ImageIcon(getClass().getResource("HD.JPG"));
		
		l = new JLabel(img);
		l.setBounds(2,2,img.getIconWidth(),580);
		p.add(l);
		
		
		l1 = new JLabel(" FootBall Ticket");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(250,50,450,50);
		l.add(l1);
		
		l2 = new JLabel("Ticket         : ");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l2.setForeground(Color.white);
		l2.setBounds(180,170,350,30);
		l.add(l2);
		
		l3 = new JLabel("Seat Number : ");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l3.setForeground(Color.white);
		l3.setBounds(180,220,350,30);
		l.add(l3);
		
		l4 = new JLabel("Price           : ");
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l4.setForeground(Color.white);
		l4.setBounds(180,270,350,30);
		l.add(l4);
		
		l5 = new JLabel("Time           : ");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		l5.setForeground(Color.white);
		l5.setBounds(180,320,350,30);
		l.add(l5);
		
		l6 = new JLabel("   2nd Class");
		l6.setFont(new Font("Serif",Font.BOLD,18));
		l6.setForeground(Color.black);
		l6.setBounds(330,170,200,30);
		l6.setOpaque(true);
		l6.setBackground(Color.white);
		l.add(l6);
		
		l7 = new JLabel("   A2");
		l7.setFont(new Font("Serif",Font.BOLD,18));
		l7.setForeground(Color.black);
		l7.setBounds(330,220,200,30);
		l7.setOpaque(true);
		l7.setBackground(Color.white);
		l.add(l7);
		
		l8 = new JLabel("   1000 tk");
		l8.setFont(new Font("Serif",Font.BOLD,18));
		l8.setForeground(Color.black);
		l8.setBounds(330,270,200,30);
		l8.setOpaque(true);
		l8.setBackground(Color.white);
		l.add(l8);
		
		l9 = new JLabel("   11.30 AM");
		l9.setFont(new Font("Serif",Font.BOLD,18));
		l9.setForeground(Color.black);
		l9.setBounds(330,320,200,30);
		l9.setOpaque(true);
		l9.setBackground(Color.white);
		l.add(l9);
		
		
		b1 = new JButton("Next");
		b1.setBounds(550,470,100,30);
		b1.setBackground(Color.green);
		b1.addActionListener(this);
		l.add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(100,470,100,30);
		b2.setBackground(Color.green);
		b2.addActionListener(this);
		l.add(b2);
		
		this.add(p);
		
	}
	

public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==b1)
			{
				form8 f = new form8();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}