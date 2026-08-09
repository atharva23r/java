package if_else;
import java.util.Scanner;

public class divisibleno {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.");
        int n=sc.nextInt();
        sc.close();
        if(n%3==0 && n%5==0){
            System.out.print("the no is divisible by both 3 and 5");
        }
        else if(n%5==0){
            System.out.print("the no. is divisible with 5");
        }
        
        else if (n%3==0){
            System.out.print("the no is divisible with 3");

        }
        else{
            System.out.print("the no is not divisible by both");
        }

    }
    
}
