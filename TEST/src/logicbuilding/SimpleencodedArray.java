package logicbuilding;

public class SimpleencodedArray {

    public static void findOriginalFirstAndSum(int[] input1, int input2) {
        int[] original = new int[input2];

        original[input2 - 1] = input1[input2 - 1];

        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = original[i + 1] - input1[i];
        }

        int sum = 0;
        for (int num : original) {
            sum += num;
        }

        System.out.println("First Number in Original Array: " + original[0]);
        System.out.println("Sum of All Numbers in Original Array: " + sum);
    }

    public static void main(String[] args) {
       
        int[] encodedArray = {3, -4, 6, 2, -6, 3};
        int size = encodedArray.length;

        findOriginalFirstAndSum(encodedArray, size);
    }
}