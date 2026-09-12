package pattern;
import java.util.Scanner;
public class rhombus {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in );
        System.out.print("enter the nuumber");
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
