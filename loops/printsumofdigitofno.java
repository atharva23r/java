package loops;
import java.util.Scanner;
public class printsumofdigitofno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        sc.close();
        int count=0;
        while(n!=0){
            count=count+n%10;
            n=n/10;
            
        }
        System.out.println("the sum of digit is:"+count);
    }
    
}
