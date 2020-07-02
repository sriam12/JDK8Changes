package Lamda;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample(() ->"sreeram");
		sample(() ->"raghavan");

	}

	public static  void sample(Supplier<String> text){
		System.out.println(text.get());
	}
}
