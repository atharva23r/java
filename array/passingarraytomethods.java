package array;

public class passingarraytomethods {

    public static void main(String[] args) {
        int[] x={10,20,30,40};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int [] x){
        x[2]=50;
        

    }
    
    
}
