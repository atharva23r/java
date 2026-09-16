package methods;
import java.util.Scanner;
public class maxofthreeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number");
        int a=sc.nextInt();
        System.out.print("enter the second number");
        int b=sc.nextInt();
        System.out.print("enter the third number");
        int c=sc.nextInt();
        sc.close();
        int x=Math.max(a, b);
        System.out.print(Math.max(x, c));
    }
    
}
