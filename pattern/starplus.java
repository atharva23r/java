package pattern;
import java.util.Scanner;
public class starplus {
    public void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("enter the number");
    int n =sc.nextInt();
    sc.close();
    for(int i=1; i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==(n/2)+1 || j==(n/2)+1 )
            System.out.print("* ");
            else{
            System.out.print("  ");
            }
        }
    System.out.println();
    }
    }
    
}
