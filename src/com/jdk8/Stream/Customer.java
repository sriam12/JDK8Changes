package com.jdk8.Stream;

public class Customer {
	
	private String Name ;
	private  int Age;
	
	 public Customer(String Nam,int Age){
		 this.Name = Nam;
		 this.Age = Age;
	 } 
	 
	 public String getName(){
		 return Name;
	 }
	 public void SetName(String Name){
		 this.Name = Name;
	 }
	 public void setAge(int Age){
		 this.Age = Age;
	 }
	 public int getAge(){
		 return Age;
	 }

}
