public class CurrencyConverterArray{
	
	double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
	
	void printCurrencies(){
		System.out.println("rupee: "+ exchangeRates[0]);
		System.out.println("dirham: "+ exchangeRates[1]);
		System.out.println("real: "+ exchangeRates[2]);
		System.out.println("chilean peso: "+ exchangeRates[3]);
		System.out.println("mexican peso: "+ exchangeRates[4]);
		System.out.println("yen: "+ exchangeRates[5]);
        System.out.println("australian: "+ exchangeRates[exchangeRates.length-1]);
	}
	public static void main(String[] args){
		CurrencyConverterArray cc = new CurrencyConverterArray();
        cc.printCurrencies();
	}

}