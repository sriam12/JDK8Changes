package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Represents an operation with single input argument and returns nothing. 

		Consumer<String> fun = x -> System.out.println(x);
		fun.accept("Hi This is Naveenautomation Labs");
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
		li.forEach(x -> System.out.println(x));
	}

}
