package Assignment;
import java.util.Scanner;
public class RotateMatrix90 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the matrix (n x n): ");
	        int n = sc.nextInt();

	        int[][] matrix = new int[n][n];

	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        rotate(matrix, n);

	        System.out.println("Matrix after 90-degree clockwise rotation:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }

	    public static void rotate(int[][] matrix, int n) {
	       
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            int left = 0, right = n - 1;
	            while (left < right) {
	                int temp = matrix[i][left];
	                matrix[i][left] = matrix[i][right];
	                matrix[i][right] = temp;
	                left++;
	                right--;
	            }
	        }
	    }
	}