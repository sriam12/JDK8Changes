package Lamda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Represents an operation upon two operands of the same type,
		producing a result of the same type as the operands. 
		This is a specialization of BiFunction for the case 		
		where the operands and the result are all of the same type.       */
		
		BinaryOperator<Integer> fun = (x1,x2) -> (x1+x2);
		int sum = fun.apply(10, 20);
		System.out.println(sum);
		
		//BinaryOperator is subInterface of BiFunction
       BiFunction<Integer,Integer,Integer> func = (a,b) ->(a+b);
       int result = func.apply(11, 9);
       System.out.println(result);
	}

}
