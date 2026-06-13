class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
       Arrays.sort(nums);
        int i=1;
        int k=0;
        
        if(nums.length==0) return 0;
        int t=nums[0];
        while(i<nums.length){
            if(t+1==nums[i])
            {t=nums[i];
            count++;}
            if(nums[i]-t>1){
                t=nums[i];
                k=Math.max(k,count);
                count=0;
            }

            
            
                i++;
        }
        k=Math.max(k,count);
        return (k+1);















    }
}
