public class Operators{
	public static void main(String[] args){
		preAndPost();
		compoundArithmeticAssignment();
		isEvenOdd(20);
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
}