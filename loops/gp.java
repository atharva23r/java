package loops;
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n terms");
        int n=sc.nextInt();
        System.out.print("enter the first term");
        int a=sc.nextInt();
        System.out.print("enter the common ratio");
        int r=sc.nextInt();
        sc.close();
        for(int i=0;i<=n;i++){
            //a,ar,ar*r
            System.out.print(a+" ");
            a=a*r;
            
        }
    }
    
}
