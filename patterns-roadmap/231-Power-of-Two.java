class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        return findOnes(n, 0) == 1;
    }

    int findOnes(int n, int ones) {
        if (n == 0)
            return ones;

        ones += n % 2;

        if (ones > 1)
            return ones;

        return findOnes(n / 2, ones);
    }
}