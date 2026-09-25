package array;
//multiply odd indexed elements by two and add 10 to even/
//indexed elements...
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        print(arr);
        change(arr);
        print(arr);
        sc.close();
    }
    public static void print(int [] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void change (int [] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
                
            }
            else{
                arr[i]=arr[i]*2;
            }
        }

    }
    
    
}
