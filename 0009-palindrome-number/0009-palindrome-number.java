class Solution {
    public boolean isPalindrome(int x) {
        int ans=0, temp=x;
        while(temp!=0){
            int digit = temp %10 ;
            ans = ans*10 + digit;
            temp=temp/10;
        }
        if(x==ans && x>=0){
            return true;
        }
        else
            return false;
    }
}