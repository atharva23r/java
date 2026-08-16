package loops;
import java.util.Scanner;
public class compostite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        sc.close();
        boolean a=true;
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        if(n==1)
            System.out.println("neither prime or composite");
        else if(a==false)
            System.out.println("the number is composite");
        else
            System.out.println("the number is prime");
        


    }
    
}
