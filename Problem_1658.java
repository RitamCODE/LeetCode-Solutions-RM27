import java.util.*;
class Solution {
  // own solution
    public boolean closeStrings(String word1, String word2) {
        // in simple words two strings are close if
        // they have same length and consist of the same letters
        // and also we need to keep track of thier frequencies ..... cause the frequency list should be the same
      // i.e. word1 = "cabbba", word2 = "abbccc" are close since their character set (a,b,c) and the frequency of charcacter set(
      //1,2,3)are equal
      // but aaabbbbccddeeeeefffff and aaaaabbcccdddccccffff are not close because their frequency list is not equal ((3,4,2,2,5.5) and (5,2,3,3,4,4)) 
        // and if they are of diff length, they cannot be equal
      
      // to store the character set
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

      // to map each character with their respective frequencies
        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();

      // to map each frequency with their respective frequencies
        HashMap <Integer,Integer> map3=new HashMap<>();
        HashMap <Integer,Integer> map4=new HashMap<>();
      
      // if both the words are of diff length it will be false
        if(word1.length()!=word2.length())
        return false;
        
        // intitialising the sets with chars and maps with freqs
        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);// keeping a track of the frequnecies of the characters
            set2.add(word2.charAt(i));
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }

        // iterating the map and putting the frequency of its values in another map
        for (int i : map1.values()) 
            map3.put(i,map3.getOrDefault(i,0)+1);

        for (int i : map2.values()) 
            map4.put(i,map4.getOrDefault(i,0)+1);
        
        for( char i: set1 ){ 
            if(set2.contains(i))
            {
              // checking if the same the frequency exists in the other map or not
                if(map1.containsValue(map2.get(i))==false)
                return false;
                else
                  // if same frequency exists then are the present in the same frequency in the secondary maps
            if(map3.get(map2.get(i))!=map4.get(map2.get(i)))
                return false;
            }
            else 
            return false;
            }
        return true;
    }
}
// related questions are :
// buddy strings
// minimum swaps to make strings equal
