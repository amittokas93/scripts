package javaBasic;

public class DataTypes {

	public static void main(String[] args) {
		/* DataTypes -- a particular kind of data item, as defined by the values it can take,
		 *  the programming language used, or the operations that can be performed on it.
		 */

		/* Data Type --- 
		 * 1. Primitive
		 * 	a. int
		 * 	b. double
		 * 	c. boolean
		 * 	d. char
		 * 
		 * 2. Non Primitive
		 * 	a. String
		 * 	b. Array
		 * 
		 */
		
		// Duplicate variables can't be declared
		int i = 10;
		i = 20;
		
		int j = 30;
		int k = 40;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		// any statement line in Java should be ended with a semi-colon (;) in the end
		
		double a = 11.11;
		double b = 12.34;
		double c = 100; // 100 will be treated as 100.00
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// we can store integer in double but not vice versa
		
		char d = 'a';
		char e = 'm';
		char f = '1';
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		// characters should be written in Single Quotes
		// characters are a single digit value
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		// we can't store any other value than true or false in boolean data type
		
		String s = "amit";
		String s1 = "this is my java code";
		String s2 = "100";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
				
		// String should be written within double quotes
		// String is a class not a datatype
	}

}
