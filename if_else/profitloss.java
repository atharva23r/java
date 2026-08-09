package if_else;
import java.util.Scanner;

public class profitloss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price:");
        double c=sc.nextDouble();
        System.out.print("enter the selling price:");
        double s=sc.nextDouble();
        sc.close();
        if (c>s){
            System.out.print("loss"+  (c-s));

        }
        else if(s>c){
            System.out.print("profit"+  (s-c));
        }
        else{
            System.out.print("no profit no loss");
        }
    }
    
}
