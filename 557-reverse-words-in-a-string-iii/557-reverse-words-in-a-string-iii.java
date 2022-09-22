class Solution {
    public String reverseWords(String s1) {
        String[] result = s1.split(" ");
        String  ans = "";

        for(String s : result) {
            char arr[] = s.toCharArray();
            int left=0;
            int right= s.length()-1;
            while(left<=right) {
                char temp =arr[left];
                arr[left] =  arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            ans += String.valueOf(arr) + " ";
        }

        return ans.trim();
    }
}