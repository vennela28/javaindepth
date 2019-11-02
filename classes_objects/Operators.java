public class Operators{
	public static void main(String[] args){
		//preAndPost();
		//compoundArithmeticAssignment();
		//isEvenOdd(20);
		operatorPrecedence();
		charTypePromotion();
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
}