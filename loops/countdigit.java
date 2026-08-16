package loops;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        sc.close();
        int i=0;
        while(n!= 0){
            n=n/10;
            i=i+1;
        }
        System.out.print("the number of digit in the number:"+i);
        
    }
    
    
    
}
