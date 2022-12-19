import java.io.*;
import java.util.*;
class Solution {
    public boolean prime(int n)
    {
        if(n==1)
        return false;
        if(n==0)
        return false;
        for(int i=2;i<=(int)Math.sqrt((double)n);i++)
        {
            // we can also give the condition part as i*i<=n
            // which gives the same meaning as above
            if(n%i==0)
            return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count_numbers=0; // counts the number of valid numbers
        for(int i=left;i<=right;i++)
        {
            // converitng to binary using the Integer.toBinaryString(num)
            String s=Integer.toBinaryString(i);
            int count_1s=0;  //conts the number of set bits
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')
                count_1s++;
            }
            if(prime(count_1s))
            {
                count_numbers++;
            }
           
        }
         return count_numbers;
    }
}
