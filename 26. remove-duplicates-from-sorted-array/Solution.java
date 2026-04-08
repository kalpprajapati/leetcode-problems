class Solution {
    // Function to remove duplicates from sorted array in-place
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
