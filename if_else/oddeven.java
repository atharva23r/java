package if_else;
import java.util.Scanner;
public class oddeven {
public static void main (String[] args){
    Scanner var= new Scanner(System.in);
    System.out.println("Enter the number ");
    int n=var.nextInt();
    var.close();
    if(n%2==0){
        System.out.println("The number is even");
    }
    else{
        System.out.println("the number is odd");
    }
    }
}
