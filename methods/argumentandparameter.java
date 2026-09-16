package methods;

public class argumentandparameter {
    public static void sum(int a, int b,int c)//parameters
    {//sum of three numbers
        System.out.println(a+b+c);
    }
    public static void max(int a,int b,int c){//max of three numbers
        if (a>=b && a>=c)System.out.println("the maximum number is " + a);
        else if(b>=a && b>=c)System.out.println("the maximum number is " +b);
        else System.out.println("the maximum number is " +c);
        
    }
    public static void main(String[] args) {
        sum(45, 45,10);//arguments
        max(23, 45, 67);
        
    }
    
}
