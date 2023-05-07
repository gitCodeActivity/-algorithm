public class MinimalKSumSolution {

    public static int minimalKSum(int[] nums, int k){
        int[] extendedNums=new int[2* nums.length];
        int result=0;
        int counter=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]<2* nums.length){
              extendedNums[nums[i]]=1;
          }
        }

        for(int i=1;i<2* nums.length;i++){
            if(extendedNums[i]==0&&counter<k){
                counter++;
                result=result+i;
            }
        }

        return result;
    }
}
