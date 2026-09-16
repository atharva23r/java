package methods;

public class syntax {
    public static void display(){
        System.out.println("A");
        java();
    }
    public static void show(){
        System.out.println("B");
        display();
    }
    public static void java(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        display();
        show();
        
    }
    
}
