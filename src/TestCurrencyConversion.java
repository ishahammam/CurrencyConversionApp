import java.util.Scanner;

public class TestCurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversion exchanger = new CurrencyConversion();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Euros to be converted to Dollars: ");
        double amountInUSD = scanner.nextDouble();
        System.out.print("Exchange Rate: ");
        double exchangeRate = scanner.nextDouble();
        System.out.println();

        System.out.println("Euros to be converted: " + amountInUSD);
        System.out.println("Exchange Rate: " + exchangeRate);
        System.out.println();

        System.out.println("Exchanged US Dollars: " + exchanger.convertEURToUSD(amountInUSD, exchangeRate));
        System.out.println("Payable US Dollars: " + exchanger.calculatePayable());
    }
}
