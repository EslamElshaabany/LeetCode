class Solution {

    Map<Integer, Integer> fibMap = new HashMap<>();

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int fib_1 = fibMap.containsKey(n-1) ? fibMap.get(n-1) : fib(n-1);
        int fib_2 = fibMap.containsKey(n-2) ? fibMap.get(n-2) : fib(n-2);

        fibMap.put(n-1, fib_1);
        fibMap.put(n-2, fib_2);

        return fib_1 + fib_2;
    }
}