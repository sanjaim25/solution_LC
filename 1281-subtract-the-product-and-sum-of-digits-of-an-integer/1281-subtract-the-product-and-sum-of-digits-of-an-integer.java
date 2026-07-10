class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n!=0){
            int b=n%10;
            s+=b;
            p*=b;
            n/=10;
        }
        int ans =p-s;
        return ans;
    }
}