class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anag = new HashMap<String,List<String>> ();
        
        for(String s: strs){
            char[] c= s.toCharArray(); //e a t
            Arrays.sort(c);   //a e t
            String key =new String(c);
            if(!anag.containsKey(key)){
                 anag.put(key,new ArrayList<String>());
            }
            anag.get(key).add(s);
        }
        return new ArrayList<>(anag.values());
    }
}
