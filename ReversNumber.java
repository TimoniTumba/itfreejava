import java.util.Scanner;

public class task2 {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(); //S
        while (a>0){
            System.out.print(a%10);
            a/=10;
        }
    }
}
