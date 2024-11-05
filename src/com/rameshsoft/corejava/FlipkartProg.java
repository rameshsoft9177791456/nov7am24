package com.rameshsoft.corejava;

class Fp_Men
{
	public void login() {
		;;;;;;;;;;;;;;;;;;;;;;;;//20 lines of code
		System.out.println("Fp_Men: login()");
	}
	public void clothes() {
		;;;;;;;;;;;;;;;;;;;;;;;;//200 lines of code
		System.out.println("Fp_Men: clothes()");
	}
	public void logout() {
		;;;;;;;;;;;;;;;;;;;;;;;;//20 lines of code
		System.out.println("Fp_Men: logout()");
	}
}
class Fp_WoMen extends Fp_Men
{
	public void jewellery() {
		;;;;;;;;;;;;;;;;;;;;;;;;//200 lines of code
		System.out.println("Fp_WoMen: jewellery()");
	}
	public void gold() {
		;;;;;;;;;;;;;;;;;;;;;;;;//200 lines of code
		System.out.println("Fp_WoMen: gold()");
	}
}
class Fp_Kids 
{
	public void toys() {
		;;;;;;;;;;;;;;;;;;;;;;;;//200 lines of code
		System.out.println("Fp_Kids: toys()");
	}
}
public class FlipkartProg {
public static void main(String[] args) {
	
	//1. Creating parent class object
	Fp_Men fp_Men = new Fp_Men();
	fp_Men.login();
	fp_Men.clothes();
	fp_Men.logout();
	
	//2. Creating child class object
	Fp_WoMen fp_WoMen = new Fp_WoMen();
	fp_WoMen.login();
	fp_WoMen.clothes();
	fp_WoMen.gold();
	fp_WoMen.jewellery();
	fp_WoMen.logout();
	
	/*Fp_Kids fp_Kids = new Fp_Kids();
	fp_Kids.login();
	fp_Kids.clothes();
	fp_Kids.gold();
	fp_Kids.jewellery();
	fp_Kids.toys();
	fp_Kids.logout();*/
	
	//3. By using parent class ref we can create child class object
	Fp_Men fp_Men2 = new Fp_WoMen();
	fp_Men2.login();
	fp_Men2.clothes();
	fp_Men2.logout();
	
	//4. Creating parent class object using child class reference
	//Fp_WoMen fp_WoMen2 = new Fp_Men();
	
	
	
	
	
	
	
	
	
	
}
}
