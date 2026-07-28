class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChar= s.toCharArray();
        char[] tChar= t.toCharArray();

        HashMap<Character, Integer> sCharCount=new HashMap<Character, Integer>();
        HashMap<Character, Integer> tCharCount=new HashMap<Character, Integer>();

        for(char i:sChar){
            if(sCharCount.containsKey(i)){
                sCharCount.put(i,sCharCount.get(i)+1);
            }
            else{
                sCharCount.put(i,1);
            }
        }
        for(char j:tChar){
            if(tCharCount.containsKey(j)){
                tCharCount.put(j,tCharCount.get(j)+1);
            }
            else{
                tCharCount.put(j,1);
            }
        }
        return sCharCount.equals(tCharCount);
    }
}

 