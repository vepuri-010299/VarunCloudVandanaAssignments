import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral from left to right
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // If the current numeral is smaller than the next numeral, subtract its value
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add its value to the result
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
    public static void main(String[] args) {
        // Test the romanToInt function
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Roman Number: ");
        String romanNumeral = input.nextLine();
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerEquivalent);
    }
}