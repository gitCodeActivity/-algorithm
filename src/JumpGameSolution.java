public class JumpGameSolution {

    public  boolean canJump(int[] nums){
        int maxJump=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(maxJump<=i){
                    return false;
                }
                maxJump=0;
            }else{
                maxJump= Math.max(maxJump, nums[i] + i);
            }
        }
        return true;
    }
}
