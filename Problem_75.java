class Solution {
    public void sortColors(int[] nums) {
        // maps which maps each with their frequencies
        // we can also do this using normal hashing by taking an auxiliary array without using collections framework
        HashMap <Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
            map.put(0,map.getOrDefault(0,0)+1);
            else
            if(nums[i]==1)
            map.put(1,map.getOrDefault(1,0)+1);
            else
            map.put(2,map.getOrDefault(2,0)+1);
        }
        int k=0;
        if(map.get(0)!=null)
        {for (int i = 0; i < map.get(0); i++) {
            nums[k]=0;
            k++;
        }}
        if(map.get(1)!=null)
        {for (int i = 0; i < map.get(1); i++) {
            nums[k]=1;
            k++;
        }}
        if(map.get(2)!=null)
        {for (int i = 0; i < map.get(2); i++) {
            nums[k]=2;
            k++;
        }}
    }
}
