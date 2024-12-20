import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class CurrencyFormatter{
    public static void main(String[] args){
        System.out.println("Enter the amount: ");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        // For US Dollars
        Locale AmericanLocale = new Locale("en", "US");
        NumberFormat AmericanFormatter = NumberFormat.getCurrencyInstance(AmericanLocale);
        System.out.println("US Dollars: " + AmericanFormatter.format(payment));

        // For Indian Rupees
        Locale IndianLocale = new Locale("en", "IN");
        NumberFormat IndianFormatter = NumberFormat.getCurrencyInstance(IndianLocale);
        System.out.println("Indian Rupees: " + IndianFormatter.format(payment));


        // For Chinese Yuan
        Locale ChineseLocale = Locale.CHINA;
        NumberFormat ChineseFormatter = NumberFormat.getCurrencyInstance(ChineseLocale);
        System.out.println("Chinese Yuan: " + ChineseFormatter.format(payment));
        
        // For French Euro
        Locale FrenchLocale = Locale.FRANCE;
        NumberFormat FrenchFormatter = NumberFormat.getCurrencyInstance(FrenchLocale);
        System.out.println("French Euro: " + FrenchFormatter.format(payment));
        
    }
}