class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for(int num:nums){
            pq.add(num);
        }
        long sum =0;
        for(int i=0;i<k;i++){
            int t = pq.poll();
            sum+=(long)t;
            pq.add((t+2)/3);
        }
        return sum;
    }
}