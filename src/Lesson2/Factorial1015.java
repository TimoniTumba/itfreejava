package Lesson2;

// Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Factorial1015 {
    public static void main(String[] args) {
        int factorial = 10;
        for (int i = 11; i <= 15; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
