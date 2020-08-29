package Java8.DefaultMethods;

public interface Interface3 extends Interface2 {

	default void methodC() {
		System.out.println("Interdace1 method C");
	}
	default void methodB() {
		System.out.println("Interdace1 method B"+Interface3.class);
	}
}
