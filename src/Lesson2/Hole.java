package Lesson2;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.

import java.util.Random;

public class Hole {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        while (a == 0) {
            a += 1;
        }
        int b = rand.nextInt(100);
        while (b == 0) {
            b += 1;
        }
        int r = rand.nextInt(100);
        while (r == 0) {
            r += 1;
        }
        System.out.println("a " + a); //Вывод для визуальной проверки работы
        System.out.println("b " + b);
        System.out.println("r " + r);
        int area = Math.abs(a) * Math.abs(b);
        double cardboard = 3.14 * Math.abs(r) * Math.abs(r);
        System.out.println(area);
        System.out.println(cardboard);
        if (cardboard >= area) {
            System.out.println("Картонка закроет отверстие");
        } else {
            System.out.println("Картонки не хватит закрыть отверстие");
        }


    }
}
