import java.util.Scanner;

public class MainSecond {
    public static void main(String[] args) {

        int choice;
        double amount;
        double dollar, yuan, euro;

        Scanner sc =new Scanner(System.in);


        System.out.println("Options: ");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Yuan");
        System.out.println("Enter 3: Euro");


        System.out.println("\nChoose your option");


        choice = sc.nextInt();
        System.out.println("Your number is:" + choice);

        System.out.println("Enter the amount you want to convert");
        amount =sc.nextFloat();
        System.out.println("Your amount is " + amount);
        yuan = amount * 7.12;
        System.out.println(amount + " Dollar = " + yuan + "Yaun");
        euro = amount * 1.02;
        System.out.println(amount + " Dollar = " + euro + " Euro");
    }
}
