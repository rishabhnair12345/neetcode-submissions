class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> getFreq=new HashMap<Integer,Integer>();
        ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];

        for(int i:nums){
            getFreq.put(i,getFreq.getOrDefault(i,0)+1);
            
        }
       
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> ent: getFreq.entrySet()){
            int key = ent.getKey();
            int freq= ent.getValue();

            bucket[freq].add(key);
        }
        int res[]=new int[k];
        int index =0;
        for(int j =bucket.length-1;j>=1;j--){
            for(int i : bucket[j]){
                res[index++]=i;

                if(index==k){
                    return res;
                }
            }
        }
        return res;

        
        
    }
}
