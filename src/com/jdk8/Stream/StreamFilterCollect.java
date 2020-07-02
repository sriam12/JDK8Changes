package com.jdk8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lis = Arrays.asList("Phone","clothes","Shoe","telephone","charger");
		
		List<String> newList = lis.stream().filter(ele -> !ele.equals("Shoe")).collect(Collectors.toList());
		
		newList.forEach(str -> System.out.println(str));
        
	}

}
