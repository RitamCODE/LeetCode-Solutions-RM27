class Solution {

    // own logic
    public int minSteps(String s, String t) {
        // create 2 hash arrays from a-z
    // intialise them with zero 
    // then write the frequency of each letter in the array

    char alphabet[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; // 26 is the size
    // character array having all 26 alphabets
      
    int a1[]=new int[26];
    int a2[]=new int[26];

     // intialising both the arrays with 0 
    for(int i=0;i<26;i++)
    {
        a1[i]=0;
        a2[i]=0;
    }
    int initial= 'a';// the ascii value of a is 97
    for(int i=0;i<s.length();i++)
    {
        int ascii1= s.charAt(i);// ascii value of the character
        a1[ascii1-initial]++; // whatever value we get, we arte substracting from the intial so that we get the index of the number
      // for eg ascii value of c is 99 , so 99-97 =2 therefore a1[2] will get updated from 0 to 1
        int ascii2= t.charAt(i);
        a2[ascii2-initial]++;
    }

    for(int i=0;i<26;i++)
    {
        if(a1[i]==0 && a2[i]>0)// i.e. element mismatch
        {
            a2[i]=0;// 0 signifies unique element so we are not counting that element
        }
        if(a2[i]>a1[i])
        {
            a2[i]=a1[i];// equalising the frequencies so that we get to know how many more are required to form an anagram
        }
    }
    
    int c=0;// counts the total number of elements in the second word after ythe above operations

    for(int i=0;i<26;i++)
    {
       c=c+a2[i];
    }

    return s.length()-c;// returns the difference of elements which is basically the number of elements to be replaced
    }
}

// // similar questions :
// minimum number of steps to make 2 strings anagramn II
// determine if two strings are close
// tweet counts per frequency

