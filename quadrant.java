package if_else;
import java.util.Scanner;
public class quadrant {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the x-axis:");
    int x=sc.nextInt();
    System.out.print("Enter the y-axis:");
    int y=sc.nextInt();
    sc.close();
    if(x>0 && y>0){
        System.out.print("the point lies in 1st quadrant");
        
    }
    else if(x>0 && y<0){
        System.out.print("the point lies in 4th quadrant");

    }
    else if(x<0 && y>0){
        System.out.print("the point lies in 2nd quadrant");

    }
    else if(x<0 && y<0){
        System.out.print("the point lies in 3rd quadrant");

    }
    else if(x==0 && y!=0){
        System.out.print("the point lies on y-axis");
    }
    else if(x!=0 && y==0){
        System.out.print("the point lies on x-axis");

    }
    else{
        System.out.print("the point is on origin");
    }
}
}