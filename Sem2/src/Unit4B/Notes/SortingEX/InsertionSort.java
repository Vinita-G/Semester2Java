package Unit4B.Notes.SortingEX;

public class InsertionSort {
    public static void main (String[] args) {
        int[] nums = {2, 3, 5, 1, 0, 8, 3, 7, 2};
        for (int j : nums) {
            System.out.print(j + ", ");
        }
        System.out.println();

        // INSERTON SORT
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int position = i;
            while (position > 0 && nums[position - 1] > value) {
                nums[position] = nums[position - 1];
                position--;
            }
            nums[position] = value;
        }
        for (int j : nums) {
            System.out.print(j + ", ");
        }
    }
}
