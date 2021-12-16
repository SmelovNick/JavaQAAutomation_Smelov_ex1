import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    //упражнение 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        String[] numbers = scanner.nextLine().split(" ");
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double c = a/b;
        System.out.println("Результат деления равен " + c);

    }

    //упражнение 2
    public static void checkIsEven(int number){
        System.out.println(number%2 ==0 ? "Это число - чётное":"Это число - нечётное");
    }

    //упражнение 3
    public static void checkDateTime(int hours, int minutes, int seconds, String username){
        LocalTime dateTime = LocalTime.of(hours,minutes,seconds);
        LocalTime _5AM = LocalTime.of(5,0,0);
        LocalTime _12AM = LocalTime.of(12,0,0);
        LocalTime _16AM = LocalTime.of(16,0,0);
        LocalTime _23AM = LocalTime.of(23,0,0);

        if((dateTime.equals(_5AM) || dateTime.isAfter(_5AM)) && dateTime.isBefore(_12AM)) System.out.printf("Доброе утро, %s!\n", username);
        else if ((dateTime.equals(_12AM) || dateTime.isAfter(_12AM)) && dateTime.isBefore(_16AM)) System.out.printf("Добрый день, %s!\n", username);
        else if ((dateTime.equals(_16AM) || dateTime.isAfter(_16AM)) && dateTime.isBefore(_23AM)) System.out.printf("Добрый вечер, %s!\n", username);
        else System.out.printf("Доброй ночи, %s!\n", username);
    }
}
