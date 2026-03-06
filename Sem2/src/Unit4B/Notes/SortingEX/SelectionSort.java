package Unit4B.Notes.SortingEX;

public class SelectionSort {
    public static void main (String[] args){
        int[] nums = {2, 3, 5, 1, 0, 8, 3, 7, 2};

        for(int i = 0; i < nums.length - 1; i++){
            int smallest = i;

            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[smallest]){
                    smallest = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }

        for(int i : nums){
            System.out.print(i + ", ");
        }
    }
}
