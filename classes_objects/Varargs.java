/*
Before Java 5, a method can be invoked by fixed number of arguments
In Java 5, method can have special type of parameters called varargs ~ variable-length arguments
Last parameter in a method can take variable# arguments
Can be the only parameter of the method.

Syntax: three dots following the parameter type
	foo(boolean flag, int... items);

Invocation
	1. Array - foo(true, new int[]{1, 2, 3});
	2. Comma-separated arguments - foo(true, 1, 2, 3); - the compiler automatically converts varargs parameter into an array. The arguments are being passed as an array without explicit declaration. 
	3. Ommitted: foo(true) - internally an empty array is passed into a varargs parameter.
	
		Varargs parameter gives the flexibilty in giving 0 or more argument values. - gives an illusion that the method is infinitely overloaded

Varargs Restrictions
	1. Must be the last parameter of the method.
		foo(int... items, boolean flag); - illegal
	2. A method can have only one varargs parameter.
		foo(boolean flag, int... plates, int... spoons); - illegal
	
Varargs provides simpler & flexible invocation mechanism
	1. foo(true, 1, 2, 3); - you can pass them as comma separated values
	2. foo(true); - if there is nothing to pass, need not pass anything at all like foo(true, new int[]{}); or foo(true, null); - the compiler automatically passes an empty array.
	3. foo(true, veryLargeArray); pass it to the method

printf(String format, Object... args) - introduced in Java 5 - which can have varargs parameter
First argument is the text to be printed. 
Second, third and fourth arguments correspond to the varargs parameter.
System.out.printf("DOB: %d-%d-%d", 3, 28, 1990);   // DOB: 3-28-1990  - % serve as placeholders. 
                                                      At runtime, the printf method would replace the 3 % symbols with 3 argument values. 

VARARGS AND OVERLOADED METHODS
	Invalid overloaded methods
		1. foo(boolean flag, int... items);
		2. foo(boolean flag, int[] items); - we cannot say it is valid method overloading if it has non varargs parameter
		
	varargs method will be matched last.
*/
public class Varargs{
	// #1
	static void varargsOverload(boolean b, int i, int j, int k){  
		System.out.println("\n\nvarargsOverload WITHOUT varargs...");
	}
	
	// #2
	static void varargsOverload(boolean b, int... items){
		System.out.println("\nvarargsOverload WITH varargs...");
		System.out.println("items length: "+items.length);
	}
	
	public static void main(String... args){
		System.out.printf("\nDOB: %d-%d-%d", 3, 28, 1990);
		
		varargsOverload(true, 1, 2, 3); // finds the exact match #1
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8, 9);  // matches #2
		varargsOverload(true); // matches #2
		
		
	}
}