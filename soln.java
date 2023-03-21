class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(count==0 && nums[i]==0){
                count++;
            } else if(count!=0 && nums[i]==0){
                count++;
            } else if(count!= 0 && nums[i]!=0){
                count = (count*(count+1))/2;
                ans+= count;
                count=0;
            }
        }
        if(count!=0){
            count = (count*(count+1))/2;
            ans+= count;
        }
        return ans;
    }
}