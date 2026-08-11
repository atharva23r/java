package loops;
//printing 1,n-1,2,n-2,3....
import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the no. ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<n;i++){
            System.out.print(i +","+ (n-i)+",");
        }
    }
    
}
