class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name=a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int b) {
        age=b  ;
    }
    

}

public class encap {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setName("Tanvi");
        obj.setAge(25);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());


        
    }
    
    
    
}
