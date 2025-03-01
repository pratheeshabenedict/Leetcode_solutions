class Solution {
    public int[] applyOperations(int[] nums) {
        //comparison
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1] && nums[i]!=0){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        //shifting [swapping]
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        return nums;
    }
}
