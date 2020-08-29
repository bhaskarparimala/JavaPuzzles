package Optional;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {
	
	public static Optional<String> checkOfNullable(){
		Optional<String> stringOptional=Optional.ofNullable("Hello");
		return stringOptional;
	}
	public static Optional<String> checkOfNullable2(){
		Optional<String> stringOptional=Optional.ofNullable(null);
		return stringOptional;
	}
	public static Optional<String> checkOfMethod(){
		Optional<String> stringOptional=Optional.of("Bhaskar");
		return stringOptional;
	}
	public static Optional<String> checkOfMethod2(){
		Optional<String> stringOptional=Optional.of(null);
		return stringOptional;
	}
	public static void main(String arg[]) {
		
		System.out.println("ofNullable: "+ checkOfNullable().get());
		System.out.println("ofNullable: "+ checkOfNullable2());//Optional.empty
		System.out.println("ofNullable: "+ checkOfNullable2().isPresent());//false
		System.out.println("ofNull: "+ checkOfMethod().get());//Bhaskar
		System.out.println("ofNull: "+ checkOfMethod2());//null pointer exception
		//System.out.println("ofNullable: "+ checkOfNullable2().get());//No Such Element Exception
		
	}

}
