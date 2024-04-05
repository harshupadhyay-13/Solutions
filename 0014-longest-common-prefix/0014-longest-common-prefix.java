class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            // Compare the character with the corresponding characters in the rest of the strings
            for (int j = 1; j < strs.length; j++) {
                // If the character doesn't match or if the current index is beyond the length of the current string
                // Return the substring from the first character to the current index
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If all strings have the same prefix, return the first string
        return strs[0];

    }
}