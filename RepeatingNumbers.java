import java.util.Scanner;

public class RepeatingNumbers {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите четырехзначное число:"); // S
        int number = console.nextInt();
        int aDigit = number / 1000 % 10;
        int bDigit = number / 100 % 10;
        int cDigit = number / 10 % 10;
        int dDigit = number % 10;
        if (aDigit == bDigit || aDigit == cDigit ||
                aDigit == dDigit || bDigit == cDigit ||
                bDigit == dDigit || cDigit == dDigit) {
            System.out.println("Цифры в числе повторяются");
        } else
            System.out.println("Цифры в числе все разные"); 
    }
}
