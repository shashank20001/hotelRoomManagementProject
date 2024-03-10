package serviceimpln;



import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.customer;
import service.Rentalservice;

public class Rentalserviceimpln implements Rentalservice{
	Scanner ip = new Scanner(System.in);
	{
	
      for(int i=101;i<=108;i++)
      {
    	  nac.put(i, null);
      }
      for(int i=201;i<=205;i++)
      {
    	  ac.put(i, null);
      }
      for(int i=301;i<=303;i++)
      {
    	  deluxe.put(i, null);
      }

	}

	@Override
	public void info() {
		System.out.println("=======non ac=============");
		System.out.println("fan");
		System.out.println("wifi");
		System.out.println("tv");
		System.out.println("2 member");
		System.out.println("price :2000");
		System.out.println("==============ac===============");
		System.out.println("wifi");
		System.out.println("tv");
		System.out.println("2 member");
		System.out.println("price :25000");
		System.out.println("=========deluxe==============");
		System.out.println("ac");
		System.out.println("wifi");
		System.out.println("tv");
		System.out.println("fridge");
		System.out.println("3 TO 4 member");
		System.out.println("price :30000");
		
	}
	
	void checkrooms(LinkedHashMap<Integer, customer>m,String type) {
		System.out.println("=========="+type+"rooms:====================");
		int c=0;
		for(Integer roomno : m.keySet()) {
			if(m.get(roomno)==null) {
				System.out.println(roomno+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0)
		{
			System.out.println("no rooms Available...!!");
		}
	}

	@Override
	public void roomsAvialable() {
	checkrooms(nac, "non Ac");
	checkrooms(ac, "Ac");
	checkrooms(deluxe, "deluxe");
		
	}
	void allocate (LinkedHashMap<Integer,customer>m,String roomtype,double roomprice) {
		System.out.println("enter the roomno");
				int roomno = ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)==null) {
			System.out.println("enter Customer Id");
			int Cid=ip.nextInt();
			System.out.println("enter customer name:-");
			String Cname=ip.next();
			System.out.println("enter customer Phon:-");
			long Cphone=ip.nextLong();
			System.out.println("enter the house NO:-");
			String houseNO=ip.next();
			System.out.println("enter Street name");
			String Sname=ip.next();
			System.out.println("enter pincode");
			int pcd=ip.nextInt();
			customer c = new customer(Cid, Cname, pcd, new Address(houseNO, Sname, pcd), roomtype, roomprice, roomno);
			m.put(roomno, c);
			Li.add(c);
			System.out.println(c.getCname()+"had been Allocate for"+roomtype+"roomno:");
			System.out.println(c.getCname()+"need to pay rs."+roomprice);
		}
		
		else {
			System.out.println("invalid roomno:--------");
		}
	}

	@Override
	public void checkIn() {
		System.out.println("===========check-IN=================");
		System.out.println("1.non Ac\n2.Ac\n3.Deluxe");
		System.out.println("enter the option:-");
		int op=ip.nextInt();
		switch (op) {
		case 1: allocate(nac, "non ac", 2000);break;
		case 2:	allocate(ac,"ac", 2500);break;
		case 3: allocate(deluxe, "deluxe", 3000);break;
	   default:System.out.println("Invalid Option:-");
			
	}
	}
	void deAllocate (LinkedHashMap<Integer, customer>m)
	{
		System.out.println("enter the roomno");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&& m.get(roomno)!=null)
		{
			customer c=m.get(roomno);
			System.out.println(c.getCname()+"THanks for Visiting due hotal..!!");
			m.put(roomno, null);
		}
		else {
			System.out.println("Invalid roono..!!!");
		}
	}

	@Override
	public void checkOut() {
		System.out.println("=========Check out=========");
		System.out.println("1.non Ac\n2.ac\n3.DEluxe");
		System.out.println("enter the option:-");
		int op=ip.nextInt();
		switch(op)
		{
		case 1:deAllocate(nac);break;
		case 2:deAllocate(ac);break;
		case 3:deAllocate(deluxe);break;
		default:System.out.println("Invalid option:-");
		}
		
	}

	@Override
	public void customerdetails() {
	   int c=0;
	   System.out.println("=======customer DEtails============");
	   for(customer ele : Li)
	   {
		System.out.println(ele);
		c++;
	   }
	   if(c==0)
	   {
		   System.out.println("no customer data found...!!!!");
	   }
		
	}
}
