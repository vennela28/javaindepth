/*
Method Overloading is having different methods with the same name but different parameter lists (number and types of method parameters).
- MUST change the parameter list
- changing the return type doesn't matter
- both instance and static methods can be overloaded

// VALID Method Overloading examples
int updateProfile(int newId) {}  #1
int updateProfile(int newId, char gender) {}  #2
int updateProfile(char gender, int newId) {}  #3
int updateProfile(short newId) {}  #4
byte b = 50;
updateProfile(b);  the compiler picks up #4 as it is more specific than 1 because it is next larger datatype after byte
The compiler picks a method that has most specific compatible datatype.
During compilation process, compiler writes into the bytecode about the method that needs to be invoked at runtime by JVM. 
This process of the compiler picking up the method to be invoked and subsequently JVM using that information at runtime is called method binding.

// INVALID Method Overloading examples  - get a compiler error saying that a duplicate method is added.
			
			void updateProfile(int newId) {} - instance method

void updateProfile(int id) {} - changing the parameter name doesn't work
boolean updateProfile(int newId) {} - compiler will complain that we have a duplicate method. We get compilation error since only the return type is different.
static void updateProfile(int newId) {} - adding static to the method signature doesn't work

PrintStream class has overloaded methods for println(), when we invoke System.out.println().  

Arrays class has overloaded methods for sort().
*/

public class MethodOverloading{
	static void go(int[] array){  // #1
		System.out.println("array[0]: "+array[0]);
		System.out.println("array[1]: "+array[1]);
		array[1] = 22;
	}
	
	static void go(int i){   // #2
		System.out.println("go(int) ");
	}
	
	static void go(short array){   // #3
		System.out.println("go(short) ");
	}
	
	public static void main(String... args){
		int[] array = {1, 2};
		go(array);
		System.out.println("array[1] in calling method: " +array[1]);  // #1 is invoked
		
		go(1000);    // #2 is invoked because 1000 is an int literal and the compiler would pick #2
		
		byte b = 10;
		go(b);    // #3 is invoked since 10 is an byte literal and the compiler would pick #3 which is the most specific next compatible datatype.
	}
}