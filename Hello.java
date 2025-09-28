
class Hello {

    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // System.out.println(7+5);
        // int num=9;
        // System.out.println(num);

        int num=788;
        byte b=127;
        short s=334;
        long l=234567l;

        float f=9.8f;
        double d=6.89;

        char c ='A';

        boolean bo = true;

        System.out.println("Integer: " + num);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + b);
        
        //Literals
        int num1 = 0x7E;
        System.out.println("Hexadecimal: " + num1);

        int num2=10_00_00_000;
        System.out.println("Underscored Integer: " + num2);

        //casting
        int a=257;
        
        byte b1=(byte)(a);
        System.out.println("Byte value: " + b1);

        float f1=1.6f;
        int tu=(int)f1;
        System.out.println(tu);

        //promoting
        byte b3=10;
        byte b4=30;
        int res=b3*b4;
        System.out.println("Promoted Result: " + res);


    }
    

}
