class Solution {
    public long getSum(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        long[]prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        long res=0;
        int l=0;
        int r=-1;
        int[]odd=new int[n];
        for(int i=0;i<n;i++){
            int k=1;
            if(i<=r){
                int mirror=l+r-i;
                k=Math.min(odd[mirror],r-i+1);
            }
            while(i-k>=0 && i+k<n && nums[i-k]==nums[i+k]){
                k++;
            }
            odd[i]=k;
            int left=i-k+1;
            int right=i+k-1;
            long sum=prefix[right+1]-prefix[left];
            res=Math.max(res,sum);
            if(right>r){
                l=left;
                r=right;
            }
        }
        int[]even=new int[n];
        l=0;
        r=-1;
        for(int i=0;i<n;i++){
            int k=0;
            if(i<=r){
                int mirror=l+r-i+1;
                k=Math.min(even[mirror],r-i+1);
            }
            while(i-k-1>=0 && i+k<n && nums[i-k-1]==nums[i+k]){
                k++;
            }
            even[i]=k;
            int left=i-k;
            int right=i+k-1;
            long sum=prefix[right+1]-prefix[left];
            res=Math.max(sum,res);
            if(right > r){
                l=left;
                r=right;
            }
        }
        return res;
    }
}
