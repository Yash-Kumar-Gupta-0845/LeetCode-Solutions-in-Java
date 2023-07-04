class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(e.getValue()!=3) return e.getKey();
        }

        return -1;

    }
}