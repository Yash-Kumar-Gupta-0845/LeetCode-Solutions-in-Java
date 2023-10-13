class Solution {
    public String intToRoman(int num) {
        int arr[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String str[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder st = new StringBuilder();
        for (int i = 12 ; num > 0 ; i--){
            while(num >= arr[i]){
                st.append(str[i]);
                num-=arr[i];
            }
        }
        return st.toString();
    }
}