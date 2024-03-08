import java.lang.Math; 

class Solution {
    public boolean judgeSquareSum(int c) {
        boolean flag = false;
        for (int i = 0; i <= (int)Math.sqrt(c); i++) {
            int remaining = c - i * i;
            int root = (int)Math.sqrt(remaining);
            if (root * root == remaining) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
