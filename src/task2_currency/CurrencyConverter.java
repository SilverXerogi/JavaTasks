package task2_currency;

import java.util.Scanner;

public class CurrencyConverter {
    private static final double USD_TO_EUR = 0.92;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_JPY = 147.35;
    private static final double USD_TO_RUB = 96.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в USD: ");
        double usd = scanner.nextDouble();

        System.out.println("Эквиваленты:");
        System.out.printf("EUR: %.2f%n", usd * USD_TO_EUR);
        System.out.printf("GBP: %.2f%n", usd * USD_TO_GBP);
        System.out.printf("JPY: %.2f%n", usd * USD_TO_JPY);
        System.out.printf("RUB: %.2f%n", usd * USD_TO_RUB);
    }
}
