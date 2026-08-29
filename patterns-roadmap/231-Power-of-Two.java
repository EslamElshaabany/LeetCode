class Solution {
    public boolean isPowerOfTwo(int n) {

        int foundBefore = 0, found = 0;

        while (n > 0) {
            foundBefore = found == 1 ? found : foundBefore;
            int mod = n % 2;
            found = mod == 1 ? mod : found;
            n = n / 2;
        }

        if (found != 0 && foundBefore == 0) return true;
        return false;

    }

}