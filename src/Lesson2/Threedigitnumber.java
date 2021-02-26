package Lesson2;

//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.

import java.util.Random;

public class Threedigitnumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000); // ограничил чтобы рандомило поскромнее
        System.out.println(x);
        if (Math.abs(x) < 1000 && Math.abs(x) > 99) { // Проверка на размер
            System.out.println("Число трехзначное");
        } else {
            System.out.println("Числе не трехзначное");
        }
        if (Math.abs(x) % 2 == 0) {                  // Проверка на чётность
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }
        if (Math.abs(x) % 10 == 7) {           // Проверка на семёрку
            System.out.println("Последняя семёрка");
        } else {
            System.out.println("Последняя не семёрка");
        }
    }
}
