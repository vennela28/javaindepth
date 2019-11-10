public class Operators{
	public static void main(String[] args){
		//preAndPost();
		//compoundArithmeticAssignment();
		//isEvenOdd(20);
		//operatorPrecedence();
		//charTypePromotion();
		//comparisonOperators();
		
		/*
		logicalOperators();
		Student s1 = new Student(1001, "Raj");
		update(s1, "Vennela");
		System.out.println(s1.name);
		*/
		
		bitwiseOperators();
	}
	
	// Bitwise operators can be applied only on Integer of Boolean operands
	static void bitwiseOperators(){
		int x = 1;
		int y = 3;
		
		System.out.println("x & y: "+(x & y));
		System.out.println("x | y: "+(x | y));
		System.out.println("x ^ y: "+(x ^ y));
		System.out.println("~x: "+(~x));	
		System.out.println("true & false: "+(true & false));		
		
		// Characters get promoted to an int. 
		char a1 = 'a';  // U + 0061 --> 0110 0001  - corresponding int value is 97
		char a2 = 'b';  // U + 0062 --> 0110 0010  - corresponding int value is 98
		System.out.println("a1 | a2: "+(a1 | a2));   // 0110 0011  -->  99 in decimal
		
		// Since bitwise work only on Integer types, following will not compile
		
		/*
		
		double d1 = 3.14;
		double d2 = 5.16;
		System.out.println("d1 | d2: "+(d1 | d2)); 
		
		*/
		
	}
	
	static void preAndPost(){
		int x = 5;
		//x++;
		System.out.println("x: "+x);
		
		//int y = x++; // int y = x; x = x + 1;
		int y = ++x; // x = x + 1; int y = x;
		System.out.println("y: " + y + ", x: " + x);
		
		int[] array = new int[3];
		int index = 0;
		array[index] = 10;
		index++;
		
		array[index++] = 20;
	//	index++;
		
		array[index++] = 30;
	//	index++;
		
		System.out.println("index: "+index);
	}
	static void compoundArithmeticAssignment(){
		int x = 100; 
		System.out.println("x+=5: "+(x+=5));
		System.out.println("x-=5: "+(x-=5));
		System.out.println("x*=5: "+(x*=5));
		System.out.println("x/=5: "+(x/=5));
		System.out.println("x%=5: "+(x%=5));
		
		// Invalid 
		System.out.println("x=+5: "+(x=+5));   // Unary plus ~ x = +5
		System.out.println("x=-5: "+(x=-5));   // Unary minus ~ x = -5
		/*System.out.println("x=*5: "+(x=*5));
		System.out.println("x=/5: "+(x=/5));
		System.out.println("x=%5: "+(x%=5)); - compilation error*/
	}
	static void isEvenOdd(int num){
		
		if(num%2 == 0)
			System.out.println(num+" is an even number.");
		else
			System.out.println(num+" is an odd number.");
	}
	
	static void operatorPrecedence(){
		// 5 + 9 - 3 + 2 * 5
		// Rule 1: Multiplicative operators (*, /, %) have higher precedence than additive operators (+, -)
		// 5 + 9 - 3 + (2 * 5)
		// Rule 2: Operators in the same group are evaluated from left to right
		// ((5 + 9) - 3 + (2 * 5))
		// 
		
		System.out.println("5 + 9 - 3 + 2 * 5 is evaluated to "+ (5 + 9 - 3 + 2 * 5));
	}
	
	static void charTypePromotion(){
	// Operand Promotion: Operands smaller than int are promoted to int
			// 127(byte) + 1(byte) = 127(int) + 1(int) = 128(int)
			// 'a' + 'b' = 195 - 'a' is promoted to int value as 97 and 'b' is promoted to int value as 98
			
	// Same-Type Operations - If both operands are int, long, float or double, then operations are carried in that type and evaluated to value of that type.
		
			// 5 + 6 = 11
			// 1 / 2 = 0 not 0.5
			
	// Mixed-Type Operations - If operands belong to different types, then smaller type is promoted to a larger type.
	// Order of promotion: int -> long -> float -> double
			// 1/2.0 or 1.0/2 or 1.0/2.0 = 0.5
			// char + float -> int + float -> float + float -> float
			// 9 / 5 * 20.1 -> (9 / 5) * 20.1 -> 1 * 20.1 -> 1.0 * 20.1 -> 20.1
	// Type of the final result will be of largest data type.
	char c1 = 50;  
	System.out.println("c1: "+c1); // c1 will be assigned to corresponding UTF16 value 2
	System.out.println("(73-c1): "+(73-c1)); // c1 gets promoted to int, i.e. decimal equivalent 50 in UTF16 is used
	System.out.println("(c1-'3'): "+(c1-'3'));  // c1 and '3' are promoted to ints. c1 is promoted to 50 and '3' is promoted to 51. 
	System.out.println("('a' + 'b'): "+('a' + 'b')); // 'a' and 'b' are promoted to ints and the respective equivalents 97 and 98 are added 		
	}
	
	static void comparisonOperators(){
		// comparison operators ( >, <, ==, >=, <=, (!=, ==) - equality operators) evaluates to a boolean value - true or false
		int age = 25;
		
		// these 4 operators are applicable to only primitive numeric types except boolean
		System.out.println("age > 21: "+ (age > 21));
		System.out.println("age < 21: "+ (age < 21));
		System.out.println("age >= 21: "+ (age >= 21));
		System.out.println("age <= 21: "+ (age <= 21));
		
		// equality operators
		System.out.println("age == 21: "+ (age == 21));
		System.out.println("age != 21: "+ (age != 21));
		
		boolean isInternational = true;
		System.out.println("isInternational == true: " +(isInternational == true));
		System.out.println("isInternational != true: " +(isInternational != true));
		
		// equality operators can be used with object references
		Student s1 = new Student(1000, "Vennela");
		Student s2 = s1;
		System.out.println("s1 == s2: "+(s1==s2)); // s1 and s2 are referencing the same objects.
		
		Student s3 = new Student(1000, "Vennela");
		System.out.println("s1 == s3: "+(s1==s3)); // Identity comparison - s1 and s3 are referencing to different objects.
		
		update(null, "John");  // throws a NullPointerException as s is null and invoking on null throws a NullPointerException
		
	}
	
	static boolean update(Student s, String name){
	/*	if(s == null){
			return false;
		}
		s.name = name;
	*/
		if(s != null && s.id > 1000){
			s.name = name;
		}
		return true;
	}

	static void logicalOperators(){
	// Logical AND (&&) - conjunction, Logical OR (||) - disjunction and Logical NOT (!) - negation
	// Comparison operators test only one condition 
	// Logical operators test multiple conditions
	
	// Short-circuit Operators (&&, ||)
	// && - Conditional AND : left operand is false, return false - right operand is not evaluated
	// || - Conditional OR : left operand is true, return true - right operand is not evaluated
	
	// && prevents NullPointerException
	/* 
		if(s.age > 21){
			s is object reference referencing an object reference such as Student. If s happens to be null, then it throws a NullPointerException at runtime and program execution would stopped.
		}
		// To prevent the above NullPointerException we can add a null check.
		if(s != null && s.age > 21){
			
		}
	*/
	
	int age = 37;
	int salary = 95000;
	boolean hasBadCredit = false;
	
	// 1. AND, OR, NOT & Operator chaining
	//    NOT should have a boolean operand.
		if((!(age <= 35) && (salary > 9000 * 10)) && (!hasBadCredit)){ // Left-to-right grouping
			System.out.println("LOAN Approved!");
		}else{
			System.out.println("LOAN NOT Approved!");
		}
	}
	
	//2. (a) Left Associativity ~ Order of grouping
	//   (b) Associativity (a && b) && c = a && (b && c)
	//	 (c) Applies to both && and ||
	
	// 3. (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution (! > && > ||)
	//    (b) Operator Precedence across Logical, comparison and arithmetic -   ! > arithmetic operators > comparison operators > AND > OR
	//    (c) ALWAYS USE PARANTHESIS FOR READABILITY.
	

}