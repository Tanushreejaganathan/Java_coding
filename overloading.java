class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double  a,double b){
        return a*b;
    }
}

public class overloading {
    
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        double r=calc.add(2.9,30.9);
        System.err.println(r);
    }
}
