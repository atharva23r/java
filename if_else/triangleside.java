package if_else;
import java.util.Scanner;
public class triangleside {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no.");
        int a=sc.nextInt();
        System.out.print("enter the second no.");
        int b=sc.nextInt();
        System.out.print("enter the third no.");
        int c=sc.nextInt();
        sc.close();
        
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.print("the no. can be sides of triangle");

        }
        else{
            System.out.print("the no. can not be the sides of triangle");
        }

    }
    
}
