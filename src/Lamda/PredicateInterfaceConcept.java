package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> fun = x -> x>5;
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> colList = ls.stream().filter(fun).collect(Collectors.toList());
		System.out.println(colList);
		
		//Predicate with &&
		List<Integer> AndOper = ls.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
        System.out.println(AndOper);
        
        //Predicate With negate()--(means opposite)
        
        List<String> NamesList = Arrays.asList("Naveen","Navee","Nave","Nav","Java","Jav","Ja");
        Predicate<String> filter1 = a -> a.startsWith("Nav");
       List<String> newNames = NamesList.stream().filter(filter1.negate()).collect(Collectors.toList());
        System.out.println(newNames);
	}

}
