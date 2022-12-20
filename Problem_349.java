import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Set<String> set1 = new HashSet<>();
        //Set<String> set2 = new HashSet<>();
        ArrayList<Integer> list1= new ArrayList<>(); // list to store all the unique elements in array 1
		ArrayList<Integer> list2= new ArrayList<>(); // list to store all the unique elements in array 2
        ArrayList<Integer> list3= new ArrayList<>(); // to store the final list

         for(int i=0;i<nums1.length;i++)
         {
             if(list1.contains(nums1[i])==false)
             list1.add(nums1[i]);
         }
         for(int i=0;i<nums2.length;i++)
         {
             if(list2.contains(nums2[i])==false)
             list2.add(nums2[i]);
         }
        
        for(int i=0;i<list1.size();i++)
        {
            if(list2.contains(list1.get(i))) // to find the common elements in both the lists
            {
                list3.add(list1.get(i));
            }
        }

        int a[]= new int[list3.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=list3.get(i);
        }
        return a;
    }
    // similar questions are intersection of 2 arrays II
    // intersection of 3 sorted arrays
    // difference of 2 sorted arrays
    }
