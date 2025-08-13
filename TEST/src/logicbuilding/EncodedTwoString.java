package logicbuilding;

public class EncodedTwoString {
    
    public static String[] splitWord(String word) {
        int len = word.length();
        int partSize = len / 3;
        int remainder = len % 3;

        String part1, part2, part3;

        if (remainder == 0) {
       
            part1 = word.substring(0, partSize);
            part2 = word.substring(partSize, 2 * partSize);
            part3 = word.substring(2 * partSize);
        } else {
            
            int part1Len = partSize;
            int part2Len = partSize + remainder; 
            part1 = word.substring(0, part1Len);
            part2 = word.substring(part1Len, part1Len + part2Len);
            part3 = word.substring(part1Len + part2Len);
        }

        return new String[] { part1, part2, part3 };
    }

    public static String generatePassword(String word1, String word2) {
        String[] w1 = splitWord(word1);
        String[] w2 = splitWord(word2);

        return w2[0] + w1[0] + w1[2] + w2[2];
    }

    public static void main(String[] args) {
        String input1 = "MACHINE";
        String input2 = "LEARNING";

        String password = generatePassword(input1, input2);
        System.out.println("Generated Password: " + password);
    }
}