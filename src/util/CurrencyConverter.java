package util;

public class CurrencyConverter {

    public static final double IOF = 6;

    public static double conversor(double dolar, double quantidade){

        double valor = dolar * quantidade;
        return valor += valor * IOF/100;

    }
}
