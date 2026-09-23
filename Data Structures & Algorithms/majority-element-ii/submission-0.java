class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(cnt1==0 && nums[i]!=ele2)
            {
                cnt1=1;
                ele1=nums[i];
            }

            else if(cnt2==0 && nums[i]!=ele1)
            {
                cnt2=1;
                ele2=nums[i];
            }

            else if(ele1==nums[i])
            {
                cnt1++;
            }
            else if(ele2==nums[i])
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        int c1 = 0, c2 = 0;

for (int num : nums) {
    if (num == ele1) c1++;
    else if (num == ele2) c2++;
}

List<Integer> ans = new ArrayList<>();

if (c1 > nums.length / 3) ans.add(ele1);
if (c2 > nums.length / 3) ans.add(ele2);

return ans;
    }
}