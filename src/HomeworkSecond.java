import java.util.Scanner;

public class HomeworkSecond {
    public static void main(String[] args) {


        System.out.println("Приветствуем в CurrencyConverter");
        System.out.println();
        System.out.println();
        System.out.println("Выберите исходную валюту:");
        System.out.println();

        System.out.println("1. EURO");
        System.out.println("2. USD");
        System.out.println("3. JPY");

        double rubletoeuro = 100.5;
        double rubletousd = 93.6;
        double rubletojpy = 14.6;


        Scanner scanner = new Scanner(System.in);
        int currency = scanner.nextInt();

        System.out.println("Введите сколько денег хотите поменять");
        int amount = scanner.nextInt();
//        double result = 0.0;

        if (currency == 1) {
             double result = rubletoeuro * amount;
            System.out.println(result);
        }
        if (currency == 2) {
            double result = rubletousd * amount;
            System.out.println(result);
        }
        if (currency == 3) {
            double result = rubletojpy * amount;
            System.out.println(result);

        }
//        System.out.println(result);

//        Scanner currencyeuro = new Scanner(System.in);
//        double euro = currencyeuro.nextDouble();
//        double resulteuro = euro * rubletoeuro;
//
//        System.out.println(resulteuro + " Рублей");
//    }
//
//        if(currency ==2)
//
//    {
//
//        Scanner currencyusd = new Scanner(System.in);
//
//        double usd = currencyusd.nextDouble();
//        double resultusd = usd * rubletousd;
//        System.out.println(resultusd + " Рублей");
//
//    }
//
//        if(currency ==3)
//
//    {
//        Scanner currencyjpy = new Scanner(System.in);
//        double jpy = currencyjpy.nextDouble();
//
//        double resultjpy = jpy * rubletojpy;
//
//        System.out.println(resultjpy + " Рублей");
//    }
//
//    {
//
//    }
//
//    {
//
//
//    }
//
//    {


    }


}





