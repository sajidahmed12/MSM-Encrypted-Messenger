package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
import BaseCode.*;

public class SignUp_Window implements ActionListener {

	private int width;
	private int height;
	
	private JFrame frame;
	
	private JLabel backgroundL;
	private JLabel fullnameL;
	private JLabel handleL;
	private JLabel emailL;
	private JLabel pass1L;
	private JLabel pass2L;
	private JLabel genderL;
	private JLabel dobL;	
	
	
	private JTextField fullname;
	private JTextField handle;
	private JTextField email;
	
	private JPasswordField pass1;
	private JPasswordField pass2;
	
	private JRadioButton Mgender;
	private JRadioButton Fgender;
	
	private ButtonGroup gender;
	
	private JComboBox day;
	private JComboBox month;
	private JComboBox year;
	
	private JButton signup;
	
	private ImageIcon icon;
	private ImageIcon background;
	//private ImageIcon tickOrCross;

	
	public SignUp_Window(){
		
		double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		width = (int)w/4;
		height = (int)h/5;
		//System.out.println(2*width + "\n" + 3*height);
		
		icon = new ImageIcon("Data/Images/TopIcon2.png");
		background = new ImageIcon(new ImageIcon("Data/Images/Background 2.png").getImage().getScaledInstance(2*width, 3*height, Image.SCALE_SMOOTH));
		
		backgroundL = new JLabel();
		backgroundL.setIcon(background);
		
		fullnameL = new JLabel("Full Name");
		fullnameL.setForeground(new Color(255, 0, 0));
		fullnameL.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		handleL = new JLabel("Handle");
		handleL.setForeground(new Color(255, 0, 0));
		handleL.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		emailL = new JLabel("Email");
		emailL.setForeground(new Color(255, 0, 0));
		emailL.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		pass1L = new JLabel("Password");
		pass1L.setForeground(new Color(255, 0, 0));
		pass1L.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		pass2L = new JLabel("Re-Password");
		pass2L.setForeground(new Color(255, 0, 0));
		pass2L.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		genderL = new JLabel("Gender");
		genderL.setForeground(new Color(255, 0, 0));
		genderL.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		dobL = new JLabel("Date of Birth");
		dobL.setForeground(new Color(255, 0, 0));
		dobL.setFont(new Font("Lucida Calligraphy", 0, 16));
		
		fullname = new JTextField();
		fullname.setForeground(new Color(0, 0, 0));
		fullname.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		handle = new JTextField();
		handle.setForeground(new Color(0, 0, 0));
		handle.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		email = new JTextField();
		email.setForeground(new Color(0, 0, 0));
		email.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		pass1 = new JPasswordField();
		pass1.setForeground(new Color(0, 0, 0));
		pass1.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		pass2 = new JPasswordField();
		pass2.setForeground(new Color(0, 0, 0));
		pass2.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		//Password_MisMatch m= new Password_MisMatch(pass1.getText(), pass2.getText());
		
		//tickOrCross = new ImageIcon(m.getIcon().getImage());
		//tickOrCrossL = new JLabel();
		//tickOrCrossL.setIcon(tickOrCross);
		
		Mgender = new JRadioButton("Male");
		Mgender.setForeground(new Color(255, 0, 0));
		Mgender.setFont(new Font("Lucida Calligraphy", 0, 15));
		Mgender.setBorderPainted(false);
		Mgender.setContentAreaFilled(false);
		Mgender.setActionCommand("Male");

		Fgender = new JRadioButton("Female");
		Fgender.setForeground(new Color(255, 0, 0));
		Fgender.setFont(new Font("Lucida Calligraphy", 0, 15));
		Fgender.setBorderPainted(false);
		Fgender.setContentAreaFilled(false);
		Fgender.setActionCommand("Female");
		
		gender = new ButtonGroup();
		gender.add(Fgender);
		gender.add(Mgender);
		Mgender.setSelected(true);
		
		String[] days = new String[31];
		for(int i = 0 ; i<31 ; i++){
			days[i] = Integer.toString(i+1);
		}
		day = new JComboBox(days);
		day.setForeground(new Color(0, 0, 0));
		day.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		String[] months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		month = new JComboBox(months);
		month.setForeground(new Color(0, 0, 0));
		month.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		String[] years = new String[61];
		for(int i = 0 ; i<61 ; i++){
			years[i] = Integer.toString(2011-i);
		}
		year = new JComboBox(years);
		year.setForeground(new Color(0, 0, 0));
		year.setFont(new Font("Lucida Calligraphy", 0, 12));
		
		signup = new JButton("Sign Up");
		signup.setForeground(new Color(0, 0, 0));
		signup.setFont(new Font("Lucida Calligraphy", 0, 15));
		signup.setBorderPainted(false);
		signup.addActionListener(this);

		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(2*width, 3*height);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon.getImage());
		frame.setTitle("MSM EnCrypted MassAnger / Sign Up");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		frame.getContentPane().add(fullnameL);
		fullnameL.setBounds(20, 10, 150, 75);

		frame.getContentPane().add(handleL);
		handleL.setBounds(20, 50, 150, 75);
		
		frame.getContentPane().add(emailL);
		emailL.setBounds(20, 90, 150, 75);
		
		frame.getContentPane().add(pass1L);
		pass1L.setBounds(20, 130, 150, 75);
		
		frame.getContentPane().add(pass2L);
		pass2L.setBounds(20, 170, 150, 75);
		
		frame.getContentPane().add(genderL);
		genderL.setBounds(20, 210, 150, 75);
		
		frame.getContentPane().add(dobL);
		dobL.setBounds(20, 250, 150, 75);
		
		frame.getContentPane().add(fullname);
		fullname.setBounds(170, 36, 170, 20);
		
		frame.getContentPane().add(handle);
		handle.setBounds(170, 76, 170, 20);
		
		frame.getContentPane().add(email);
		email.setBounds(170, 116, 170, 20);
		
		frame.getContentPane().add(pass1);
		pass1.setBounds(170, 156, 170, 20);
		
		frame.getContentPane().add(pass2);
		pass2.setBounds(170, 196, 170, 20);
		
		//frame.getContentPane().add(tickOrCrossL);
		//tickOrCrossL.setBounds(350, 196, 23, 20);
		
		frame.getContentPane().add(Mgender);
		Mgender.setBounds(170, 236, 70, 20);
		
		frame.getContentPane().add(Fgender);
		Fgender.setBounds(260, 236, 100, 20);
		
		frame.getContentPane().add(day);
		day.setBounds(170, 276, 40, 20);
		
		frame.getContentPane().add(month);
		month.setBounds(220, 276, 90, 20);
		
		frame.getContentPane().add(year);
		year.setBounds(320, 276, 55, 20);
		
		frame.getContentPane().add(signup);
		signup.setBounds(200, 356, 100, 30);
		
		frame.getContentPane().add(backgroundL);
		backgroundL.setBounds(0, 0, 2*width, 3*height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == signup){
			
			String a =day.getSelectedItem().toString();
			String b =month.getSelectedItem().toString();
			String c =year.getSelectedItem().toString();
			String d;
			
			if(gender.getSelection().getActionCommand().equals(Mgender.getText())){
				d = Mgender.getText();
			}
			
			else{
				d = Fgender.getText();
			}

			Profile_Exists check = new Profile_Exists(handle.getText(), pass1.getText());
			
			if(check.handleMatch() == true){
				
				new Error_Window(1);
				
			}
			
			else if(handle.getText().equals("") || fullname.getText().equals("") || email.getText().equals("") || pass1.getText().equals("") || pass2.getText().equals("")){
				new Error_Window(4);
			}

			else if(!(pass2.getText().equals(pass1.getText()))){
				
				new Error_Window(2);
				
			}

			else{
				
				Profile n = new Profile(fullname.getText(), handle.getText(), email.getText(), pass1.getText(), d, a, b, c);
				
				Profile_Writer k = new Profile_Writer(n);
				k.CreatProfile();
				
				new SignIn_Window();
				frame.dispose();
				
			}
			
			
		}
		
	}

}
