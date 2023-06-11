class SnapshotArray {

    int s_id = 0;
    HashMap<Integer, Integer> hm[];

    public SnapshotArray(int length) {
        hm = new HashMap[length];
        for(int i = 0 ; i < length ; i++){
            hm[i] = new HashMap<>();
        }
    }
    
    public void set(int index, int val) {
        hm[index].put(s_id, val);
    }
    
    public int snap() {
        s_id++;
        return s_id-1;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id >= 0 && !hm[index].containsKey(snap_id)){
            snap_id--;
            if(snap_id == -1){
                return 0;
            }
        }
        return hm[index].get(snap_id);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */