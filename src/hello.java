import java.util.Scanner;

public class hello{
    public static void  main(String arg []){

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input first number: ");
        int a = scan.nextInt();
        System.out.printf("Input second number: ");
        int b = scan.nextInt();
        System.out.println();
        func(a,b);
    }
    public static void func(int g,int c){
        int sum = g+c;
        System.out.println(g + " + " + c + " = " + sum);
        int minus = g-c;
        System.out.println(g + " - " + c + " = " + minus);
        int incr = g*c;
        System.out.println(g + " * " + c + " = " + incr);
        int divide = g/c;
        System.out.println(g + " / " + c + " = " + divide);
        int mod = g%c;
        System.out.println(g + " mod " + c + " = " + mod);


    };

}
