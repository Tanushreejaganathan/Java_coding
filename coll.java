import java.util.*;

public class Coll {
    public static void main(String[] args) {

        // Custom Comparator to sort numbers by their last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;   // i comes after j
                } else {
                    return -1;  // i comes before j
                }
            }
        };

        // Create a list of numbers
        List<Integer> nums = new ArrayList<>();
        nums.add(27);
        nums.add(92);
        nums.add(54);

        // Sort the list using our comparator
        Collections.sort(nums, com);

        // Print the sorted list
        System.out.println(nums);
    }
}
