package calculator;

public class Calculator {
	
	public static int add(int a, int b){
		System.out.println("add method changed");
		return a+b;
	}
	public static int sub(int a, int b){
		return a-b;
	}
	public static int mul(int a, int b){
		return a*b;
	}
	public static int div(int a, int b){
		return a/b;
	}
}
