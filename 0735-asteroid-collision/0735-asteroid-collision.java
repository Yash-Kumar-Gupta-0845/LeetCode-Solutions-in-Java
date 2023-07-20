class Solution {
    public int[] asteroidCollision(int[] a) {
         int top = -1;
        for (int x : a) {
            boolean stillAlive = true; 
            while (stillAlive && x < 0 && top >= 0 && a[top] > 0) {
                stillAlive = a[top] + x < 0;
                if (a[top] + x <= 0) top--; 
            }
            if (stillAlive) a[++top] = x; 
        }
        
        return Arrays.copyOf(a, top+1); 
    }
}