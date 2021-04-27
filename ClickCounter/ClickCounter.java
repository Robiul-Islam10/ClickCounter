import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.util.*;

public class ClickCounter extends JFrame implements ActionListener
{	
	private JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,exit;
	private JLabel score;
	private JPanel panel;
	private Random a;
	int flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8,flag9,flag10;
	int point=0;
	
	public ClickCounter()
	{
		super("ClickCounter");
		
		a = new Random();
		
		this.setSize(500,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font myFont = new Font("Cambria", Font.PLAIN + Font.BOLD, 30);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		score = new JLabel("Score : ");
		score.setBounds(150,30, 200, 30);
		score.setBackground(Color.BLUE);
		score.setFont(myFont);
		panel.add(score);
		
		panel.add(n1 = new JButton("1"));
		n1.setBounds(100,100,100,50);
		n1.setBackground(Color.RED);
		n1.setForeground(Color.BLUE);
		n1.setFont(myFont);
		
		panel.add(n2 = new JButton("2"));
		n2.setBounds(100,200,100,50);
		n2.setBackground(Color.RED);
		n2.setForeground(Color.BLUE);
		n2.setFont(myFont);
		
		panel.add(n3 = new JButton("3"));
		n3.setBounds(100,300,100,50);
		n3.setBackground(Color.RED);
		n3.setForeground(Color.BLUE);
		n3.setFont(myFont);
		
		panel.add(n4 = new JButton("4"));
		n4.setBounds(100,400,100,50);
		n4.setBackground(Color.RED);
		n4.setForeground(Color.BLUE);
		n4.setFont(myFont);
		
		panel.add(n5 = new JButton("5"));
		n5.setBounds(100,500,100,50);
		n5.setBackground(Color.RED);
		n5.setForeground(Color.BLUE);
		n5.setFont(myFont);
		
		panel.add(n6 = new JButton("6"));
		n6.setBounds(250,100,100,50);
		n6.setBackground(Color.RED);
		n6.setForeground(Color.BLUE);
		n6.setFont(myFont);
		
		panel.add(n7 = new JButton("7"));
		n7.setBounds(250,200,100,50);
		n7.setBackground(Color.RED);
		n7.setForeground(Color.BLUE);
		n7.setFont(myFont);
		
		panel.add(n8 = new JButton("8"));
		n8.setBounds(250,300,100,50);
		n8.setBackground(Color.RED);
		n8.setForeground(Color.BLUE);
		n8.setFont(myFont);
		
		panel.add(n9 = new JButton("9"));
		n9.setBounds(250,400,100,50);
		n9.setBackground(Color.RED);
		n9.setForeground(Color.BLUE);
		n9.setFont(myFont);
		
		panel.add(n10 = new JButton("10"));
		n10.setBounds(250,500,100,50);
		n10.setBackground(Color.RED);
		n10.setForeground(Color.BLUE);
		n10.setFont(myFont);
		
		panel.add(exit = new JButton("EXIT"));
		exit.setBounds(120,600,200,60);
		exit.setBackground(Color.CYAN);
		exit.setForeground(Color.BLUE);
		exit.setFont(myFont);
		
		this.add(panel);
		
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		n10.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public void run()
	{
		long x, y=100000;
		
		while(y>0)
		{
			x = a.nextInt(10);
			try
			{
				if(x==1)
				{
					n1.setBackground(Color.GREEN);
					flag1=1;
					Thread.sleep(700);
					n1.setBackground(Color.RED);
					flag1=2;
					Thread.sleep(1500);
				}
				if(x==2)
				{
					n2.setBackground(Color.GREEN);
					flag2=1;
					Thread.sleep(700);
					n2.setBackground(Color.RED);
					flag2=2;
					Thread.sleep(1500);
				}
				if(x==3)
				{
					n3.setBackground(Color.GREEN);
					flag3=1;
					Thread.sleep(700);
					n3.setBackground(Color.RED);
					flag3=2;
					Thread.sleep(1500);
				}
				if(x==4)
				{
					n4.setBackground(Color.GREEN);
					flag4=1;
					Thread.sleep(700);
					n4.setBackground(Color.RED);
					flag4=2;
					Thread.sleep(1500);
				}
				if(x==5)
				{
					n5.setBackground(Color.GREEN);
					flag5=1;
					Thread.sleep(700);
					n5.setBackground(Color.RED);
					flag5=2;
					Thread.sleep(1500);
				}
				if(x==6)
				{
					n6.setBackground(Color.GREEN);
					flag6=1;
					Thread.sleep(700);
					n6.setBackground(Color.RED);
					flag6=2;
					Thread.sleep(1500);
				}
				if(x==7)
				{
					n7.setBackground(Color.GREEN);
					flag7=1;
					Thread.sleep(700);
					n7.setBackground(Color.RED);
					flag7=2;
					Thread.sleep(1500);
				}
				if(x==8)
				{
					n8.setBackground(Color.GREEN);
					flag8=1;
					Thread.sleep(700);
					n8.setBackground(Color.RED);
					flag8=2;
					Thread.sleep(1500);
				}
				if(x==9)
				{
					n9.setBackground(Color.GREEN);
					flag9=1;
					Thread.sleep(700);
					n9.setBackground(Color.RED);
					flag9=2;
					Thread.sleep(1500);
				}
				if(x==10)
				{
					n10.setBackground(Color.GREEN);
					flag10=1;
					Thread.sleep(700);
					n10.setBackground(Color.RED);
					flag10=2;
					Thread.sleep(1500);
				}	
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==n1)
		{
			if(flag1==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n2)
		{
			if(flag2==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n3)
		{
			if(flag3==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n4)
		{
			if(flag4==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n5)
		{
			if(flag5==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n6)
		{
			if(flag6==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n7)
		{
			if(flag7==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n8)
		{
			if(flag8==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n9)
		{
			if(flag9==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		if(ae.getSource()==n10)
		{
			if(flag10==1)
			{
				point +=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
			else
			{
				point -=50;
				score.setText("Score : "+point);
				panel.add(score);
			}
		}
		
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}	
	}		
}
	