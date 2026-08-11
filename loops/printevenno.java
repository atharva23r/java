package loops;
import java.util.Scanner;
public class printevenno {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        sc.close();
        for(int i=2;i<=n;i=i+2){
            System.out.print(i+ " ");

        }
    }
}
