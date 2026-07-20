class Solution {
    public boolean isPalindrome(String str) {
        int s = 0; 
        int e = str.length()-1;

        while (s < e) {

            int l = convert(str.charAt(s));
            int r = convert(str.charAt(e));

            //System.out.println(str.charAt(s) + ":" + l);
            //System.out.println(str.charAt(e) + ":" + r);

            if (l == -1) {
                s++;
                continue;
            }

            if (r == -1) {
                e--;
                continue;
            }

            if (l!=r) return false;

            e--; s++;
        }

        return true;
    }

    public int convert(char a) {
        if (a-'a' >= 0 && a-'a' < 26) return a-'a';
        if (a-'A' >= 0 && a-'A' < 26) return a-'A';
        if (a-'0' >= 0 && a-'0' < 10) return 100 + a-'0';
        return -1;
    }
}
