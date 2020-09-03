package MobileModel;

public class RegisterModel {
 String userid,name,utype,gender,email,password,phno,secretqsn,secretans,address;

public RegisterModel() {
	super();
}

public RegisterModel(String userid, String name, String gender, String email, String password,
		String phno, String secretqsn, String secretans, String address,String utype) {
	super();
	this.userid = userid;
	this.name = name;
	this.gender = gender;
	this.email = email;
	this.password = password;
	this.phno = phno;
	this.secretqsn = secretqsn;
	this.secretans = secretans;
	this.address = address;
	this.utype = utype;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUtype() {
	return utype;
}

public void setUtype(String utype) {
	this.utype = utype;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}

public String getSecretqsn() {
	return secretqsn;
}

public void setSecretqsn(String secretqsn) {
	this.secretqsn = secretqsn;
}

public String getSecretans() {
	return secretans;
}

public void setSecretans(String secretans) {
	this.secretans = secretans;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
 
}
