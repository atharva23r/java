package loops;
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n terms");
        int n=sc.nextInt();
        System.out.println("enter the first term");
        int a=sc.nextInt();
        System.out.print("enter the diffrence b/w no.");
        int d=sc.nextInt();
        
        sc.close();
        //a,a+d,a+2d,a+3d
        for(int i=0;i<n;i++){
            System.out.print(a+i*d+" ");
        }

    }
    
}
