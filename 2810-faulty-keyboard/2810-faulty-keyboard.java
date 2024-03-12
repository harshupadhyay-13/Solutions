class Solution {
    public String finalString(String s) {
        char[] str = s.toCharArray();
        StringBuilder ans = new StringBuilder(s.length());
        
        for( int i =0;i<s.length(); i++){
            if(str[i] == 'i'){
                ans.reverse();
            }
            else{
                ans.append(str[i]);
            }
        }
        return new String(ans);
    }
}