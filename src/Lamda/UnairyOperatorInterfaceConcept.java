package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnairyOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> fun = x -> x*10;
		int resutl = fun.apply(10);
		
		Function<Integer,Integer> fun1 = x -> x+10;
              System.out.println(fun1.apply(5));
              
         List<String> ls = new ArrayList<String>();
         
         ls.add("Java");
         ls.add("Ruby");
         ls.add("Python");
         System.out.println(ls);
         ls.replaceAll(el->el+"Sreeram");
         System.out.println(ls);
	}

}
