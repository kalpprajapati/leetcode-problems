class Solution3 {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            xor2 ^= nums[i]; //3^0^1
            xor1 ^= (i+1); // 0^1^2^3
        }
        

        return xor1 ^ xor2; // 2
    }
}