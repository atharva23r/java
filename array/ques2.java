package array;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the element which you want to search");
        int x=sc.nextInt();
        print(arr,x);

        sc.close();
    }
    public static void print(int [] arr,int a) {
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.print("the element is there : "+ arr[i] +"index: "+i);
            }
        }
        
    }
    
}
