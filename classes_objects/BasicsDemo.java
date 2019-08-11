class BasicsDemo {
  // Statement types
  // 1. Declaration statements - we can have only declaration statements at class-level
  // 2. Expression statements 
  // 3. Control-flow statements
  static int count = 7;  // declaration statement
  
  // count = 12; - expression statement - only at method level - compilation error 
  // count++;
  // getCount();
  
  // Control - flow statements
  // if(count == 7){
  //  System.out.println("Compiler error"); 
  // }
  static void print() {
    System.out.println("\n\nInside print...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }
  
  static void primitives(){
	System.out.println("\n\nInside Primitives...");
	System.out.println("\nInteger Datatype");
	// DataType   Bit Depth       Value range         `	  Default
	//  byte 		8 bits       -2^7 to 2^7-1		    	0
	//  short	   16 bits	     -2^15 to 2^15-1		    0
	//   int	   32 bits	     -2^31 to 2^31-1		    0
	//  long	   64 bits	     -2^63 to 2^63-1		    0
	//  float	   32 bits	     -3.4E+38 to 3.4E+38	    0.0f
	//  double	   64 bits	     -1.7E+308 to 1.7E+308	    0.0
	//  char	   16 bits	       0 to 2^16-1              '\u0000'
	//  boolean	  JVM specific	   true or false            false
	int intHex = 0x0041;
	System.out.println("Hexadecimal format to Integer format : " +intHex);
	int intChar = 'A';
	System.out.println("Decimal value Corresponding to character value 'A' is printed: "+intChar);
	int intBinary = 0b01000001;
	System.out.println("Binary format to Integer format (Java 7): "+intBinary);
	int underscore = 1_23_456;
	System.out.println("Integer representation in underscore (Java 7): " +underscore);
	
	System.out.println("\nCharacter Datatype - UTF-16 character encoding is used by JAVA to internally store characters. - 16 bit unsigned integer");
	char charA = 'A'; // character literal 'A'
	System.out.println("character literal 'A': "+charA);
	char charInt = 65;
	System.out.println("Integer 65 mapped to character 'A' in UTF-16: "+charInt);
	char charUnicode = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0) 
	System.out.println("Unicode number 41 gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charUnicode);
	char charHex = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	System.out.println("Hexadecimal number 0x41 gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charHex);
	char charBinary = 0b01000001; // binary corresponding to decimal 65
	System.out.println("Binary number gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charBinary);	
  }
  
  static void typeCasting(){
	System.out.println("\nInside Typecasting");
	
	// Explicit Casting
	long y = 42;
	// x = y; - compile time error - y gets evaluated to 42 only at runtime; compiler knows type of y which is long - incompatible types: possible lossy conversions from long to int
	int x = (int) y;
	
	// Information loss due to out-of-range assignment - So explicit casting is required
	byte b = (byte)1234567;
	System.out.println("b: "+b);
	
	// Explicit casting - Truncation
	int i = (int) 0.99;
	System.out.println("Explicit casting - Truncated value is returned: "+i);
	
	// Implicit cast (int to long)
	y = x;
	
	// Implicit cast (char to int);
	char c = 'A';
	int j = c;
	System.out.println("Character is casted to int implicitly: "+j);
	
	// Explicit casting - byte to char
	byte byteChar = 65;  
	char ch = (char)byteChar;  // special conversion where byte is converted to int - widening and then int is converted to char - narrowing
	System.out.println("Explicit casting - byte to char: " +ch);
  }
  static void arrays(){
	  System.out.println("\nInside Arrays...");
	  int[] a = new int[] {7, 9, 11, 13, 17, 19};
	  int length = a.length;
	  System.out.println("length: " +length);
  //  System.out.println("a[6] - ArrayIndexOutOfBoundsException - runtime error " +a[6]);  
  }
  
  static void threeDimensionalArray(){
		int[][][] unitsSold = new int[][][] {
							{   // New York
								{0, 0, 0, 0},  // Jan
								{0, 0, 0, 0},  // Feb
								{0, 0, 0, 0},  // Mar
								{0, 850, 0, 0},  // Apr
							},
							{   // San Francisco
								{0, 0, 0, 0},  // Jan
								{0, 0, 0, 0},  // Feb
								{0, 0, 0, 0},  // Mar
								{0, 0, 0, 0},  // Apr
							},
							{   // Chicago
								{0, 0, 0, 0},  // Jan
								{0, 0, 0, 0},  // Feb
								{0, 0, 0, 0},  // Mar
								{0, 0, 0, 0},  // Apr
							},
							{   // Atlanta
								{0, 0, 0, 0},  // Jan
								{0, 0, 0, 0},  // Feb
								{0, 0, 0, 0},  // Mar
								{0, 0, 0, 0},  // Apr
							},
		};
		System.out.println("The total number of iPads sold in the month of April in New York are: "+unitsSold[0][3][1]); 
  }
 /*
  static double sum(double x, double y){
	  return x + y;
  }
*/
/*
  static double sum(float x, float y){   // returning double even if we are computing float values - compatible types so no error
	  return x + y;
  }
*/
/*  
  static float sum(double x, double y){   // returning float even if we are computing double values - incompatible types  - COMPILER ERROR
	  return (float)(x + y);  // to overcome we do explicit casting to float
  }
*/
  static double sum(double x, double y){   // caller method main on line 171 has float - incompatible types - COMPILER ERROR so type cast on line 172
	  return x + y;  
  }
  
  static double avg(double x, double y){   // 
	  double sum = sum(x,y);
	  return sum/2;  
  }
  
  static boolean search(int[] list, int key){
	  return true;
  }
  
  public static void main(String[] args) {	
	   	// Language Basics 1
		// print();	
		// primitives();
		// typeCasting();
		// arrays();
		// threeDimensionalArray();
		
		// Pass arrays as arguments to method
		int[] m = {1, 2, 3, 4, 5};
		System.out.println("5 is found in the array? " +search(m, 5));
		System.out.println("5 is found in the array? " +search(new int[]{5, 1}, 5));
		
		// Methods 
		// double d = sum(3, 4.0);  // int parameter gets type casted automatically to double - no error
		// double d = sum(3.0f, 4.0); // compile-time error 4.0 - possible lossy conversion from double to float
		// double d = sum(3.0f, (float)4.0); // no error since explicit casting for 4.0
		// float d = sum(3.0f, (float)4.0);
		float d = (float) sum(3.0f, (float)4.0);
		System.out.println("sum: " +d);
		
		double d2 = avg(3.0, 2.0);
		System.out.println("average: "+d2);
		
		System.out.println("\nBoolean Datatype (true, false) - default value = false");
		boolean isInsured = true;
		
		double coverage = 0.8;
		double billAmount = 1000.0;
		double paidByInsurance = 0.0;
		double paidByPatient = billAmount;
		
		if(isInsured){
			paidByInsurance = billAmount * coverage;
			paidByPatient = billAmount - paidByInsurance;
		}
		System.out.println("Paid by Insurance: " +paidByInsurance);
		System.out.println("Paid by Patient: " +paidByPatient);
  }       
}