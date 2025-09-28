
class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class thrprior {
    public static void main(String[] args){
        A obj=new A();
        B obj2=new B();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj2.start();
    }
    
}
