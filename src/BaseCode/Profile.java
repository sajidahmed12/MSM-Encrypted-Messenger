package BaseCode;

public class Profile {
	
	private String fullname;
	private String handle;
	private String email;
	private String password;
	private String gender;
	private String dob_day;
	private String dob_month;
	private String dob_year;
	
	
	public Profile(String fullname, String handle, String email, String password, String gender, String dob_day, String dob_month, String dob_year) {

		this.fullname = fullname;
		this.handle = handle;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob_day = dob_day;
		this.dob_month = dob_month;
		this.dob_year = dob_year;
	}


	public String toString() {
		return "Fullname		= " + fullname + "\n"
			 + "Handle 			= " + handle + "\n"
			 + "Email			= " + email + "\n"
			 + "Password		= " + password + "\n"
			 + "Gender 			= " + gender + "\n"
			 + "Date of Birth 	= " + dob_day + " " + dob_month+ " " + dob_year;
	}


	public String getFullname() {
		return fullname;
	}


	public String getHandle() {
		return handle;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public String getGender() {
		return gender;
	}


	public String getDob_day() {
		return dob_day;
	}


	public String getDob_month() {
		return dob_month;
	}


	public String getDob_year() {
		return dob_year;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public void setHandle(String handle) {
		this.handle = handle;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setDob_day(String dob_day) {
		this.dob_day = dob_day;
	}


	public void setDob_month(String dob_month) {
		this.dob_month = dob_month;
	}


	public void setDob_year(String dob_year) {
		this.dob_year = dob_year;
	}
			
	
}
