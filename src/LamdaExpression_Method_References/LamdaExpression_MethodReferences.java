package LamdaExpression_Method_References;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;

public class LamdaExpression_MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Tom","John","Virat","kallam");                                 
		/*List<String> lis = new ArrayList<String>();
		lis.add("sree");
		lis.add("federer");*/
		// with Anonymous Class
		ls.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
		// With Lambda 
		ls.forEach(str -> System.out.println(str));
		
       // Method Reference 
		ls.forEach(System.out::println);
		
	//Before Jdk8
		for(int i=0; i<ls.size();i++){
			System.out.println(ls.get(i));
		}
		
		for(String s : ls){
			System.out.println(s);
		}
	}

}
