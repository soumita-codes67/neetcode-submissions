class Solution {
    public boolean hasDuplicate(int[] nums) {
        int a=nums.length;
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
}