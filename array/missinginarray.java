package array;
//1 to n-1 numbers in the array and one is missing ...
public class missinginarray {
    public static void main(String[] args) {
        
    
    int [] arr = {1,2,3,4,6,7,8,9};
    int n=arr.length +1;
    int sum = n*(n+1)/2;
    int arrsum=0;
    for(int ele : arr){
        arrsum = arrsum + ele;

    }
    System.out.print(sum-arrsum);
}
    
}
