package BaseCode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import GUI.Error_Window;


public class Profile_Reader {
	
	private String h;
	private String fullname;
	private String handle;
	private String email;
	private String password;
	private String gender;
	private String dob_day;
	private String dob_month;
	private String dob_year;
	
	
	public Profile_Reader(String h){
		this.h = h;
	}
	
	public Profile ReadProfile(){
		
		Decryption de = new Decryption();
		Encryption en = new Encryption();
		
		String filename = new String("Data/Profiles/"+en.Encrypt(this.h)+".txt");
		
		try {
			File f = new File(filename);
			Scanner s = new Scanner(f);
			
			fullname = de.Decrypt(s.nextLine());
			handle = de.Decrypt(s.nextLine());
			email = de.Decrypt(s.nextLine());
			password = de.Decrypt(s.nextLine());
			gender = de.Decrypt(s.nextLine());
			dob_day = de.Decrypt(s.nextLine());
			dob_month = de.Decrypt(s.nextLine());
			dob_year = de.Decrypt(s.nextLine());
			
			s.close();
								
			
		} catch (Exception e) {
			
		}
		return new Profile(fullname, handle, email, password, gender, dob_day, dob_month, dob_year);
		
	}
	
		
	
}
