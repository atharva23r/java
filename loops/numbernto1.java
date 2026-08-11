package loops;
import java.util.Scanner;

public class numbernto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--){
            System.out.print(i +" ");
        }
    }
    
}
