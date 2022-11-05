class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        int max=0;
        HashSet<Character> h = new HashSet();
        while(b< s.length())
        {
            if(!h.contains(s.charAt(b))){
                h.add(s.charAt(b));
                b++;
                max=Math.max(h.size(),max);
            }
            else
            {
                h.remove(s.charAt(a));
                a++;
            }
            
        }
        return max;
        
    }
}
