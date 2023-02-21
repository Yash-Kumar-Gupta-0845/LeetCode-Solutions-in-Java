class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String nonCharacter = str.replaceAll("([^a-z0-9])","");
        String rev = "";
        for (int i = nonCharacter.length()-1; i >= 0 ;i--){
            rev+=nonCharacter.charAt(i);
        }
        if (nonCharacter.equals(rev))
            return true;
        else
            return false;
    }
    // public boolean isPalindrom(String s){
    //     String Character = "";
    //     int left = 0;
    //      int right = s.length()-1;
    //     while (left <= right){
    //         if (! Character.isLetterOrDigit(s.charAt(left)))
    //             left++;
    //         else if (! Character.isLetterOrDigit(s.charAt(left)))
    //             right--;
    //         else{
    //             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
    //                 return false;
    //                 break;
    //             }
    //              left++;
    //              right--;
    //         }
    //     }
    //     return true;
    // }
}