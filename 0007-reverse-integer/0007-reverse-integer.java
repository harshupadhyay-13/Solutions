class Solution {
    public int reverse(int x) {
    int reverse = 0;
    boolean f=false;
        if(x<0){
            x=Math.abs(x);
            f=true;
        }
        while(x>0){
            int lastDigit = x%10;
            
            x /= 10;
            
            if(reverse>Integer.MAX_VALUE/10 || reverse== Integer.MAX_VALUE/10 && lastDigit>7)
                return 0;
            if(reverse<Integer.MIN_VALUE/10 || reverse== Integer.MIN_VALUE/10 && lastDigit<-8)
                return 0;
            
            reverse = reverse*10+lastDigit;
        }
        if(f==true){
            reverse = 0-reverse;
            return reverse;
        }
        else
        return reverse;
    }
}
