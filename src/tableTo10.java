import java.util.Scanner;

public class tableTo10{
    public static void main(String[] args) {
       /* Scanner num = new Scanner(System.in);


        System.out.println("Input a number: ");
        int z = num.nextInt();
        int sum;
        for (int i = 1; i<=10; i++){
            sum = z*i;
            System.out.println(z + " * "+ i + " = " + sum);
        }*/
       goodDeal();

    }
    public static void goodDeal (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter quantity of numbers: ");
        int a = scan.nextInt();//read entered number
        int array[] = new int[a];//configure the size of array
        for (int i = 0;i<a;i++){
            System.out.print("number #"+ (i+1) + ": ");//put entered numbers in array
            array [i] = scan.nextInt();
        }
        int sum=0;
        for(int i=0; i<array.length; i++) {// sum of the values of array
            sum=sum+array[i];
        }
        System.out.println("summary of the "+a+" numbers = " + sum); //
        double e = sum/a;
        System.out.println("average = "+ e);
    }
}
