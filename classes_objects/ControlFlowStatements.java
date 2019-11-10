public class ControlFlowStatements{
	public static void main(String[] args){
		// ifStatement();

		
		/* Switch statement - intent, readability, speed
		-	cannot be used when we have more than one statement to test. 
		-    test other than equality i.e. month >= 3.
		-	switch expression is not integer, string, or enum.
		-	A case label restriction does not apply.
		
		If # of conditions is N, then if-Statement takes O(N) time, switch-Statement takes O(1) time. 
		*/
		switchStatement(); 
	}
	
	static boolean ifStatement(){
		boolean approved = false; 
		
		int age = 27;
		int salary = 60000;
		boolean hasBadCredit = false;
		
		// if(boolean expression){ } Only boolean expression is accepted in if-Statement clause
		// If anything other than boolean is given in the if-Statement it will give a compiler error - int cannot be converted to boolean
		if(age >= 25 && age <= 35 && salary >= 50000){
			approved = true;
			System.out.println("age >= 25 && age <= 35 && salary >= 50000"); // and return true;
		}else if(age >= 35 && age <= 45 && salary >= 70000){
			approved = true;  
			System.out.println("age >= 35 && age <= 45 && salary >= 70000"); // and return true;
		}else if(age >= 45 && age <= 55 && salary >= 90000){
			approved = true;  
			System.out.println("age >= 45 && age <= 55 && salary >= 90000"); // and return true;
		}else{
			if(age > 55 && !hasBadCredit){
				approved = true;
				System.out.println("age > 55 && !hasBadCredit");  // and return true;
			}
			System.out.println("Outside else-Statement");    // or return false;   - Take care that the code becomes reachable
		}
		System.out.println("Outside if-Statement");
		return approved;
	}
	
	static void switchStatement(){
		
		int month = 3;
		
		// Switch expression type should be an Integer variable e.g. x + y = 7
		// The variable can be of type byte, short, char, int but not long.
		/* The variable can be instance of these classes Byte, Short, Character, Integer (object reference)  - can use Boxed Primitive as switch expression.
		
			//int month = 1;  
			Integer month = new Integer(1);  - We can use boxed primitive as a switch expression
			switch(month){
				case 1: System.out.println("January");
						break;
				case 2: System.out.println("February");   
						break;
				default: System.out.println("March");
			}
		*/
		// Switch expression can also be a String (since Java 7) - before compiler error
		
		
		// Switch expression can also be an enum.
		
		// If switch expression evaluates to null at runtime, we get a NullPointerException
		
		/*
		Case Label Restrictions
		1.	must be within the range of data type of switch expression.
			
			byte month = 3;  // the range of byte is -128 to 127
			switch(month){
				case 1: System.out.println("January");
						break;
				case 128: System.out.println("February");   // this case label is outside the range of byte, get a compiler error.
				case (byte)128: System.out.println("February");  // doing a cast here is one solution
						break;
				default: System.out.println("March");
			}
			
		2.	Constant Expression (Integer literal or String literal or Constant variable needs be initialized and final e.g. final byte month2 = 2;): value known at compile time.
		
		//	final byte month2 = 2;  // final variable : compile-time constant : Compiler will take this value 2 and would insert it in the bytecode.
			byte month2 = 2;  // the value will not be final in this case and the value can be changed and they are evaluated at only runtime.
			byte month = 3;
			switch(month){
				case 1: System.out.println("January");  // value of this case label is known at compile time.
						break;
				case month2: System.out.println("February");   // value of the variable month2 is evaluated at runtime and value is not known at compile time.
						break;
				default: System.out.println("March");
			}
			
		3.	Value must be unique.
		
		4.	Cannot be null.
			
			
		
		*/
		
		switch(month){  // Switch statement takes a variable
		// Cases here take conditions as Control flow statements take conditions
		
			case 1: System.out.println("January");
					break;  // end of switch statement
			case 2: System.out.println("February");
					break;
			case 3: System.out.println("March");
					break;
			default: System.out.println("April");
		}
		 
	}
}