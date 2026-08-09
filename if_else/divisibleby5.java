package if_else;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        sc.close();
        if(n%5==0){
            System.out.print("the number is divisible by 5");

        }
        else{
            System.out.print("the number is not divisible by 5");
        }

    }
}
