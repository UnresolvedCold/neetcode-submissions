class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // brute force 

        // a b c d e f g h
        // [a]
        //  b c d e f g h

        // [b]
        // c d e f g h

        // [c]
        // d e f g h

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] > target) break;

                if (numbers[i] + numbers[j] == target) {
                    return new int [] {i+1, j+1};
                }
            }
        }

        return null;

    }
}
