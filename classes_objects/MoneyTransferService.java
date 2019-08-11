import java.util.*;
public class MoneyTransferService{
	
	double[] exchangeRates;
	
	void setExchangeRates(double[] rates){
		this.exchangeRates = rates;
	}
	
	void updateExchangeRates(int countryIndex, double newRate){
		this.exchangeRates[countryIndex] = newRate;
	}
	
	double getExchangeRate(int countryIndex){
		return exchangeRates[countryIndex];
	}
	
	double computeTransferAmount(int countryIndex, double amount){
		return amount * getExchangeRate(countryIndex);
	}
	
	double computeTransferFee(int countryIndex, double amount){
		return 0.02 * computeTransferAmount(countryIndex, amount);
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
	
	public static void main(String... args){
		
		MoneyTransferService mts = new MoneyTransferService();
				
		double[] rates_current = new double[]{60.57, 3.0, 2.0, 595.5, 18.0, 107, 3};
		mts.setExchangeRates(rates_current);
		mts.printCurrencies();
		
		System.out.println("\nUpdated exchange rate");
		mts.updateExchangeRates(0, 71.04);
		mts.printCurrencies();
		
		System.out.println("\nThe exchange rate for Indian Rupee is: "+mts.getExchangeRate(0));
		
		double transferAmount = mts.computeTransferAmount(0, 1500);
		double transferFee = mts.computeTransferFee(0, 1500);
	
		System.out.println("\nThe transfer amount for USD in Indian Rupee for that day was: "+transferAmount);
		System.out.println("\nThe exchange rate for USD in Indian Rupee for that day was: "+transferFee);
		
	}
}
