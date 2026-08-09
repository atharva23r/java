import java.util.Scanner;
public class sumoftwo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first no.:");
        int b= sc.nextInt();
        System.out.print("Enter the second no.:");
        int c=sc.nextInt();
        System.out.print("Enter the thrid no.:");
        int d=sc.nextInt();
        sc.close();

        System.out.println("the sum of three no. is :"+ (b+c+d));

    }
    
}
