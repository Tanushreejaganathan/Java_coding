public class multry {
    public static void main(String[] args) {
        int i =4;
        int j=0;
        int nums[] = new int[10];
        String str=null;
        try {
            
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[5]);
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }

        System.out.println(18/4);        
    }
}