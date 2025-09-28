class Human{
    private String name;
    private int age;
    public Human(){
        name="Tanu";
        age=20;
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



class constructor{
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setName("Pavi")    ;
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}

