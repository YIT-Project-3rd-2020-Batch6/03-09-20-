package MobileModel;

public class CartModel {
 int cid,pid,quantity;
 String userid;

public CartModel() {
	super();
}

public CartModel(int cid, int pid, int quantity, String userid) {
	super();
	this.cid = cid;
	this.pid = pid;
	this.quantity = quantity;
	this.userid = userid;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}
 
}
