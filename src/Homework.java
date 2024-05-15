import java.util.Scanner;

public class Homework {


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


        if (currency == 1) {


            double euro = scanner.nextDouble();
            double resulteuro = euro * rubletoeuro;

            System.out.println(resulteuro + " Рублей");
        }

        if (currency == 2) {


            double usd = scanner.nextDouble();

            double resultusd = usd * rubletousd;
            System.out.println(resultusd + " Рублей");

        }

        if (currency == 3) {

            double jpy = scanner.nextDouble();

            double resultjpy = jpy * rubletojpy;

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
