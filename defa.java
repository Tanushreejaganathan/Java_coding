class Human{
    private String name;
    private int age;
    public Human(){
        name="Tanu";
        age=20;
    }
    
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Human(String name){
        this.name=name;
        this.age=26;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
    

}



class defa{
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human("Pavi");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
    }
    }

