class Solution {
    public double myPow(double x, int n) {
        /*if (n==0)
            return 1;
        if ( n % 2 == 0)
            return myPow(x*x,n/2);
        if (n % 2 != 0)
            return x*myPow(x*x,n/2);
        if (n<0)
            return (double)(1.0)/(double)()*/
        double ans =1.0;
        long num=n;
        if(n<0)
        {
            num =-1*num;
        }
        while(num>0)
        {
            if(num%2==0)
            {
                x=x*x;
                num=num/2;
            }
            else
            {
                ans=ans*x;
                num=num-1;
            }
        }
        if(n<0)
        {
            return (double)(1.0)/(double)(ans);
        }
        return ans;
    }
}
