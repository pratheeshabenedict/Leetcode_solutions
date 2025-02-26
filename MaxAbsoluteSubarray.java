class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int n=nums.length;
       int minEndingHere=nums[0];
       int maxEndingHere = nums[0];
       int minsoFar=nums[0];
       int maxsoFar=nums[0];
       for(int i=1;i<n;i++){
        minEndingHere = Math.min(nums[i],minEndingHere+nums[i]);
        maxEndingHere = Math.max(nums[i],maxEndingHere+nums[i]);
        maxsoFar=Math.max(maxsoFar,maxEndingHere);
        minsoFar =Math.min(minsoFar,minEndingHere);
       } 
       return Math.max(Math.abs(maxsoFar),Math.abs(minsoFar));
    }
}
//maximum sum is always follows kadane appraoch
//as this is absolute then we can take both the minending and maxending 
//should take max of these two
//as this is focus on absolute maximum sum aubarray
//not just max sum array
//so need to track of maxsum ,minsum
//and take max of this two
