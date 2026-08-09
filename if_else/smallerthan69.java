package if_else;
import java.util.Scanner;
public class smallerthan69 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no .");
        int n = sc.nextInt();
        sc.close();
        if(n<0){
            n=-n;
            if(n<69){
                System.out.print("the magnitude of no. is less than 69");
            }
        else{
                System.out.print("the magnitude of no. is greater than 69");
            }

                }
        else{
                System.out.print("the magnitude of no. is greater than 69");
            }
    }
    
}
