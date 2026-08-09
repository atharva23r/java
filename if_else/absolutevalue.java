package if_else;
import java.util.Scanner;
public class absolutevalue {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        if(n<0){
            n=-n;
        }
        System.out.print("the absolute value is "+ n);

    }
    
}
