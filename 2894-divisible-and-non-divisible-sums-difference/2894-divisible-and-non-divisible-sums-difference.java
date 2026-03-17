class Solution {
    public int differenceOfSums(int n, int m) {
        int x = n / m;
        int num2= m * x * (x+1) / 2;
        int num1 = n * (n+1) / 2 - num2;
        return num1 - num2;
    }
}