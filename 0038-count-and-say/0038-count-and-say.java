class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=2;i<=n;i++)
            result = findSequence(result);
        return result; 
    }
    private String findSequence(String input)
    {
        String answer="";
        int count=1;
        char current=input.charAt(0);
        for(int i=1;i<input.length();i++)
        {
            if(current==input.charAt(i))
                count++;
            else
            {
                answer = answer + count + current;
                current=input.charAt(i);
                count=1;
            }
        }
        answer = answer + count + current;
        return answer;
    }
}