import java.lang.*;
public class CurrencyConverter{
        static double rupee = 63;
        static double dirham = 3;
        static double _yen = 107;
        static double $australian = 2;
		static double[] exchangeRates = new double[]{rupee, dirham, _yen, $australian};
    //    static int dollar;
    //    static final int Rupee = 63;
	public static void printCurrencies(){
        System.out.println("yen: "+ exchangeRates[2]);
        System.out.println("australian: "+ exchangeRates[3]);
        System.out.println("rupee: "+ exchangeRates[0]);
        System.out.println("dirham: "+ exchangeRates[1]);
		System.out.println("array length: "+exchangeRates.length);
   //     System.out.println("dollar "+ dollar);
   //     System.out.println("Rupee "+ Rupee);
	}
	public static void main(String[] args){
   //     CurrencyConverter cc = new CurrencyConverter();
        printCurrencies();
	}
}