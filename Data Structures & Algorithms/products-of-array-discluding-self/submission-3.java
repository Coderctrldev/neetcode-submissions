class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] result=new int[nums.length];
     int product=1;
     for(int i=0;i<nums.length;i++){
    
            product*=nums[i];
     }   
     for(int j=0;j<nums.length;j++){
        if(nums[j]!=0){
        result[j]=(product/nums[j]);
     }
     if(nums[j]==0){
        int exception=1;
        for(int k=0;k<nums.length;k++){
            
            if(k!=j)exception*=nums[k];
        }
        result[j]=exception;
     }
     }
     return result;
    }
}  
