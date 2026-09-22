import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        int max_length = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                max_length += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        
        if (!set.isEmpty()) {
            max_length += 1;
        }
        
        return max_length;
    }
}
