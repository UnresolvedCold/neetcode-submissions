class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        if (n == 0 || n == 1) return n;

        int left = 0;
        int right = 0;
        int res = 0;
        Map<Character, Integer> hmap = new HashMap<>();

        while (right < n) {
            if (hmap.containsKey(s.charAt(right))) {
                left = Math.max(left, hmap.get(s.charAt(right))+1);
               // System.out.println("Moving left to "+left+" "+s.charAt(left)+" " +hmap.toString() );
            }

           // System.out.println("left:" + left + " right: "+right);
            hmap.put(s.charAt(right), right);
           // System.out.println(hmap);

            res = Math.max(res, right - left + 1);
           //  System.out.println("Pointers "+s.charAt(left)+" "+s.charAt(right) + " "+res);
            right ++;
        }

        return res;

    }
}
