package loops;
import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println("Enter the power :");
        int b=sc.nextInt();
        sc.close();
        int i;
        int pow=1;
        for(i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println(pow);
    }

    
}
