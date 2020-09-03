package MobileModel;

public class OrderModel {
 String userid,odate,ddate,ostatus,address,remarks;
 int oid,pid,cid,price;

public OrderModel() {
	super();
}

public OrderModel(int oid, int pid, int cid, String userid, int price, String odate, String ddate,
		String ostatus, String address, String remarks) {
	super();
	this.oid = oid;
	this.pid = pid;
	this.cid = cid;
	this.userid = userid;
	this.price = price;
	this.odate = odate;
	this.ddate = ddate;
	this.ostatus = ostatus;
	this.address = address;
	this.remarks = remarks;
}

public int getOid() {
	return oid;
}

public void setOid(int oid) {
	this.oid = oid;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getOdate() {
	return odate;
}

public void setOdate(String odate) {
	this.odate = odate;
}

public String getDdate() {
	return ddate;
}

public void setDdate(String ddate) {
	this.ddate = ddate;
}

public String getOstatus() {
	return ostatus;
}

public void setOstatus(String ostatus) {
	this.ostatus = ostatus;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getRemarks() {
	return remarks;
}

public void setRemarks(String remarks) {
	this.remarks = remarks;
}
 
}
