package logicbuilding;


import java.util.Scanner;

public class AlernateAddsum {

    public static int AddSub(int N, int opt) {
        int result = 0;
        boolean add = true;

        if (opt == 1) {
            
            for (int i = N; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
                add = !add; 
            }
        } 
        else if (opt == 2) {
           
            add = true; 
            for (int i = N; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
                add = !add; // flip sign
            }
            result = (N * (N + 1) / 2) - (result - N); 
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print("Enter option (1 or 2): ");
        int opt = sc.nextInt();

        int res = AddSub(N, opt);
        System.out.println("Result = " + res);

        sc.close();
    }
}