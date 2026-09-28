package array;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of elements for an array: ");
        int n=sc.nextInt();
        int[] arr=new  int[n];
        System.out.print("enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target ");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+","+j);
                }
            }
        }
        sc.close();
    }
}
