import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner ant = new Scanner(System.in);
        System.out.print("a = ");
        int a = ant.nextInt();
        System.out.print("b = ");
        int b = ant.nextInt();
        int swap = b;
        b = a;
        a = swap;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
