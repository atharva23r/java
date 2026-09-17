package array;
import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int a=arr.length;
        System.out.print("Enter the elements: ");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int add=0;
        for(int i=0;i<a;i++){
            add=add+arr[i];
        }
        System.out.print("addition of the array"+ add);
        sc.close();
    }
    
}
