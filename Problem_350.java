class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      // hashmaps to store each number and thier frequencies of respective arrays
        HashMap <Integer,Integer> map1=new HashMap<>(); 
        HashMap <Integer,Integer> map2=new HashMap<>();
        
        for(int i=0;i<nums1.length;i++)
         {
             map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1); // this means that if there is no value is the hashmap put 1 and if there is already a existing 
          // value add 1 to it;
         }
         for(int i=0;i<nums2.length;i++)
         {
             map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
         }
         
        ArrayList<Integer> list= new ArrayList<>();//list to store the final list

        System.out.println(map1);
        System.out.println(map2);

        for (int k : map1.keySet()) // iterating the map using the variable k for the keys
            {
                if(map2.containsKey(k))
                {
                    if(map1.get(k)>map2.get(k)) // the logic is that we will iterate till whichever is the minimum frequency of values between the 2 
                                                // since the minimum frequency is the common frequency for both
                    {
                        for(int i=0;i<map2.get(k);i++)
                        list.add(k);
                    }
                    else
                    {
                        for(int i=0;i<map1.get(k);i++)
                        list.add(k);
                    }
                }
            }//end of map loop

        int a[] = new int[list.size()];

         // putting the list in the array as per the question
        for(int i=0;i<list.size();i++)
        {
            a[i]=list.get(i);
        }

        return a;
        }
}
