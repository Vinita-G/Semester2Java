package Unit4B.Notes;
import java.util.ArrayList;
/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Notes_7_4_Examples {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

        // everything commented out is what i used to test my code

//        ArrayList<String> repeatNames = new ArrayList<>();
//        repeatNames.add("Mya");
//        repeatNames.add("John");
//        repeatNames.add("Kim");
//        repeatNames.add("Sanjana");
//        repeatNames.add("Adi");
//        repeatNames.add("Mya");

//        System.out.println("findMin:");
//        System.out.println(findMin(numsRepeats));
//        System.out.println("**should be: 1");
//
//        System.out.println();
//        System.out.println("findMax");
//        System.out.println(findMax(numsRepeats));
//        System.out.println("**should be: 8");
//
//        System.out.println();
//        System.out.println("findMin");
//        System.out.println(findMin(numsNoRepeats));
//        System.out.println("**should be: 1");
//
//        System.out.println();
//        System.out.println("findMax");
//        System.out.println(findMax(numsNoRepeats));
//        System.out.println("**should be: 9");
//
//        System.out.println();
//        System.out.println("findSum");
//        System.out.println(findSum(numsNoRepeats));
//        System.out.println("**should be: 28");
//
//        System.out.println();
//        System.out.println("findSum");
//        System.out.println(findSum(numsRepeats));
//        System.out.println("**should be: 24");
//
//        System.out.println();
//        System.out.println("findAverage");
//        System.out.println(findAverage(numsRepeats));
//        System.out.println("**should be: 4");
//
//        System.out.println();
//        System.out.println("isIncreasing");
//        System.out.println(isIncreasing(numsNoRepeats));
//        System.out.println("**should be: false");
//
//        System.out.println();
//        System.out.println("isIncreasing");
//        System.out.println(isIncreasing(orderedNums));
//        System.out.println("**should be: true");
//
//        System.out.println();
//        System.out.println("hasDuplicates");
//        System.out.println(hasDuplicates(names));
//        System.out.println("**should be: false");
//
//        System.out.println();
//        System.out.println("hasDuplicates");
//        System.out.println(hasDuplicates(repeatNames));
//        System.out.println("**should be: true");
//
//        System.out.println();
//        System.out.println("revArrayList");
//        ArrayList<String> display = revArrayList(names);
//        System.out.print("[ ");
//        for(String a: display){
//            System.out.print(a + ", ");
//        }
//        System.out.println("]");
//        System.out.println("**should be: [ Noah, Adi, Sanjana, Kim, John, Mya ]");
//
//        System.out.println();
//        System.out.println("shiftLeft");
//        shiftLeft(names);
//        System.out.print("[ ");
//        for(String a: names){
//            System.out.print(a + ", ");
//        }
//        System.out.println("]");
//        System.out.println("**should be: [ John, Kim, Sanjana, Adi, Noah, Mya ]");
//
    }

    /**
     * Finds the smallest value in the ArrayList
     *
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < smallest){
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    /**
     * Finds the largest value in the ArrayList
     *
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int largest = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > largest){
                largest = list.get(i);
            }
        }
        return largest;

    }

    /**
     * Finds the sum of all values in the ArrayList
     *
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int a: list){
            sum += a;
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     *
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        return (double)(findSum(list))/list.size();
    }

    /**
     * Determines if all values are in increasing order
     *
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) > list.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     *
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(j != i && list.get(i).equals(list.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     *
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> newArr = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            newArr.add(list.get(i));
        }
        return newArr;
    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     *
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
        String first = list.get(0);
        list.remove(0);
        list.add(first);
    }
}
