class BasicsDemo {
  
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
	// DataType       Bit Depth           Value range         `	  Default
	//  byte 	    8 bits           -2^7 to 2^7-1		    0
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
	System.out.println("Integer 65 mapped to character 'A' in UTF16: "+charInt);
	char charUnicode = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0) 
	System.out.println("Unicode number 41 gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charUnicode);
	char charHex = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	System.out.println("Hexadecimal number 0x41 gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charHex);
	char charBinary = 0b01000001; // binary corresponding to decimal 65
	System.out.println("Binary number gets mapped to 65 decimal which gets mapped to 'A' in UTF-16 : " + charBinary);	
	
  }
  public static void main(String[] args) {	
	   	// Language Basics 1
		print();	
		primitives();
		
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
