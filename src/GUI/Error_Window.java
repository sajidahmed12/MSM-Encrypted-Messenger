package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.*;
import BaseCode.*;

public class Error_Window implements ActionListener {
	
	private int i;
	private int width;
	private int height;
	
	private JFrame frame;
	
	private JLabel backgroundL;
	private JLabel warning;
	
	private JButton warningB;
	
	private ImageIcon icon;
	private ImageIcon background;
	private ImageIcon warningicon;
	
	public Error_Window(int i){	
		
		this.i = i;
		
		double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double h = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		
		width = (int)w/4;
		height = (int)h/5;
		//System.out.println(width + "\n" + height);
		
		icon = new ImageIcon("Data/Images/TopIcon2.png");
		background = new ImageIcon(new ImageIcon("Data/Images/Warning bg.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
		
		warningicon = new ImageIcon(new ImageIcon("Data/Images/Icons/7.png").getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		
		backgroundL = new JLabel();
		backgroundL.setIcon(background);
		
		warningB = new JButton();
		warningB.setIcon(warningicon);
		warningB.setBorderPainted(false);
		warningB.addActionListener(this);
		warningB.setContentAreaFilled(false);
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon.getImage());
		frame.setTitle("Error");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		if(i == 1){
			warning = new JLabel("This Handle is Unavailable!!!");
			warning.setForeground(new Color(255, 0, 0));
			warning.setFont(new Font("Lucida Calligraphy", 0, 17));
			
			frame.getContentPane().add(warning);
			warning.setBounds(40, 5, 300, 60);
		}
		
		else if(i == 2){
			warning = new JLabel("Re-Password doesn't match Password!!!");
			warning.setForeground(new Color(255, 0, 0));
			warning.setFont(new Font("Lucida Calligraphy", 0, 15));
			
			frame.getContentPane().add(warning);
			warning.setBounds(10, 5, 320, 60);
		}
		
		else if(i == 3){
			warning = new JLabel("Either Handle or Password is Wrong!!!");
			warning.setForeground(new Color(255, 0, 0));
			warning.setFont(new Font("Lucida Calligraphy", 0, 15));
			
			frame.getContentPane().add(warning);
			warning.setBounds(10, 5, 320, 60);
		}
		
		else if(i == 4){
			warning = new JLabel("Some fields were left Empty!!!");
			warning.setForeground(new Color(255, 0, 0));
			warning.setFont(new Font("Lucida Calligraphy", 0, 15));
			
			frame.getContentPane().add(warning);
			warning.setBounds(50, 5, 320, 60);
		}
		
		
		
		frame.getContentPane().add(warningB);
		warningB.setBounds(129, 60, 55, 55);
		
		
		frame.getContentPane().add(backgroundL);
		backgroundL.setBounds(0, 0, width, height);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == warningB){
			frame.dispose();
		}
	}

}
