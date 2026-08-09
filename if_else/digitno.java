package if_else;
import java.util.Scanner;

public class digitno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the four digit no.");
        int n=sc.nextInt();
        sc.close();
        if(n>999 && n<10000){
            System.out.print("the no. is four digit");

        }
        else{
            System.out.print("the no. is not four digit");
        }
    }

    
}
