import java.util.Scanner;

public class HomeworkFour {
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
//

        if (currency == 1) {

//            Scanner currencyeuro = new Scanner(System.in);
//            double euro = currencyeuro.nextDouble();
            double resulteuro = currency * rubletoeuro;

            System.out.println(resulteuro + " Рублей");
        }

        if (currency == 2) {

//            Scanner currencyusd = new Scanner(System.in);
//
//            double usd = currencyusd.nextDouble();
            double resultusd = currency * rubletousd;
            System.out.println(resultusd + " Рублей");

        }

        if (currency == 3) {
//            Scanner currencyjpy = new Scanner(System.in);
//            double jpy = currencyjpy.nextDouble();

            double resultjpy = currency * rubletojpy;

            System.out.println(resultjpy + " Рублей");
        }
        {

        }
        {


        }
        {


        }
        {


        }
    }

}



