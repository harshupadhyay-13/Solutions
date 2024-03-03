class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occurence = new HashMap();
        for(int num: arr){
            num_occurence.put(num, num_occurence.getOrDefault(num,0) +1);
        }
        HashSet<Integer> unique_vals =new HashSet(num_occurence.values());
        return num_occurence.size() == unique_vals.size();
    }
}