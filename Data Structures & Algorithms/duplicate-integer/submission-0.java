class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    visited[i] = true;
                    break;
                }
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==true){
                return true;
            }
        }
        return false;
    }
}