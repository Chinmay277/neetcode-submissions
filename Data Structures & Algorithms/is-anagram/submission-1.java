class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Hashtable<Character, Integer> sCharFreq = new Hashtable<>();
        Hashtable<Character, Integer> tCharFreq = new Hashtable<>();

        for(int i=0;i<s.length();i++){
            if(sCharFreq.containsKey(s.charAt(i))){
                sCharFreq.put(s.charAt(i), sCharFreq.get(s.charAt(i))+1);
            }
            else{
                sCharFreq.put(s.charAt(i), 1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(tCharFreq.containsKey(t.charAt(i))){
                tCharFreq.put(t.charAt(i), tCharFreq.get(t.charAt(i))+1);
            }
            else{
                tCharFreq.put(t.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : sCharFreq.entrySet()){
            System.out.println(entry.getKey()+"   "+ entry.getValue());
            if(tCharFreq.containsKey(entry.getKey()))
            {
                System.out.println(entry.getKey()+"   "+ entry.getValue());
                System.out.println(tCharFreq.get(entry.getKey()) + "  " + entry.getValue());
                if(!tCharFreq.get(entry.getKey()).equals(entry.getValue())){
                return false;
                }
            }
            else{
                return false;
            }
            
        }
        return true;

    }
}
