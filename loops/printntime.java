package loops;
import java.util.Scanner;
public class printntime {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the no.");
    int n=sc.nextInt();
    sc.close();
        for(int i=1;i<=n;i++){
            System.out.print(i);
        }
    }
}
