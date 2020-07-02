package Lamda;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       /*    Interface Function<T,R> type parameters,
        *   T- the type of input to the Function
        *   R - the type of result to the function
        *    */
		Function<String,Integer> fun = x -> x.length();
		Function<Integer,Integer> fun1 = x ->x*2;
		int result = fun.andThen(fun1).apply("Welcome");
	//	int len = fun.apply("This is java8");
		System.out.println(result);
	}

}
