import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticket extends JFrame implements ActionListener
{

   
	JPanel X;
	JLabel X1,X2,X3,X4,X5,X6,X7,X8,X9,l;
	JButton b1,b2;
	ImageIcon img;
	             
	
	Ticket()
	{
                                         
		super(" TICKET");	
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            
		
		X = new JPanel();
		X.setSize(new Dimension(450,300));
		X.setBackground(Color.GRAY);
		X.setLayout(null);
		
	   	img = new ImageIcon(getClass().getResource("sunset.JPG"));
		
		l = new JLabel(img);
		l.setBounds(0,7,img.getIconWidth(),550);
		X.add(l);
		
		X1 = new JLabel(" THANK YOU FOR PURCHASING TICKET");
		X1.setFont(new Font("TimesRoman",Font.ITALIC,30));
		X1.setForeground(Color.blue);
		X1.setBounds(90,20,3000,30);
		l.add(X1);
                
        X2 = new JLabel("MATCH DETAILS:");
		X2.setFont(new Font("Comic Sans MS",Font.BOLD,22));
		X2.setForeground(Color.black);
		X2.setBounds(200,100,500,30);
		l.add(X2);
                
                                           
		
		X3 = new JLabel("Zone         : 1st class ");
		X3.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		X3.setForeground(Color.white);
		X3.setBounds(200,170,350,30);
		l.add(X3);
                
                                            
                
                 
		
		X4= new JLabel("Date         : 22 july 2022 ");
		X4.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		X4.setForeground(Color.white);
		X4.setBounds(200,230,350,30);
		l.add(X4);
                
                
		
		X5 = new JLabel("Seat         : A5");
		X5.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		X5.setForeground(Color.white);
		X5.setBounds(200,200,350,30);
		l.add(X5);
                
              
		
	    X6 = new JLabel("Time         : 10pm");
		X6.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		X6.setForeground(Color.white);
		X6.setBounds(200,260,350,30);
		l.add(X6);
                
                
        X7 = new JLabel("ENJOY YOUR MATCH");
		X7.setFont(new Font("Comic Sans MS",Font.ITALIC,25));
		X7.setForeground(Color.blue);
		X7.setBounds(250,400,350,30);
		l.add(X7);
                
        X8 = new JLabel("===================================================================");
		X8.setFont(new Font("Comic Sans MS",Font.CENTER_BASELINE,18));
		X8.setForeground(Color.white);
		X8.setBounds(20,420,780,50);
		l.add(X8);
                
                
        X9 = new JLabel("Venue        : Allegiant Stadium");
		X9.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		X9.setForeground(Color.white);
		X9.setBounds(200,290,350,30);
		l.add(X9);       
		
		b1 = new JButton("Exit");
		b1.setBounds(570,470,100,30);
		b1.setBackground(Color.green);
        b1.addActionListener(this);
		l.add(b1);
		
		b2 = new JButton("Re-booking");
		b2.setBounds(100,470,100,30);
		b2.setBackground(Color.green);
        b2.addActionListener(this);
		l.add(b2);
                
        this.add(X);
		
	}


	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b2)
			{	
			 	form4 f = new form4();
			    this.setVisible(false);
                f.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
			    System.exit(0);
			}
		}


}
	