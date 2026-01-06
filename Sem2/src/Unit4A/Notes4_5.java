package Unit4A;
/*
Utilize array traversals to:
    Determine a minimum or maximum value
    Compute a sum or average
    Determine if at least one element has a particular property
    Determine if all elements have a particular property
    Determine the number of elements having a particular property
    Access all consecutive pairs of elements
    Determine the presence or absence of duplicate elements
    Shift or rotate elements left or right
    Reverse the order of the elements
    Find the first (or last) of an element
 */
public class Notes4_5 {
    public static void main(String[] args) {
    /*
        // testing findMinLocation
            int[] nums1 = {3, -20, 8, 5, -13, 7, 11, 2, -20, 56};
            int loc = findMinLocation(nums1);
            System.out.print("Testing findMinLocation: ");
            if (loc == 1 || loc == 8) {
                System.out.println("Works");
            }
            else {
                System.out.println("Has an error");
            }
     */


     /*
        // testing findAdjustedAverage
            int[] nums2 = {3, 5, 8, 2, 1, 9, 5, 7, 2, 1};
            double avg = findAdjustedAverage(nums2);
            System.out.print("Testing findAdjustedAverage: ");
            if (avg == 42/9.0) {
                System.out.println("Works");
            }
            else {
                System.out.println("Has an error");
            }
      */

      /*
        // testing verifyIncreasing
            int[] numsInc = {2, 5, 6, 8, 9, 11, 14, 18, 22};
            int[] notInc = {2, 2, 4, 5, 6, 7, 8};
            int[] notInc2 = {2, 5, 1, 3, 7, 8, 9};
            boolean test1 = verifyIncreasing(numsInc);
            boolean test2 = verifyIncreasing(notInc);
            boolean test3 = verifyIncreasing(notInc2);
            System.out.print("Testing verifyIncreasing: ");
            if (test1 && !test2 && !test3) {
                System.out.println("Works");
            }
            else {
                System.out.println("Has an error");
            }

       */

        /*
        // testing shiftSpots
            String[] orig = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
            shiftSpots(orig);
            System.out.println("Array should be: Fri Mon Tues Wed Thurs");
            System.out.print("Array updated:   ");
            for (String s: orig) {
                System.out.print(s + " ");
            }
         */


        /*
        // testing hasUniqueValues
            int[] unique = {4, -2, 5, -1, 6, 9, 12};
            int[] notUnique = {5, 6, 7, 2, 3, 4, 5, 9};
            boolean test4 = hasUniqueValues(unique);
            boolean test5 = hasUniqueValues(notUnique);
            System.out.print("\nTesting hasUniqueValues: ");
            if (test4 && !test5) {
                System.out.println("Works");
            }
            else {
                System.out.println("Has an error");
            }
         */

        /*
        // testing findFirstName
            String[] names = {"Holly", "Samantha", "Sammy", "Nicole"};
            int locSam = findFirstName(names, "Sam");   // 1
            int locNic = findFirstName(names, "nic");   // 3
            int locDen = findFirstName(names, "Den");   // -1
            System.out.print("\nTesting findFirstName: ");

            if (locSam == 1 && locNic == 3 && locDen == -1) {
                System.out.println("Works");
            }
            else {
                System.out.println("Has an error");
            }
        */
        }

        /**
         * Create a method called findMinLocation that takes in an array of int
         * values and returns the index of the smallest value within the array.
         * The array can contain both positive and negative values. If the smallest
         * value occurs more than once, then you may return any index for that value.
         */
        public static int findMinLocation(int[] arr){
            int smallestIndex = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < arr[smallestIndex]){
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        }

        /**
         * Create a method called find adjustedAverage. This method will find
         * the average of ALL values EXCEPT for the smallest value within the array.
         * Your solution must call findMinLocation. This means if your array has 10
         * values, you will find the average of the top 9 values, excluding the smallest.
         */
        public static int findAdjustedAverage(int[] arr){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                if (i != findMinLocation(arr)) {
                    sum += arr[i];
                }
            }
            return sum/(arr.length - 1);
        }

        /**
         * Create a method called verifyIncreasing that takes in an array
         * of int values and verifies that every value in the array is
         * strictly greater than the value before it. If this is true, then
         * the method returns true, otherwise it returns false.
         */
        public static boolean verifyIncreasing(int[] arr){
            boolean increasing = true;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] <= arr[i - 1]){
                    increasing = false;
                }
            }
            return increasing;
        }
        /**
         * Create a method called shiftSpots that takes in an array of String
         * values and updates this array so that each value is shifted one
         * spot to the right. The value at the of the array is moved to the
         * first position. This method returns nothing.
         */

        /**
         * Create a method called hasUniqueValues that takes in an array of int
         * values and returns true if each value in the array is unique and false
         * if any values are repeated.
         */

        /**
         * Create a method called findFirstName that takes in an array of String
         * values and a String to search for. This method will return the index
         * of the first occurrence of this String within any entries in the array.
         * Capitalization doesn't matter. If the String isn't found, return -1.
         */

}
