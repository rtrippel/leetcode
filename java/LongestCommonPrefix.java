public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        int i = 0;
        char previousChar;
        char currentChar;

        try {
            while (true) {
                if (strs[0].length() < i) break;
                previousChar = strs[0].charAt(i);
                for (String str: strs) {
                    currentChar = str.charAt(i);
                    if (currentChar != previousChar) return strs[0].substring(0,i);
                }
                i++;
            }
        } catch (Exception e) {
            return strs[0].substring(0,i);
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dog","racecar","car"};
        String[] strs3 = {"ab", "a"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs3));
    }
}
