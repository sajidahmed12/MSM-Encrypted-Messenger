package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
import BaseCode.*;

public class SignIn_Window implements ActionListener{
	
	private int width;
	private int height;
	
	private JFrame frame;
	
	private JLabel backgroundL;
	private JLabel handleL;
	private JLabel pass;
	private JLabel or;
	private JLabel warning;
	
	private JTextField handle;
	
	private JPasswordField password;
	
	private JButton signin;
	private JButton signup;
	
	private ImageIcon icon;
	private ImageIcon background;
	
	
	public SignIn_Window(){
		
		double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		width = (int)w/4;
		height = (int)h/5;
		//System.out.println(2*width + "\n" + 3*height);
		
		icon = new ImageIcon("Data/Images/TopIcon2.png");
		background = new ImageIcon(new ImageIcon("Data/Images/Background 2.png").getImage().getScaledInstance(2*width, 3*height, Image.SCALE_SMOOTH));
		
		backgroundL = new JLabel();
		backgroundL.setIcon(background);
		
		handleL = new JLabel("Handle");
		handleL.setForeground(new Color(255, 0, 0));
		handleL.setFont(new Font("Lucida Calligraphy", 0, 20));
		
		pass = new JLabel("Password");
		pass.setForeground(new Color(255, 0, 0));
		pass.setFont(new Font("Lucida Calligraphy", 0, 20));
		
		or = new JLabel("Or");
		or.setForeground(new Color(255, 0, 0));
		or.setFont(new Font("Lucida Calligraphy", 0, 20));
				
		handle = new JTextField();
		handle.setForeground(new Color(0, 0, 0));
		handle.setFont(new Font("Lucida Calligraphy", 0, 15));
		
		password = new JPasswordField();
		password.setForeground(new Color(0, 0, 0));
		password.setFont(new Font("Lucida Calligraphy", 0, 15));
		
		signin = new JButton("Sign In");
		signin.setForeground(new Color(0, 0, 0));
		signin.setFont(new Font("Lucida Calligraphy", 0, 15));
		signin.setBorderPainted(false);
		signin.addActionListener(this);
		
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
		frame.setTitle("MSM EnCrypted MassAnger / Sign In");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		frame.getContentPane().add(handleL);
		handleL.setBounds(20, 50, 200, 100);
		
		frame.getContentPane().add(pass);
		pass.setBounds(20, 100, 200, 100);
		
		frame.getContentPane().add(handle);
		handle.setBounds(160, 88, 200, 25);
		
		frame.getContentPane().add(password);
		password.setBounds(160, 137, 200, 25);
		
		frame.getContentPane().add(signin);
		signin.setBounds(60, 200, 100, 25);
		
		frame.getContentPane().add(or);
		or.setBounds(175, 162, 150, 100);
		
		frame.getContentPane().add(signup);
		signup.setBounds(220, 200, 100, 25);
		
		frame.getContentPane().add(backgroundL);
		backgroundL.setBounds(0, 0, 2*width, 3*height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == signup){
			
			new SignUp_Window();
			
			frame.dispose();

		}
		
		if(e.getSource() == signin){
			
			Profile_Exists check = new Profile_Exists(handle.getText(), password.getText());
			
			if((check.handleMatch() == true) && (check.passwordMatch() == true)){
				
				Profile_Reader prof = new Profile_Reader(handle.getText());
				
				new Homepage_Window(prof.ReadProfile());
				frame.dispose();
				
			}
			
			else if(handle.getText().equals("") || password.getText().equals("")){
				new Error_Window(4);
			}
			
			else{
				
				new Error_Window(3);
			}
			
			
		}
	}

}
