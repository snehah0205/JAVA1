package logicbuilding;


class Result {
 int output1; 
 int output2; 

 public Result(int output1, int output2) {
     this.output1 = output1;
     this.output2 = output2;
 }
}

public class Decreasingsequence {
 public Result decreasingSeq(int[] input1, int input2) {
     int output1 = 0; 
     int output2 = 0; 

     if (input1 == null || input2 <= 0) {
         return new Result(0, 0);
     }

     int currentSequenceLength = 1;
     boolean inSequence = false;

     for (int i = 1; i < input2; i++) {
         if (input1[i] < input1[i - 1]) {
             currentSequenceLength++;
             if (!inSequence) {
                 output1++;
                 inSequence = true;
             }
         } else {
             if (inSequence) {
                 output2 = Math.max(output2, currentSequenceLength);
             }
             currentSequenceLength = 1;
             inSequence = false;
         }
     }

     if (inSequence) {
         output2 = Math.max(output2, currentSequenceLength);
     }

     return new Result(output1, output2);
 }

 public static void main(String[] args) {
     Decreasingsequence ds = new Decreasingsequence();
     int[] arr = {9, 7, 5, 8, 6, 4, 3};
     Result res = ds.decreasingSeq(arr, arr.length);
     System.out.println("Number of decreasing sequences: " + res.output1);
     System.out.println("Length of longest decreasing sequence: " + res.output2);
 }
}