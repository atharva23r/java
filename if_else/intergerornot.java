package if_else;
import java.util.Scanner;
public class intergerornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        double n=sc.nextDouble();
        int x=(int)n;
        sc.close();
        if(n==x){
            System.out.print("the number is an integer");

        }
        else{
            System.out.print("the number is not an integer");
        }


    }
}
