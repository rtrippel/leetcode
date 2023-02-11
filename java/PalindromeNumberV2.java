public class PalindromeNumberV2 {
    public boolean isPalindrome(int x) {
        int copy = x;
        int revers = 0;
        if (x >= 0) {
            while (x != 0) {
                revers = revers*10 + x%10;
                x = x/10;
            }
        }

        return revers == copy;
    }

    public static void main(String[] args) {
        int x = 121;
        PalindromeNumberV2 palindromeNumber = new PalindromeNumberV2();
        System.out.println(palindromeNumber.isPalindrome(x));
    }
}
