class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> count=new HashMap<>();
    /*
     for(int num: nums){
        count.put(num,count.getOrDefault(num,0)+1);
     }
    List<int[]> arr=new ArrayList<>();
    for(Map.Entry<Integer, Integer> entry: count.entrySet()){
        arr.add(new int[] {entry.getValue(), entry.getKey()});

    }
    arr.sort((a,b)->b[0]-a[0]);

    int[] res=new int[k];
    for(int i=0;i<k;i++){
        res[i]=arr.get(i)[1];
    }
     return res;*/

     for(int num:nums){
        count.put(num,count.getOrDefault(num,0)+1);
     }
    
     List<Map.Entry<Integer,Integer>>list= new ArrayList<>(count.entrySet());
     list.sort((a,b)->b.getValue()-a.getValue());
    
    int[] result=new int[k];
     for(int o=0;o<k;o++){
       result[o]=list.get(o).getKey();
     }
     return result;
    }
}
