package org.add;

import java.util.Scanner;

public class TechGit {
	
	public void hike(int amt) {
		
		System.out.println(amt);
		
	}
	
	public void name(String name) {
		
		System.out.println(name);

	}
	
	public void hikeYear(int year) {
		
		System.out.println(year);
		
	}
	
	public void ctc(String amt) {
		
		System.out.println(amt);

	}
	
	public static void main(String[] args) {
		
		TechGit techGit=new TechGit();
		
		techGit.hike(20000);
		techGit.name("Bibin");
		techGit.hikeYear(2024);
		techGit.ctc("4.8 LPA");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Full Name: "+s.nextLine());
		System.out.println("Age: "+s.nextInt());
		System.out.println("DOB: "+s.next());
		System.out.println("Pancard No: "+s.next());
		
		
		
	}

}
