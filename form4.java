// TIME SHEDULE

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form4 extends JFrame implements ActionListener
{
	JPanel p;
	JLabel l1,l2,l4,l5,l7,l8,l;
	JRadioButton l3,l6,l9;
	ButtonGroup g;
	JButton b1,b2;
    ImageIcon img;

	
	form4()
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
		
		img = new ImageIcon(getClass().getResource("800.JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		p.add(l);
		
		l1 = new JLabel(" Fri,15 Aug 2022");
		l1.setFont(new Font("Serif",Font.BOLD,20));
		l1.setForeground(Color.black);
		l1.setBounds(320,40,450,50);
		l.add(l1);
		
		l2 = new JLabel(" 6:05 PM ");
		l2.setFont(new Font("Serif",Font.BOLD,17));
		l2.setForeground(Color.black);
		l2.setBounds(350,70,150,30);
		l.add(l2);
		
		l3 = new JRadioButton("   Liverpool   VS   Crystal Palace ");
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.blue);
		l3.setBounds(220,100,380,30);
		l3.addActionListener(this);
		l.add(l3);
		
		l4 = new JLabel(" Sat,16 Aug 2022 ");
		l4.setFont(new Font("Serif",Font.BOLD,20));
		l4.setForeground(Color.black);
		l4.setBounds(320,180,350,30);
		l.add(l4);
		
		l5 = new JLabel(" 7.00 PM ");
		l5.setFont(new Font("Serif",Font.BOLD,17));
		l5.setForeground(Color.black);
		l5.setBounds(350,210,350,30);
		l.add(l5);
		
		l6 = new JRadioButton(" Tottenham   VS   Man United ");
		l6.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l6.setForeground(Color.blue);
		l6.setBounds(220,240,360,30);
		l6.addActionListener(this);
		l.add(l6);
		
		l7 = new JLabel(" Sun,17 Aug 2022 ");
		l7.setFont(new Font("Serif",Font.BOLD,20));
		l7.setForeground(Color.black);
		l7.setBounds(320,320,350,30);
		l.add(l7);
		
		l8 = new JLabel(" 1.00 AM ");
		l8.setFont(new Font("Serif",Font.BOLD,17));
		l8.setForeground(Color.black);
		l8.setBounds(350,350,350,30);
		l.add(l8);
		
		l9 = new JRadioButton("    Cologne   VS   CF America ");
		l9.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l9.setForeground(Color.blue);
		l9.setBounds(220,390,350,30);
		l9.addActionListener(this);
		l.add(l9);
		
		b1 = new JButton("Back");
		b1.setBounds(100,470,100,30);
		b1.setBackground(Color.green);
        b1.addActionListener(this);
		l.add(b1);
		
		
		g.add(l3);
		g.add(l6);
		g.add(l9);
		
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
			else if(ae.getSource()==l3)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l6)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l9)
			{
				form5 f = new form5();
				this.setVisible(false);
				f.setVisible(true);
			}
		}


}
