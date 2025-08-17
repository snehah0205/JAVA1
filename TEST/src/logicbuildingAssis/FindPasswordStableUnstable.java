package logicbuildingAssis;
import java.util.*;

public class FindPasswordStableUnstable{

    public static boolean isStable(int num) {
        String s = String.valueOf(num);
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int first = -1;
        for (int f : freq.values()) {
            if (first == -1) {
                first = f;
            } else if (f != first) {
                return false;
            }
        }
        return true;
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] arr = {input1, input2, input3, input4, input5};
        int sum = 0;

        for (int num : arr) {
            if (isStable(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();

        int password = findPassword(input1, input2, input3, input4, input5);
        System.out.println("Password = " + password);

        sc.close();
    }
}