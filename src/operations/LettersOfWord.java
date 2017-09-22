package operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LettersOfWord {
    public static void main(String[] args) {
        String input="this is string which is string is this string aa wesd";
        String inputArray[]=input.split("\\s");
        Integer wordCount;
        List<String> result=new ArrayList<>();
        Map<Integer, Integer> countMap=new HashMap<>();

        for (String word:inputArray){
            wordCount=countMap.get(word.length());

            if(wordCount==null){
                wordCount=0;
            }

            countMap.put(word.length(), wordCount+1);

        }
        System.out.println(countMap);

        for (Map.Entry map : countMap.entrySet()) {

            result.add(map.getKey() + " letter words are " + map.getValue());
        }
        System.out.println(result);
    }

}
