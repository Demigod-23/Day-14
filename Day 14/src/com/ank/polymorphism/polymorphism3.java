package com.ank.polymorphism;
class human{  
void eat(){
	System.out.println("eating...");
	}  
}  
class p1 extends human{  
void eat(){
	System.out.println("eating bread...");
	}  
void speaking(){
	System.out.println("speaking...");
	}  
void work(){  
super.eat();  
speaking();  
}  
}  
class polymorphism3{  
public static void main(String args[]){  
p1 d=new p1();  
d.work();  
}}  