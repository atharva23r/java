package methods;

public class maxofthree {
    public static int max(int a,int b,int c){//max of three numbers
        if (a>=b && a>=c)return a;
        else if(b>=a && b>=c)return b;
        else return c;
        
    }
    public static void main(String[] args) {
        System.out.println("the maximun no. is:"+max(23, 45, 67));
        
    }
    
}
