import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ansList.add(i);
                    ansList.add(j);
                    // Since there's only one valid solution, we can return here
                    return ansList.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        // No solution found, return an empty array
        return new int[0];
    }
}
