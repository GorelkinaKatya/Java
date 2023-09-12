// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        calculate();
        System.out.println(calculate());
    }

    private static int countNTriangle() {
            /*Вычислить n-ое треугольного число(сумма чисел от 1 до n).
            Внутри класса Answer напишите метод countNTriangle,
            который принимает число n и возвращает его n-ое треугольное число.
            Пример:
            n = 4 -> 10
            n = 5 -> 15 */

        int n = 5;
        int Tn = n * (n + 1) / 2;
        return Tn;

    }

    private static void printPrimeNums() {
        /*Напишите функцию printPrimeNums, которая выведет на экран все простые числа
         в промежутке от 1 до 1000, каждое на новой строке.
         Напишите свой код в методе printPrimeNums класса Answer.*/

            for (int i = 1; i < 1001; i++) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count = count + 1;}
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }

    }

    private static int calculate() {
        /*Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
         над двумя числами и возвращать результат. В классе должен быть метод calculate, который
         принимает оператор и значения аргументов и возвращает результат вычислений.
         При неверно переданном операторе, программа должна вывести сообщение об ошибке
         "Некорректный оператор: 'оператор'".*/
        char op = '-';
        int a = 3;
        int b = 7;

        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else result = a / b;

        return result;
    }
}