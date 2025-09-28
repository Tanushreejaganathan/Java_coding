public class Inher {
    public static void main(String[] args) {

        Veryadv obj=new Veryadv();
        int res=obj.add(5, 6);
        int res1=obj.sub(9, 4);
        int res2=obj.mul(3, 4);
        int res3=obj.div(8, 2);
        int res4=obj.mod(10, 3);
        System.out.println("Addition: " + res);
        System.out.println("Subtraction: " + res1);
        System.out.println("Multiplication: " + res2);
        System.out.println("Division: " + res3);
        System.out.println("Modulus: " + res4);
    }
}
