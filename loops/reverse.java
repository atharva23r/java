package loops;
//to count the digits of number and print the reverse number of it 
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number that you want to reverse");
        int n=sc.nextInt();
        sc.close();
        int count=0;

        while(n!=0){
            System.out.print(n%10);
            count=count+n%10;
            n=n/10;

        }
        System.out.println("\nthe count of the number is:"+count);
    }
    
}
