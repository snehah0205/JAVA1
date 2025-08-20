package Assignment;
import java.util.Scanner;
public class TrappingRainWaterBetweenHeights {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of bars: ");
	        int n = sc.nextInt();

	        int[] height = new int[n];
	        System.out.println("Enter the heights of the bars:");
	        for (int i = 0; i < n; i++) {
	            height[i] = sc.nextInt();
	        }

	        int trappedWater = calculateWater(height, n);
	        System.out.println("Total trapped water: " + trappedWater);

	        sc.close();
	    }

	    public static int calculateWater(int[] height, int n) {
	        if (n <= 2) return 0; 

	        int left = 0, right = n - 1;
	        int leftMax = 0, rightMax = 0;
	        int water = 0;

	        while (left < right) {
	            if (height[left] < height[right]) {
	                if (height[left] >= leftMax) {
	                    leftMax = height[left];
	                } else {
	                    water += leftMax - height[left];
	                }
	                left++;
	            } else {
	                if (height[right] >= rightMax) {
	                    rightMax = height[right];
	                } else {
	                    water += rightMax - height[right];
	                }
	                right--;
	            }
	        }
	        return water;
	    }
	}
