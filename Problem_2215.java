class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();// contains the elements of nums1
        Set<Integer> set2 = new HashSet<>();// contains the elements of nums2
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }

        List<Integer> list1= new ArrayList<>();
		List<Integer> list2= new ArrayList<>();

        List<List<Integer>> list= new ArrayList<>();

        // finding the list of all distinct integers in nums1 which are not present in nums2

        for(int i=0;i<nums1.length;i++)
        {
            if(set2.contains(nums1[i])== false)
            {if(list1.contains(nums1[i])==false)
                list1.add(nums1[i]);}
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i])== false)
            {if(list2.contains(nums2[i])==false)
            list2.add(nums2[i]);}
        }

        list.add(list1);
        list.add(list2);

        return list;
    }
}
