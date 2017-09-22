import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer wordCount;
       String input="This is String which is String";
        Map<Integer, Integer> paragraphMap = new HashMap<Integer, Integer>();
        List<String> resultString = new ArrayList<String>();
       String words[]=input.split("\\s");
       for(String word:words){
                wordCount=word.length();
                if(wordCount==null){
                    wordCount=0;
                }
           paragraphMap.put(word.length(), wordCount + 1);
       }
        for (Map.Entry map : paragraphMap.entrySet()) {

            resultString.add(map.getKey() + " letter words are " + map.getValue());
        }


                System.out.println(resultString);

    }
}
