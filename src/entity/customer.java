package entity;

public class customer {
   private int cid;
   private String cname;
   private long phno;
   private Address a;
   private String roomType;
   private double roomprice;
   private int roomNO;
public customer(int cid, String cname, long phno, Address a, String roomType, double roomprice, int roomNO) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.phno = phno;
	this.a = a;
	this.roomType = roomType;
	this.roomprice = roomprice;
	this.roomNO = roomNO;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public Address getA() {
	return a;
}
public void setA(Address a) {
	this.a = a;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public double getRoomprice() {
	return roomprice;
}
public void setRoomprice(double roomprice) {
	this.roomprice = roomprice;
}
public int getRoomNO() {
	return roomNO;
}
public void setRoomNO(int roomNO) {
	this.roomNO = roomNO;
}
@Override
public String toString() {
	return "customer [cid=" + cid + ", cname=" + cname + ", phno=" + phno + ", a=" + a + ", roomType=" + roomType
			+ ", roomprice=" + roomprice + ", roomNO=" + roomNO + "]";
}
 
  
	 
    
}
