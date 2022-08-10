package com.ank.polymorphism;
class d{  
	 void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class polymorphism7 extends d{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  d a=new polymorphism7();  
	  a.eat();  
	 }  
	}  