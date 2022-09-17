class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[n+m];
        int k=0;
        int i=0;int j=0;
        while(i<m && j <n)
        {
            if(nums1[i]<nums2[j])
                arr[k++]=nums1[i++];
            else
                arr[k++]=nums2[j++];
            
        }
        while(i<m)
        {
            arr[k++]=nums1[i++];
        }
        while(j<n)
        {
            arr[k++]=nums2[j++];
        }
        for(int p=0;p<arr.length;p++)
        {
            nums1[p]=arr[p];
        }
        
       
        // for ( int i = 0 ;i<n ;i++){
        //     nums1[m++]=nums2[i];
        //     // if(i<m)
        //     //     nums1[k++] = nums1[i]; 
        //     // else
        //     //     nums1[k++]=nums2[i-m];
        // }
        // // for (int i =0; i< n ; i++){
        //     nums1[k++] = nums2[i];
        // }
       // Arrays.sort(nums1);
    }
}