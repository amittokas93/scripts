package javaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		
		System.out.print("Hello Selenium"); // not passing a new line
		System.out.println("Hello Testing");
		
		// ln -- line new
		// new line will be created after printing on the console
		
		// println --> used to print on console with a new line
		// print --> used to print on console
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double d = 12.33;
		double e = 10.33;
		
		System.out.println(a + b); // 300
		System.out.println(x + y); // HelloWorld
		
		System.out.println(a + b + x+ y); // 300HelloWorld
		
		System.out.println(x + y + a + b); // HelloWorld100200
		
		// Left to Right execution
		
		System.out.println(x + y + (a + b)); // HelloWorld300
		
		System.out.println(a + b + x + y + a + x + b + y); // 300HelloWorld100Hello200World
		
		System.out.println(a + b + x + y + a + b); // 300HelloWorld100200
		
		System.out.println(d + e); // 22.66
		
		System.out.println(x + y + d + e); // HelloWorld12.3310.33
		
		// + sign is a concatenation operator
		
		System.out.println("HelloWorld"); // HelloWorld
		
		System.out.println(a); // 100
		
		System.out.println("the value of a is : " + a); // the value of a is : 100
		
		System.out.println("the addition of a & b is : " + (a + b)); // the addition of a & b is : 300

	}

}
