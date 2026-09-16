class Solution {
    public int reverse(int x) {
        int rem; long rev = 0, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        while (x != 0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (rev < min || rev > max) {
            return 0;
        }
        else {
            return (int) rev;
        }     
    }
}