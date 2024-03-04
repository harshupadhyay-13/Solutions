class Solution {
    public boolean isPalindrome(String s) {
        String fixedString = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)|| Character.isLetter(c)){
                fixedString += c;
            }
        }        
        fixedString = fixedString.toLowerCase();
        int frontPointer =0, backPointer=fixedString.length()-1;
        
        while(frontPointer <= backPointer){
            if(fixedString.charAt(frontPointer) != fixedString.charAt(backPointer)){
                return false;
            }
            frontPointer++;
            backPointer--;
        }
        return true;
    }
}