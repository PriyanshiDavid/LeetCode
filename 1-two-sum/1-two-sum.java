class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int add[]=new int[2];
        for(int x=0;x<nums.length;x++)
        {
            for(int y=x+1;y<nums.length;y++)
            {
                if(nums[y]+nums[x]==target)
                {
                    add[0]=x;
                    add[1]=y;
                    break;
                }
            }
            
        }
        return add;
        
    }
}