import java.util.Scanner;

//1) В консоль вводится число, если оно больше 1000, то выводите сообщение "Я богат",
//если больше 10000, то "я ультра богат"
//
//        2) К первой задаче добавляем: "Если введено больше 10 000, то пишем на экран
//        "я могу купить, все что хочу"
public class HomeworkThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой я и чтотя могу?");
        System.out.println();

        int a = scanner.nextInt();
        if (a > 10000) {
            System.out.println("Я ультра богат");
        } else if (a > 1000) {
            System.out.println("Я  богат");

        } if (a > 100000) {
            System.out.println("Я могу купить, все что захочу");
        }
    }
}
