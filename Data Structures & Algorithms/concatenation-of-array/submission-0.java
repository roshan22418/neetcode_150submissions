class Solution {
    public int[] getConcatenation(int[] nums) {
        int numLength = nums.length;
        int ansLength = 2*numLength;
        int[] ans = new int[ansLength];
        for(int i = 0;i<ansLength;i++){
            if(i>=numLength){
                ans[i] = nums[i-numLength];
            }
            else{
                ans[i] = nums[i];
            }
        }
        return ans;

        
    }
}