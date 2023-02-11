public class LongestCommonPrefixV2 {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() -1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs1 = {"dog","racecar","car"};
        String[] strs3 = {"ab", "a"};
        LongestCommonPrefixV2 longestCommonPrefix = new LongestCommonPrefixV2();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs3));
    }
}
