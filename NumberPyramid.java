
interface  A{
    void sound();
    default void display(){
        System.out.println("A");
    }

}
class B implements A{
            public void sound(){
            System.out.println("dog barks");

        }
    public static void main(String[] args) {
        B a=new B();
        a.sound();
        a.display();

    }
}