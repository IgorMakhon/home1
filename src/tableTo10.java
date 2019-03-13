import java.util.Scanner;

public class tableTo10{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);


        System.out.println("Input a number: ");
        int z = num.nextInt();
        int sum;
        for (int i = 1; i<=10; i++){
            sum = z*i;
            System.out.println(z + " * "+ i + " = " + sum);
        }

    }
}
