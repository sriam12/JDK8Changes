package com.jdk8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {

         List<Customer> lis = Arrays.asList(new Customer("hopper",43),
        		 new Customer("Nancy",18),
        		 new Customer("Steve",28),
        		 new Customer("Eleven",16),
        		 new Customer("Suzie",12)
        		 );
       // Here i want to filer name and print 
       Customer customer =  lis.stream()            //Convert List to Stream
         .filter(x -> x.getName().equals("Nancy"))  //Filter it for Nancy only
         .findAny()                                 //if it finds then return
         .orElse(null);
       System.out.println(customer.getName()+" "+customer.getAge());
         
      // It is example for orElse
       Customer customer1 =  lis.stream()           
    	         .filter(x -> x.getName().equals("Sreeram"))  
    	         .findAny()                                 
    	         .orElse(null);
       System.out.println(customer1);
       
      //It is example for multiple searches
       Customer customer2 =  lis.stream()           
  	         .filter(x -> x.getName().equals("Eleven")&& 16==x.getAge())  
  	         .findAny()                                 
  	         .orElse(null);
     System.out.println(customer2.getName()+" "+customer2.getAge());
       
       

	}

}
