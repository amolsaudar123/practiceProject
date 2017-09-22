package operations;

/*
Loop over the given array of strings to build a result string
        like this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
        append the string to the result. Return the empty string if no string appears a 2nd time.
        wordAppend(["a", "b", "a"]) → "a"
        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
        wordAppend(["a", "", "a"]) → "a"
*/

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] inputString = {"a", "b", "b", "a", "a"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String alpha : inputString) {
            if (!wordCountMap.containsKey(alpha)) {
                wordCountMap.put(alpha, 1);
            } else {
                int wordCounter = wordCountMap.get(alpha);
                wordCountMap.put(alpha, wordCounter + 1);
            }
        }
        for(Map.Entry map:wordCountMap.entrySet()){
            int count=(int)map.getValue();
            if(count%2==0){
              for(int index=0; index<count/2; index++){
                  System.out.println(map.getKey());
              }
            }

        }

    }
}
