class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // brute force 

        // a b c d e f g h
        // a + h > target ==> may be a + g == target
        // a + g < target ==> maybe b + g == target 

       int l = 0;
       int r = numbers.length - 1;

       while (numbers[l] + numbers[r] != target) {
         while (numbers[l] + numbers[r] > target) {
            r--;
         }

         while (numbers[l] + numbers[r] < target) {
            l++;
         }
       }

        return new int[] {l+1, r+1};

    }
}
