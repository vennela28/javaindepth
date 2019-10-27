import java.lang.*;
public class CurrencyExchange{
	/* Method Definition
		input variables passed to the methods - parameters / formal parameters
		method invocation - arguments / actual parameters
		
	   Method return types - mandatory in a method declaration
		can be primitve, array, class, interface or void
		if method return type is not present - compilation error
	   
	   2 kinds of methods in a class
	     1. Instance methods 
				object-level methods: methods of instances / objects of a class
				Invocation: objectReference.methodName()
				
		 2. Static methods
		        keyword static in declaration
				
				class-level methods - global, accessible across all objects
				from static methods we cannot access instance variables/methods as they are specific to objects
				
				no access to state(instance variables / methods)
				serve as utility methods - sum(double x, double y)
				can access static variables - variables that are shared across different objects of same class 
				can access other static methods within the same class.
				Invocation: className.methodName()
				
				
	   IMPORTANT
	   From an instance method static methods/variables can be accessed because static is global and shared across all objects. 
	   But from static method instance methods/variables cannot be accessed because instance stuff is specific to a particular instance/object.
	*/
	
	double[] exchangeRates;
	
	void setExchangeRates(double[] newValues){
		this.exchangeRates = newValues;
	}
	
	void updateExchangeRate(int arrayIndex, double newVal){
		exchangeRates[arrayIndex] = newVal;
	}
	
	double getExchangeRate(int arrayIndex){
		return exchangeRates[arrayIndex];
	}
	
	double computeTransferAmount(int arrayIndex, double amount){
		return amount * getExchangeRate(arrayIndex);
	}
	
	void printCurrencies(){
		System.out.println("rupee: "+ exchangeRates[0]);
		System.out.println("dirham: "+ exchangeRates[1]);
		System.out.println("real: "+ exchangeRates[2]);
		System.out.println("chilean peso: "+ exchangeRates[3]);
		System.out.println("mexican peso: "+ exchangeRates[4]);
		System.out.println("yen: "+ exchangeRates[5]);
        System.out.println("australian: "+ exchangeRates[exchangeRates.length-1]);
	}
	/* 
	   main is a static method, we cannot use any state related methods(instance methods) 
	*/
	public static void main(String[] args){
		CurrencyExchange ce = new CurrencyExchange();
		
		System.out.println("\nMarch 1, 2014 status");
		// March 1
		double[] val = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0}; // declaration statement
		ce.setExchangeRates(val);
		ce.printCurrencies();  // object reference variable ce in order to access the instance methods.
		
		System.out.println("\nMarch 2, 2014 status");
		// March 2
		val = new double[]{68.5, 5.0, 3.0, 595.5, 20.0, 109.0, 3.0}; // assignment statement
		ce.setExchangeRates(val);
		ce.printCurrencies();  
		
		System.out.println("\nAugust 11, 2019 USD=INR status");
		// August 11, 2019
		double newEntry = 71.04;
		ce.updateExchangeRate(0, newEntry);
		ce.printCurrencies();
		
		System.out.println("\nThe exchange rate for Indian Rupee is: "+ce.getExchangeRate(0));
		
		System.out.println("\nThe transfer rate for USD in Indian Rupee for that day was: "+ce.computeTransferAmount(0, 1500));
	}
}	