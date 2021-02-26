package Lesson1;

import java.util.Scanner;

public class Seconds {
    public static void main (String[] args) {
        System.out.println("Выберите вариант расчёта: A, B, C, D: "); //S
        Scanner console = new Scanner(System.in);
        String option = console.nextLine();
        int s = 4500;
        int sec = s % 60;
        int m = (s-sec)/60;
        int min = m % 60;
        int h = (m-min)/60;
        int hour = h % 24;
        int d = (h-hour)/24;
        int day = d % 7;
        int w = (d-day)/7;

        String def = " минут " + sec + " секунд";
        if (option.equalsIgnoreCase("a")) {
            System.out.println(m + def);
        }
        if (option.equalsIgnoreCase("b")) {
            System.out.println(h + " час " + min + def);
        }
        if (option.equalsIgnoreCase("c")) {
            System.out.println(d + " дней " + hour + " час " + min + def);
        }
        if (option.equalsIgnoreCase("d")) {
            System.out.println(w + " недель " + day + " дней " + hour + " час " + min + def);
        }


    }
}
