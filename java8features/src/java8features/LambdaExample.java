package java8features;

public class LambdaExample {

	public static void main(String[] args) {
		FunctionalInterfaceExample f = (a,b)->{System.out.println(a+b);};
		f.printsum(6, 5);
	}

}
