package array;

import java.util.Scanner;

public class minimumelementarray {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0+1;i>arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        System.out.print("the maximum number is :"+ max);

        }
        sc.close();
    
}
}