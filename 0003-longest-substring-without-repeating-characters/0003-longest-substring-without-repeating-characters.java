class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l = 0;
        int longest = 0;
        HashSet<Character> h = new HashSet<>();

        int n = s.length();

        for(int r=0;r < n ; r++)
        {
            while (h.contains(s.charAt(r)))
            {
                h.remove(s.charAt(l));
                l++;

                

               
            }
            int w = (r-l)+1;
                longest = longest > w ? longest : w ;
                h.add(s.charAt(r));
        }
        return longest ;
    }
}