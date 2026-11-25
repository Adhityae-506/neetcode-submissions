class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        int ctr = 0;
        int num1 = 0, num2 = 0;
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else{
                break;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
