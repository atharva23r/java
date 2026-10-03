package array;
import java.util.Scanner;
public class rotatearray {
    public static void reverse(int [] arr, int i , int j){
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }
    }
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr ={1,2,3,4,5,6,7,8,9};
    int n=arr.length;
    System.out.print("enter the target: ");
    int d = sc.nextInt();
    d=d % n;
    reverse(arr, 0, d );
    reverse(arr,d+1,n-1);
    reverse(arr,0, n-1);
    print(arr);
    sc.close();

    }

}
