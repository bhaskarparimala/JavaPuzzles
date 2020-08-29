package Java8.DefaultMethods;

public class MultipleInhertanceExample implements Interface1,Interface2,Interface3{

	public void methodA() {
		System.out.println("Interdace1 method A"+MultipleInhertanceExample.class);
	}
	public static void main(String arg[]) {
		MultipleInhertanceExample obj= new MultipleInhertanceExample();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}
