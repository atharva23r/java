package if_else;
import java.util.Scanner;

public class greaterinthree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first no.");
        int x=sc.nextInt();
        System.out.print("Enter the second no.");
        int y=sc.nextInt();
        System.out.print("Enter the third no.");
        int z=sc.nextInt();
        sc.close();
        if(x>y){
            if(x>z){
            System.out.print("the greater no. is:"+x);
            }
            else{
                System.out.print("the greater no. is:"+z);
            }
        }
        else{//y>x
            if(y>z){
            System.out.print("the greater no. is:"+y);
            }
            else{
                System.out.print("the greater no. is:"+z);
            }

        }

    }
}
