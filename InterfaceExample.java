interface A{
    void display();
}
interface B{
    void show();
}
interface C extends B{
    void print();
}
class X implements B{
    public void display(){
        System.out.println("Display method from interface A");
    }
    public void show(){
        System.out.println("Show method from interface B");
    }
    public void print(){
        System.out.println("Print method from interface C");
    }
}   

public class InterfaceExample {
    public static void main(String[] args) {
        X obj = new X();
        obj.display();
        obj.show();
        obj.print();
    }
    
}
