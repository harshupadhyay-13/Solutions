import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement) + 1, i + 1 };
            } 
            map.put(numbers[i], i);
        }
        
        // Return statement added to handle cases where no solution is found
        return new int[] { -1, -1 }; // This line can be modified based on your requirements
    }
}
