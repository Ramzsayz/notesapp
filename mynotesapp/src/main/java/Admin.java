

public class Admin {
	
	protected int id;
	protected String username;
	 protected String password;
	 protected String email;
	 protected String address;
	 protected String phone;
	 
	 public Admin(String username, String password, String email, String address, String phone) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
			this.address = address;
			this.phone = phone;
		}


	public Admin(int id, String username, String password, String email, String address, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}