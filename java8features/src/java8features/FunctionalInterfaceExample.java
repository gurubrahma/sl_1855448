package java8features;
@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	void printsum(int a,int b);
	
	default void defMethod() {
		System.out.println("Dfault method inside Functional interface");
	}
	static void staticMethod() {
		System.out.println("Static method inside Functional interface");
	}

}
