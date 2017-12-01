package bean;

import java.util.Date;

public class User {
	private int uid;
	private String uname;
	private String upassword;
	private String ugender;
	private int uage;
	private Date registertime;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int uid, String uname, String upassword, String ugender, int uage, Date registertime) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.ugender = ugender;
		this.uage = uage;
		this.registertime = registertime;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public Date getRegistertime() {
		return registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", ugender=" + ugender + ", uage="
				+ uage + ", registertime=" + registertime + "]";
	}

	
}
