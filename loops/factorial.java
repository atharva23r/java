package loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number");
    int n=sc.nextInt();
    sc.close();
    int i=1;
    int fact=1;
    while(i<=n){
        fact=fact*i;
        i++;
    }
    System.out.println(fact);
    }
    
    
}
