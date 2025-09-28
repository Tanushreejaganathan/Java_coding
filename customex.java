class TanException extends Exception
{
   public TanException(String s)
    {
        super(s);
    }
}

public class customex {
    public static void main(String[] args)
    {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new TanException("Dont want to print 0");
            }
        }
        catch (TanException e) {
            j = 18 / 1;
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye"); // ✅ fixed
    }
}
