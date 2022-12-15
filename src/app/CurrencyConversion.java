package app;

import java.text.DecimalFormat;

public class CurrencyConversion {

    private double amountInUSD;

    public double convertEURToUSD(double amountInEUR, double exchangeRate) {
        final double EXCHANGE_FEE = 0.025;   // Exchange Fee: 2.5%
        amountInUSD = (amountInEUR - (amountInEUR * EXCHANGE_FEE)) * exchangeRate;
        return amountInUSD;
    }

    public String calculatePayable() {
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        String payableInUSD = decimalFormat.format(amountInUSD);
        return payableInUSD;
    }
}
