public class ControlFlowStatements{
	public static void main(String[] args){
		ifStatement();
	
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
}