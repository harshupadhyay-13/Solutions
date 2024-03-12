class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // Ensure right index does not exceed the length of the string
            
            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        /*
        Dry Run:
Input: s = "abcdefg", k = 2

1. Initialize the character array ch = ['a', 'b', 'c', 'd', 'e', 'f', 'g'].
2. Set n = 7 (length of ch).
3. Iterate over the string with a step size of 2k:
   a. For the first iteration (i = 0), left = 0, and right = min(0 + 2 - 1, 7 - 1) = min(1, 6) = 1.
      - Reverse the substring ch[0:1] = ['a', 'b'] to get ['b', 'a'].
   b. For the second iteration (i = 2), left = 2, and right = min(2 + 2 - 1, 7 - 1) = min(3, 6) = 3.
      - Reverse the substring ch[2:3] = ['c', 'd'] to get ['c', 'd'] (as there are only 2 characters left).
   c. For the third iteration (i = 4), left = 4, and right = min(4 + 2 - 1, 7 - 1) = min(5, 6) = 5.
      - Reverse the substring ch[4:5] = ['e', 'f'] to get ['f', 'e'].
   d. No more iterations as i = 6 exceeds the length of the string.

Output: "bacdfeg"
        */
        return new String(ch);
    }
}
