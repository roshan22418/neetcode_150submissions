class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // [1,2,3,4] target = 3
        int i = 0;
        int j = numbers.length -1;
        // int[] ans;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1, j+1}; 
            }
            else if(numbers[j] + numbers[i]>=target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
        
    }
}
