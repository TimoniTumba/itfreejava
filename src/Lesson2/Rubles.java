package Lesson2;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.

import java.util.Random;

public class Rubles {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        if (Math.abs(x) % 100 >= 11 & Math.abs(x) % 100 <= 14) { // Проверка на 11/12/13/14 в конце числа
            System.out.println(Math.abs(x) + " рублей");
        } else {

            switch (Math.abs(x) % 10) {
                case 1:
                    System.out.println(Math.abs(x) + " рубль");
                    break;
                case 2:
                    System.out.println(Math.abs(x) + " рубля");
                    break;
                case 3:
                    System.out.println(Math.abs(x) + " рубля");
                    break;
                case 4:
                    System.out.println(Math.abs(x) + " рубля");
                    break;
                case 5:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
                case 6:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
                case 7:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
                case 8:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
                case 9:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
                case 0:
                    System.out.println(Math.abs(x) + " рублей");
                    break;
            }
        }


    }
}
