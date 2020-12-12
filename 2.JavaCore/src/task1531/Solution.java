package task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

Для этого:
Введи с консоли число меньше либо равно 150.
Реализуй функцию factorial.
Если введенное число меньше 0, выведи 0.
0! = 1

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить на экран факториал введенного числа.
3. Метод factorial должен возвращать строковое представление факториала числа, переданного ему в качестве параметра.
4. Метод factorial должен принимать один параметр типа int.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int input = readConsole();
        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String result = null;
        BigInteger a = BigInteger.ONE;
        if (n < 0)
            result = "0";
        if (n == 0)
            result = "1";
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                a = a.multiply(BigInteger.valueOf(i));
            }
            result = a.toString();
        }
        return result;
    }

    private static int readConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число меньше либо равно 150.");
        int input = Integer.parseInt(reader.readLine());
        reader.close();
        return input;
    }
}
