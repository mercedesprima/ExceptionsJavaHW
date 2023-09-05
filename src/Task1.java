import java.util.Scanner;
public class Task1 {
    /*
    * Задача 1:
* Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
* Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
* с сообщением "Некорректное число".
* В противном случае, программа должна выводить сообщение "Число корректно".*/

    public static void main(String[] args) throws InvalidNumberException {
        System.out.print("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }
}

