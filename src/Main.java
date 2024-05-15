
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Приветствуем в CurrencyConverter");
        System.out.println();
        System.out.println();
        System.out.println("Выберите исходную валюту:");
        System.out.println();

        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. JPY");
        System.out.println();

        double rubletoeuro = 100.5;
        double rubletousd = 93.6;
        double rubletojpy = 14.6;
        double euro, dollar, jpi;


        Scanner scanner = new Scanner(System.in);
        int currency = scanner.nextInt();
        System.out.println("Сколько будуте менять? ");
        int amount = scanner.nextInt();

        euro = amount * 100.5;
        dollar = amount * 93.6;
        jpi = amount * 14.6;

        if (currency == 1) {
            System.out.println(euro + " Рублей ");
        }
        if (currency == 2) {
            System.out.println(dollar + " Рублей ");
        } else if (currency == 3) {
            System.out.println(jpi + " Рублей ");

        }


//        //System.out.println("1. EURO");
//        Scanner currencyeuro = new Scanner(System.in);
//        double euro = currencyeuro.nextDouble();
//        double resulteuro = euro * rubletoeuro;
//        System.out.println("1. " + resulteuro + " Рублей");
//        ;
//
//        //System.out.println("2. USD");
//        Scanner currencyusd = new Scanner(System.in);
//        double usd = currencyusd.nextDouble();
//
//        double resultusd = usd * rubletousd;
//        System.out.println("2. " + resultusd + " Рублей");
//
//
//        //System.out.println("3. JPY");
//        Scanner currencyjpy = new Scanner(System.in);
//        double jpy = currencyjpy.nextDouble();
//
//        double resultjpy = jpy * rubletojpy;
//        System.out.println("3. " + resultjpy + " Рублей");
//
//        if (rubletoeuro == 1) {
//            System.out.println(currencyeuro);
//        } else if (rubletousd == 2) {
//            System.out.println(currencyusd);
//        } else {
//            System.out.println(currencyjpy);
//
//
////        System.out.println();
////        System.out.println();
//
////        System.out.println("1. " + resulteuro + " Рублей" );
////        System.out.println("2. " + resultusd + " Рублей");
////        System.out.println("3. " + resultjpy + " Рублей");
////        System.out.println();
////
////        //System.out.println("Выберите исходную валюту: ");
////        // Scanner scanner = new Scanner(System.in);
////        // String currencyeuro = scanner.nextLine();
////        // String euro = resulteuro + " Рублей";
////
////        System.out.println(currencyeuro);


    }
}
