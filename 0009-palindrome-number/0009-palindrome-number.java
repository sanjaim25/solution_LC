class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a=x;
        int rev=0;
        while(x>0){
            int b=x%10;
            rev=rev*10+b;
            x/=10;
        }
       
        return rev==a;
       }
    }
