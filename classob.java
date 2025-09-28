class calc{
    int a;
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}


public class classob {
    public static void main(String[] args) {
        int n=10;
        int m=20;
        calc cal =new calc();
        int res= cal.add(n,m);
        System.err.println(res);
    }
}
