# Assignment 2: CurrencyConversionApp

## Pseudo Code:
    
    private double amountInUSD;
    
    /* This method will return the converted USD in double type. */
    double convertEURToUSD() {
	    final EXCHANGE_FEE = 0.025;		// Exchange fee is constant --> 2.5%
	    amountInUSD = (amountInEUR - (amountInEUR * EXCHANGE_FEE)) * exchangeRate;
	    return amountInUSD;
    }
   
    /* This method will format the USD amout into the nearest rounded decimal format using an object of the DecimalFormat class and using the .format() method. After that it'll return the formated output in String type. */
    String calculatePayable() {
	    DecimalFormat decimalFormat = new DecimalFormat("###.#");
	    String payableInUSD = decimalFormat.format(amountInUSD);
	    return payableInUSD;
    }
    -------------------------------------------------------------


## Output:
![Fig: Assignment 2 - Output](output.PNG)
