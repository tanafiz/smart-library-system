package frame;
import entity.*;
import java.lang.*;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.io.*; 

public class framesample extends JFrame implements MouseListener, ActionListener
{
	private Font f1, f2, f3;
	private Color c1, c2;
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13;
	private JTextField tf1, tf2, tf3, tf4;
	private JPasswordField pf1;
	private JButton bt1, bt2, bt3;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg1;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JComboBox cob;
	private JTextArea ta1, ta2;
	private ImageIcon img;
	
	public framesample()
	{
		super("Smart Library Management System");
		super.setBounds(400,100,1030,790);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		c1 = new Color(232, 240, 233);
		panel.setBackground(c1);
		
		f1 = new Font("Georgia", Font.BOLD, 28); 
		f2 = new Font("Times New Roman", Font.BOLD, 20); 
		f3 = new Font("Verdana", Font.BOLD, 14);
		c2 = new Color(26, 58, 92);
		
		label1 = new JLabel("Welcome to Smart Library");
		label1.setBounds(585, 25, 700, 40);
		label1.setFont(f1);
		label1.setForeground(c2);
		label1.addMouseListener(this);
		panel.add(label1);

		label12 = new JLabel("-----Please Fill Up Your Information-----");
		label12.setBounds(50, 10, 520, 30);
		label12.setForeground(Color.RED);
		label12.setFont(f3);
		panel.add(label12);
		
		
		label2 = new JLabel("User Name");
		label2.setBounds(10, 50, 120, 30);
		label2.setFont(f2);
		panel.add(label2);
		
		tf1 = new JTextField();
		tf1.setBounds(170, 50, 215, 30);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label3 = new JLabel("Password");
		label3.setBounds(10, 90, 120, 30);
		label3.setFont(f2);
		panel.add(label3);
		
		pf1 = new JPasswordField();
		pf1.setBounds(170, 90, 215, 30);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		pf1.addActionListener(this);
		panel.add(pf1);
		
		bt1 = new JButton("Show");
		bt1.setBounds(400, 90, 100, 30);
		bt1.setFont(f2);
		bt1.setBackground(Color.YELLOW);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		label4 = new JLabel("Book Title");
		label4.setBounds(10, 130, 120, 30);
		label4.setFont(f2);
		panel.add(label4);
		
		tf2 = new JTextField();
		tf2.setBounds(170, 130, 215, 30);
		tf2.setFont(f2);
		panel.add(tf2);
		
		label5 = new JLabel("Author Name");
		label5.setBounds(10, 170, 120,30);
		label5.setFont(f2);
		panel.add(label5);
		
		tf3 = new JTextField();
		tf3.setBounds(170, 170, 215,30);
		tf3.setFont(f2);
		panel.add(tf3);
		
		label6 = new JLabel("ISBN Number");
		label6.setBounds(10, 210, 120,30);
		label6.setFont(f2);
		panel.add(label6);
		
		tf4 = new JTextField();
		tf4.setBounds(170, 210, 215,30);
		tf4.setFont(f2);
		panel.add(tf4);
		
		label7 = new JLabel("Book Category");
		label7.setBounds(10, 250, 130,30);
		label7.setFont(f2);
		panel.add(label7);
		
		String items[] = new String[] 
		{"","Text Book", "Fiction", "Non-fiction", "Fantasy", "Mystery", "Comic"};
		cob = new JComboBox(items);
		cob.setBounds(170, 250, 215,30);
		cob.setFont(f2);
		panel.add(cob);
		
		label8 = new JLabel("Book Condition");
		label8.setBounds(10, 295, 130,30);
		label8.setFont(f2);
		panel.add(label8);
		
		cb1 = new JCheckBox("Good Condition");
		cb1.setBounds(170, 295, 215,30);
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Missing Pages");
		cb2.setBounds(170, 335, 215,30);
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Torn Pages");
		cb3.setBounds(170, 375, 215,30);
		cb3.setFont(f2);
		panel.add(cb3);
		
		cb4 = new JCheckBox("Cover Damage");
		cb4.setBounds(170, 415, 215,30);
		cb4.setFont(f2);
		panel.add(cb4);
		
		label9 = new JLabel("Book Status");
		label9.setBounds(10, 460, 120,30);
		label9.setFont(f2);
		panel.add(label9);
		
		rb1 = new JRadioButton("Issue");
		rb1.setBounds(170, 460, 95, 30);
		rb1.setFont(f2);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Return");
		rb2.setBounds(280, 460, 105, 30);
		rb2.setFont(f2);
		panel.add(rb2);
		
		bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		label10 = new JLabel("Book Review");
		label10.setBounds(10, 525, 125, 30);
		label10.setFont(f2);
		label10.setBackground(Color.WHITE);
		label10.setOpaque(true);
		label10.addMouseListener(this);
		panel.add(label10);
		
		ta1 = new JTextArea();
		ta1.setBounds(10, 565, 390,100);
		ta1.setFont(f2);
		panel.add(ta1);
		
		img = new ImageIcon("picture/logo.png");
		label11 = new JLabel(img);
		label11.setBounds(670, 60, 200, 200);
		panel.add(label11);
		
		ta2 = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ta2);
		scrollPane.setBounds(550, 300, 450, 370);
		ta2.setFont(f2);
		panel.add(scrollPane);
		
		bt2 = new JButton("Submit");
		bt2.setBounds(550, 695, 150,30);
		bt2.setFont(f2);
		bt2.setBackground(Color.GREEN);
		bt2.addMouseListener(this);
		bt2.addActionListener(this);
		panel.add(bt2);
		
		bt3 = new JButton("Exit");
		bt3.setBounds(850, 695, 150,30);
		bt3.setFont(f2);
		bt3.setBackground(Color.RED);
		bt3.addActionListener(this);
		panel.add(bt3);
		
		
		super.add(panel);
	}
	
	public void mouseClicked(MouseEvent me) 
	{
		if(me.getSource() == label10)
		{
			label10.setText("Comment");
		}
		else 
		{ 
	
	    }
	}
	public void mousePressed(MouseEvent me) 
	{ 
		if(me.getSource() == label1)
		{
			label1.setText("Created by T. A. Nafiz");
		}
		else 
		{ 
	
	    }
	}
	public void mouseReleased(MouseEvent me) 
	{ 
		if(me.getSource() == label1)
		{
			label1.setText("Welcome to Smart Library");
		}
		else 
		{ 
	
	    }
	}
	public void mouseEntered(MouseEvent me) 
	{ 
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.BLUE);
			bt2.setForeground(Color.WHITE);
		}
		else 
		{
			
		}
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == bt2)
		{
			bt2.setBackground(Color.GREEN);
			bt2.setForeground(Color.BLACK);
		}
		else 
		{

		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt3)
		{
			System.exit(0);
		}
		if(ae.getSource() == bt1)
		{
			pf1.setEchoChar((char)0);
		}
		if(ae.getSource() == bt2)
		{
			String l1, l2, l3, l4, l5, l6, l8, l9;
			String l7 = "";

            l1 = tf1.getText(); 
            l2 = pf1.getText(); 
            l3 = tf2.getText(); 
            l4 = tf3.getText(); 
            l5 = tf4.getText(); 
			
			if(rb1.isSelected()) 
			{
				l8 = "Book Issued"; 
			}
			else if(rb2.isSelected()) 
			{
				l8 = "Book Returned"; 
			}
			else 
			{ 
				l8 = " "; 
			}
			if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected())
			{
				l7 = cb1.getText() + "\n" +cb2.getText()+"\n" + cb3.getText() + "\n" + cb4.getText();

			}
			
			 if(cb1.isSelected()) { l7 = cb1.getText() + " "; }
			 if(cb2.isSelected()) { l7 += cb2.getText(); }
			 if(cb3.isSelected()) { l7 +=  ", " + cb3.getText() ; }
			 if(cb4.isSelected()) { l7 +=  ", " + cb4.getText(); }
			
			l6 = cob.getSelectedItem().toString();
			l9 = ta1.getText();
			
			if(l1.isEmpty() || l2.isEmpty() || l3.isEmpty() || l4.isEmpty() || l5.isEmpty() || l6.isEmpty() || l7.isEmpty() || l8.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"!Please Fill Up All Information!");
			}
			else 
			{
				library obj1 = new library(l1, l2, l3, l4, l5, l6, l7, l8, l9);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Information Submitted!");
				check();
			}
		}
	}
	private void check() {
        try {
            File file = new File("./Data/userdata.txt");
            if (file.exists()) {
				FileReader fr = new FileReader(file); 
                BufferedReader br = new BufferedReader(fr); 
                String line;
                while ((line = br.readLine()) != null) 
				{
                    ta2.append(line + "\n");
                }
                br.close();
            }
        }
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"ERROR!");
		}
    }
}
		
		