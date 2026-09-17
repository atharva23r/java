package methods;
import java.util.Scanner;
public class permutationandcombination {
    public static int fact(int x){
        int n=1;
        for(int i=1;i<=x;i++){
            n=n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number(n)");
        int n=sc.nextInt();
        System.out.print("enter the number(r)");
        int r=sc.nextInt();
        sc.close();
        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println("combination" + ncr);
        int npr=fact(n)/fact(n-r);
        System.out.println("permutation"+npr);
    }
}
