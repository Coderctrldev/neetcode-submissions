class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result= new int[2];
        
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                  result[0]=Math.min(i+1,j+1);
                  result[1]=Math.max(i+1,j+1);
                }
            }
        }
        return result;
    }
}
