package Java8.DefaultMethods;

public class Class14 implements Interface1,Interface4{
	public void methodA() {
		System.out.println("Interdace1 method A"+Class14.class);
	}

	public static void main(String arg[]) {
		new Class14().methodA();
	}
}
