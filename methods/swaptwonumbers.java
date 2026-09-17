package methods;
import java.util.Scanner;
public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println(a+"  "+ b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+"  "+ b);
        
        
    }
    
}
