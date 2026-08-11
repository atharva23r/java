class A{
    String name="parent";
    void display(){
        System.out.println("Parent class");
    }
}
class B extends A{
    String name ="child";
    void show(){
        System.out.println("child class: "+this.name);
        System.out.println("parent class: "+super.name);
        

    }
    public static void main(String[] args) {
        B a=new B();
        a.show();
    }
}