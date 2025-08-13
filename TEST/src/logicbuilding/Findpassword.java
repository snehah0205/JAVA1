package logicbuilding;


public class Findpassword {

    public static boolean isStable(int num) {
        String str = String.valueOf(num);
        int[] freq = new int[10]; 

        for (char ch : str.toCharArray()) {
            freq[ch - '0']++;
        }

        int commonFreq = 0;
        for (int f : freq) {
            if (f != 0) {
                commonFreq = f;
                break;
            }
        }

        for (int f : freq) {
            if (f != 0 && f != commonFreq) {
                return false; 
            }
        }
        return true;
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int stableCount = 0, unstableCount = 0;

        int[] nums = {input1, input2, input3, input4, input5};

        for (int num : nums) {
            if (isStable(num)) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }

        return (unstableCount * 10) + stableCount;
    }

    public static void main(String[] args) {
        int password = findPassword(12, 1313, 122, 678, 898);
        System.out.println("Password: " + password); 
    }
}