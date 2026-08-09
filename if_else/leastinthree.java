package if_else;
import java.util.Scanner;
public class leastinthree {
    public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first no.");
    int x=sc.nextInt();
    System.out.print("Enter the second no.");
    int y=sc.nextInt();
    System.out.print("Enter the third no.");
    int z=sc.nextInt();
    sc.close();
    if(x<y && x<z){
        System.out.print("the least no. is:"+x);
    }
    else if(y<x && y<z){
        System.out.print("the least no. is:"+ y);

    }
    else{
        System.out.print("the least no. is:"+z);

    }
    }
}
