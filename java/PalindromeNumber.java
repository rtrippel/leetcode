import java.util.Objects;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        return Objects.equals(String.valueOf(x), stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        int x = 121;
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(x));
    }
}
