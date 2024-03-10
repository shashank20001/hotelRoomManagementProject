package app;

import java.util.Scanner;

import service.Rentalservice;
import serviceimpln.Rentalserviceimpln;

public class Rentalapp {
    public static void main(String[] args) {
		System.out.println("=========welcome room rental Application==========");
		Scanner ip = new Scanner(System.in);
		Rentalservice r1 = new Rentalserviceimpln();
		while(true)
		{
			System.out.println("===menu====");
			System.out.println("1.info\n2.roomsAvialable\n3.CheckIN\n4.Customer Details");
			System.out.println("5.checkout\n6.exit");
			System.out.println("enter your option:-");
			int op=ip.nextInt();
			switch (op) {
			case 1:r1.info();break;
			case 2:r1.roomsAvialable();break;
			case 3:r1.checkIn();break;
			case 4:r1.customerdetails();break;
			case 5:r1.checkOut();break;
			case 6:System.out.println("====Thank you visit Again======");
			System.exit(0);
			default: System.out.println("invalid option:-");
			
			}
		}
	}
}
