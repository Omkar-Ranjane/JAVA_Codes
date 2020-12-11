import java.util.Scanner;

public class StringOccurance {
    
    private static char getMaxOccurance(String inputString) {
        char[] charcterString = inputString.toCharArray();
        int[] frequency = new int[26];
        int maxFrequency = -1;
        char maxOccuredChar = ' ';

        // get frequency of each character of inputString
        for (int i = 0; i < inputString.length(); i++) {
            if (charcterString[i] != ' ') {
                frequency[charcterString[i] - 'a']++;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if (maxFrequency < frequency[i]){
                maxFrequency = frequency[i];
                maxOccuredChar = (char) (i + 'a');
            }
        }

        return maxOccuredChar;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String inputString = sc.nextLine();

        System.out.println(getMaxOccurance(inputString));

        sc.close();
    }
}
