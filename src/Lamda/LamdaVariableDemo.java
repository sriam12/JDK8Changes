package Lamda;

public class LamdaVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Webpage w = (String value) -> {	System.out.println("Hi "+value);};
		Webpage w2 = (value) -> {	System.out.println(value.toUpperCase());};
		Webpage w3 = (n) -> {	System.out.println(n.length());};
		
		w.hard("Facebook");
		w2.hard("naveen");
		w3.hard("kallam");
		
     /*   Webpage w1 = new Webpage() {
			
			@Override
			public void hard(String value) {
				// TODO Auto-generated method stub
				System.out.println("Hi "+value);
			}
		};*/
		//	w1.hard("facebook");
		// anonymous inner loop treat as a class
	}

}
