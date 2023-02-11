import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanNumeric = new HashMap<>();
        romanNumeric.put('I', 1);
        romanNumeric.put('V', 5);
        romanNumeric.put('X', 10);
        romanNumeric.put('L', 50);
        romanNumeric.put('C', 100);
        romanNumeric.put('D', 500);
        romanNumeric.put('M', 1000);

        int previousNumeral = 0;
        int currentNumeral = 0;
        for (int i = 0; i < s.length(); i++) {
            currentNumeral = romanNumeric.get(s.charAt(s.length() -1 -i));
            result += currentNumeral < previousNumeral ? -currentNumeral : currentNumeral;
            previousNumeral = currentNumeral;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
