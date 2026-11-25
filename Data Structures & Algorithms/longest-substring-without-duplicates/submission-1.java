class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        // HashMap<Character, Integer> mpp = new HashMap<>();

        // for(right = 0; right < s.length(); right++){

        //     if(mpp.containsKey(s.charAt(right))){
        //         left = Math.max(left, mpp.get(s.charAt(right)) + 1);
        //     }
        //     mpp.put(s.charAt(right), right);
        //     maxLen = Math.max(maxLen, right - left + 1);
        // }

        HashSet<Character> result = new HashSet<>();

        for(right = 0; right < s.length(); right++){
            while(result.contains(s.charAt(right))){
                result.remove(s.charAt(left));
                left++;
            }
            result.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
