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
        int temp=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                temp=1;
                b=i;
                break;
            }
        }
        if(temp==0){
            System.out.print("the element is not there in the array");
        }
        else{
            System.out.println("the element is there " + arr[b]);
        }
        
    }
    
}
