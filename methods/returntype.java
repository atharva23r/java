package methods;

public class returntype {
    public static int display(){
        System.out.println("A");
        System.out.println("B");
        return 5;
    }
    public static void main(String[] args) {
        System.out.println(45+display());// using the print to use the return type
        display();//only calling the function
        
    }
    
}
