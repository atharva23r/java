package array;
//second maximum element in array...
public class ques3 {
    public static void main(String[] args) {
        int [] arr= {2,5,3,1,10,8};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int smax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
}
