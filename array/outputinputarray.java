package array;
import java.util.Scanner;
public class outputinputarray {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int [] arr={12,23,45,34,23,23};
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " " );
    }
    int [] nums=new int [5];
    int n=nums.length;
    System.out.println("\nenter the numbers");
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(nums[i]+"  ");
    }
    sc.close();
    
}
}
