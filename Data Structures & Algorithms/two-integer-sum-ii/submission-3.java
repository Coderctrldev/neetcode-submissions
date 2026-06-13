class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] result=new int[2];
        while(i<numbers.length && j<numbers.length){
            int sum = numbers[i]+numbers[j];
            if(sum<target){
                i++;

            }
            if(sum>target){
               j--;
            }
            if(sum==target){
            result[0]=Math.min(i+1,j+1);
            result[1]=Math.max(i+1,j+1);
            break;}
        }
        return result;
    }
}
