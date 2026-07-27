class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res =true;
        int len=nums.length;

        Set<Integer> uniqueSet = Arrays.stream(nums)
                               .boxed()
                               .collect(Collectors.toSet());
        int uniqueSetSize = uniqueSet.size();
        if(len==uniqueSetSize){
            res=  false;
        }
        return res;

    }
}