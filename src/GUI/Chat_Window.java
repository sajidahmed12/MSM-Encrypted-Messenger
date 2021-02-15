package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import BaseCode.Profile;

public class Chat_Window implements ActionListener {
	
	private Profile profile;
	
	private int width;
	private int height;
	
	private JFrame frame;
	
	private JLabel backgroundL;
	
	private JButton homeB;
	private JButton profileB;
	private JButton massageB;
	private JButton chatB;
	private JButton settingsB;
	private JButton logoutB;
	
	private ImageIcon icon;
	private ImageIcon background;
	
	private ImageIcon homeicon;
	private ImageIcon profileicon;
	private ImageIcon massageicon;
	private ImageIcon chaticon;
	private ImageIcon settingsicon;
	private ImageIcon logouticon;
	
	public Chat_Window(Profile p){
		
		profile = p;
		
		double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		width = (int)w/4;
		height = (int)h/5;
		//System.out.println(2*width + "\n" + 3*height);
		
		icon = new ImageIcon("Data/Images/TopIcon2.png");
		background = new ImageIcon(new ImageIcon("Data/Images/Background 2.png").getImage().getScaledInstance(2*width, 3*height, Image.SCALE_SMOOTH));
		
		homeicon = new ImageIcon(new ImageIcon("Data/Images/Icons/1.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		profileicon = new ImageIcon(new ImageIcon("Data/Images/Icons/2.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		massageicon = new ImageIcon(new ImageIcon("Data/Images/Icons/3.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		chaticon = new ImageIcon(new ImageIcon("Data/Images/Icons/4.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		settingsicon = new ImageIcon(new ImageIcon("Data/Images/Icons/5.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		logouticon = new ImageIcon(new ImageIcon("Data/Images/Icons/6.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		
		backgroundL = new JLabel();
		backgroundL.setIcon(background);
		
		homeB = new JButton();
		homeB.setIcon(homeicon);
		homeB.setBorderPainted(false);
		homeB.addActionListener(this);
		homeB.setContentAreaFilled(false);
		
		profileB = new JButton();
		profileB.setIcon(profileicon);
		profileB.setBorderPainted(false);
		profileB.addActionListener(this);
		profileB.setContentAreaFilled(false);
		
		massageB = new JButton();
		massageB.setIcon(massageicon);
		massageB.setBorderPainted(false);
		massageB.addActionListener(this);
		massageB.setContentAreaFilled(false);
		
		chatB = new JButton();
		chatB.setIcon(chaticon);
		chatB.setBorderPainted(false);
		chatB.addActionListener(this);
		chatB.setContentAreaFilled(false);
		
		settingsB = new JButton();
		settingsB.setIcon(settingsicon);
		settingsB.setBorderPainted(false);
		settingsB.addActionListener(this);
		settingsB.setContentAreaFilled(false);
		
		logoutB = new JButton();
		logoutB.setIcon(logouticon);
		logoutB.setBorderPainted(false);
		logoutB.addActionListener(this);
		logoutB.setContentAreaFilled(false);
		
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(2*width, 3*height);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon.getImage());
		frame.setTitle("MSM EnCrypte  MassAnger / Profile");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		int q = 20;
		frame.getContentPane().add(homeB);
		homeB.setBounds(q, 10, 55, 55);
		
		frame.getContentPane().add(profileB);
		profileB.setBounds(q*4, 10, 55, 55);
		
		frame.getContentPane().add(massageB);
		massageB.setBounds(q*7, 10, 55, 55);
		
		frame.getContentPane().add(chatB);
		chatB.setBounds(q*10, 10, 55, 55);
		
		frame.getContentPane().add(settingsB);
		settingsB.setBounds(q*13, 10, 55, 55);
		
		frame.getContentPane().add(logoutB);
		logoutB.setBounds(q*16, 10, 55, 55);
		
		
		frame.getContentPane().add(backgroundL);
		backgroundL.setBounds(0, 0, 2*width, 3*height);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == homeB){
			new Homepage_Window(profile);
			frame.dispose();
		}
		
		if(e.getSource() == profileB){
			new Profile_Window(profile);
			frame.dispose();
		}
		
		if(e.getSource() == massageB){
			new Massage_Window(profile);
			frame.dispose();
		}
		
		if(e.getSource() == chatB){
			new Massage_Window(profile);
			frame.dispose();
		}
		
		if(e.getSource() == settingsB){
			new Massage_Window(profile);
			frame.dispose();
		}
		
		if(e.getSource() == logoutB){
			new SignIn_Window();
			frame.dispose();
		}
	}

}
