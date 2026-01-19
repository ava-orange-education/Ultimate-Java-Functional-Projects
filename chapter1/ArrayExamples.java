import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        // ----- Defining and Initializing Arrays -----

        // 1D array: declaration with size
        int[] numbers = new int[5];
        // 1D array: declaration with initialization
        int[] initializedNumbers = {1, 2, 3, 4, 5};

        // Accessing first element (index 0)
        System.out.println("numbers[0] = " + numbers[0]);          // default 0
        System.out.println("initializedNumbers[0] = " + initializedNumbers[0]); // 1

        // 2D array: declaration with size
        int[][] matrix = new int[3][3];
        // 2D array: declaration with initialization
        int[][] predefinedMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing an element from 2D array
        System.out.println("predefinedMatrix[0][1] = " + predefinedMatrix[0][1]); // 2

        // ----- Common Array Operations -----

        int[] opsArray = {1, 2, 3, 4, 5};

        // Accessing and modifying elements
        opsArray[2] = 10; // set third element to 10
        System.out.println("After modification opsArray[2] = " + opsArray[2]);

        // Iterating over array with classic for loop
        System.out.println("Iterating with for loop:");
        for (int i = 0; i < opsArray.length; i++) {
            System.out.println(opsArray[i]);
        }

        // Iterating with enhanced for loop
        System.out.println("Iterating with enhanced for-each loop:");
        for (int number : opsArray) {
            System.out.println(number);
        }

        // Array length
        System.out.println("opsArray length = " + opsArray.length); // 5

        // ----- Common Array Algorithms -----

        int[] algoArray = {1, 3, 5, 2, 4};

        // Searching: linear search for target
        int target = 3;
        for (int i = 0; i < algoArray.length; i++) {
            if (algoArray[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }

        // Sorting using Arrays.sort()
        Arrays.sort(algoArray); // sorts ascending
        System.out.println("Sorted algoArray: " + Arrays.toString(algoArray));

        // Merging two arrays into a larger one
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
