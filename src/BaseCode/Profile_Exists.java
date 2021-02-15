package BaseCode;

import java.io.File;
import java.util.Scanner;

public class Profile_Exists {
	
	private String handle;
	private String password;
	
	public Profile_Exists(String handle, String password){
		this.handle = handle;
		this.password = password;
	}
	
	public Boolean handleMatch(){
		
		Encryption en = new Encryption();
		
		String filename = new String("Data/Profiles/"+en.Encrypt(this.handle)+".txt");
		
		try {
			File f = new File(filename);
			Scanner s = new Scanner(f);
			
			s.nextLine();
			String h = s.nextLine();
			
			s.close();
			
			if(h.equals(en.Encrypt(this.handle)) == true){
				return true;
			}
			
			else{
				return false;
			}
								
			
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public Boolean passwordMatch(){
		
		Encryption en = new Encryption();
		
		String filename = new String("Data/Profiles/"+en.Encrypt(this.handle)+".txt");
		
		try {
			File f = new File(filename);
			Scanner s = new Scanner(f);
			
			s.nextLine();
			s.nextLine();
			s.nextLine();
			String p = s.nextLine();
			
			s.close();
			
			if(p.equals(en.Encrypt(this.password)) == true){
				return true;
			}
			
			else{
				return false;
			}
							
			
		} catch (Exception e) {
			return false;
		}
	}
}
