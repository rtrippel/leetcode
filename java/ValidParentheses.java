import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            Character secondChar = returnSecondParentheses(currentChar);
            int lastIndex = list.size() -1;
            if (secondChar == ' ') {
                list.add(currentChar);
            } else if (lastIndex < 0 || list.get(lastIndex) != secondChar) {
                return false;
            } else list.remove(lastIndex);
        }

        return list.size() == 0;
    }

    private Character returnSecondParentheses(Character character){
        return switch (character) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> ' ';
        };
    }
}
