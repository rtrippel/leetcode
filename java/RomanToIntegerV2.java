public class RomanToIntegerV2 {

    public int romanToInt(String s) {
        int result = 0;
        int currentNum = 0;
        int previousNum = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length() ; i++) {

            switch (chars[s.length() -1 -i]) {
                case 'I': currentNum = 1;
                    break;
                case 'V': currentNum = 5;
                    break;
                case 'X': currentNum = 10;
                    break;
                case 'L': currentNum = 50;
                    break;
                case 'C': currentNum = 100;
                    break;
                case 'D': currentNum = 500;
                    break;
                case 'M': currentNum = 1000;
                    break;
            }
            result += currentNum < previousNum ? - currentNum : currentNum;
            previousNum = currentNum;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToIntegerV2 romanToInteger = new RomanToIntegerV2();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
