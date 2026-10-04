package array;

public class separate0and1 {
    public static void main(String[] args) {
        int [] arr={0,0,0,1,0,1,1,0};
        int n= arr.length;
        int m=0;
        int s=0;
        for(int i = 0 ; i<n;i++){
            if(arr[i]==0){m=m+1;
            }
            else{s=s+1;
            }
        }
        for(int i=0;i<n;i++){
            if(i<m){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        
    }
}
