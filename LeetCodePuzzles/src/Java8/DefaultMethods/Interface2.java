package Java8.DefaultMethods;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("Interdace1 method B");
	}
	default void methodA() {
		System.out.println("Interdace1 method A"+Interface2.class);
	}
}
