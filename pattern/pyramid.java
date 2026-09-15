package pattern;
import java.util.Scanner;
public class pyramid {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        sc.close();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }
    

