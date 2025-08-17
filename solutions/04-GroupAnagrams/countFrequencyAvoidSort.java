import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            // Count letters
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Build a key from counts (e.g. "1#0#0#1#0...")
            StringBuilder keyBuilder = new StringBuilder();
            for (int num : count) {
                keyBuilder.append(num).append('#');
            }
            String key = keyBuilder.toString();

            // Add word to the correct group
            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}