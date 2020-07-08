package com.jdk8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Customer> lis = Arrays.asList(new Customer("hopper",43),
        		 new Customer("Nancy",18),
        		 new Customer("Steve",28),
        		 new Customer("Eleven",16),
        		 new Customer("Suzie",12)
        		 );
	String Name = lis.stream()
		   .filter(x ->"Suzie".equals(x.getName()))
		   .map(Customer::getName)
		   .findAny()
		   .orElse(null);
	
	System.out.println(Name);
	
	//Print all the Names in List
	       List<String> list = lis.stream().map(Customer::getName).collect(Collectors.toList());
	       list.forEach(x -> System.out.println(x));
	
	
//These are changes in Alpha Branch
	       
	}

}
