class Mobile{
    String name;
    int num;
    static String brand;
    public void show()
    {
        System.out.println("Name: " + name);
        System.out.println("Number: " + num);
        System.out.println("Brand: " + brand);
    }
    public static void show1(Mobile obj)
    {
        System.out.println("Name: " + obj.name);
        System.out.println("Number: " + obj.num);
        System.out.println("Brand: " + brand);
    }
}
public class Stat{
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.name="phone";
        obj1.num=10;
        obj1.brand="Samsung";
        Mobile obj2=new Mobile();
        obj2.name="tablet";
        obj2.num=5;
        obj2.brand="Apple";

        obj2.brand="Oneplus";

        obj1.show();
        obj2.show();

        Mobile.show1(obj2);
       


    }
}