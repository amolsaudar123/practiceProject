package operations;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        String[] strings={"salt", "tea", "soda", "toast"};
        Map<String, String> operationMap=new HashMap<>();
        for(String word: strings){
            if(operationMap.get(word.substring(0,1))!=null){
                String appendString=operationMap.get(word.substring(0,1))+word;
                operationMap.put(word.substring(0,1), appendString);
            }
            else{
                operationMap.put(word.substring(0,1), word);
            }

        }
        System.out.println(operationMap);
    }
    }

