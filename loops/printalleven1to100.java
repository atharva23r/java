package loops;
import java.util.Scanner;

public class printalleven1to100 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    System.out.print("enter the no. to print the table:");
    int n=sc.nextInt();
    sc.close();
        for(int i=1;i<=10;i++){
                System.out.println(n+ "x"+ i +"="+ n*i);
            
        }
    }
    
}
