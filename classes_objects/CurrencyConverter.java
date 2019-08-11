import java.lang.*;
public class CurrencyConverter{
        static int rupee = 63;
        static int dirham = 3;
        static int _yen = 107;
        static int $australian = 2;
        static int dollar;
        static final int Rupee = 63;
	public static void printCurrencies(){
        System.out.println("yen "+ _yen);
        System.out.println("australian "+ $australian);
        System.out.println("rupee "+ rupee);
        System.out.println("dirham "+ dirham);
        System.out.println("dollar "+ dollar);
        System.out.println("Rupee "+ Rupee);
	}
	public static void main(String[] args){
   //     CurrencyConverter cc = new CurrencyConverter();
        printCurrencies();
	}
}