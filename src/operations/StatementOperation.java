package operations;

import java.util.*;

public class StatementOperation {
    public String operationOnStatement(String input) {
        Integer wordCount;
        String output="";
        Map<String, Integer> wordOccurance=new HashMap<String, Integer>();
            List<String> newList=new ArrayList<>();
        String[] words = input.split("\\s");
        for (String word : words) {
            wordCount = wordOccurance.get(word.length());

            if (wordCount == null) {
                wordCount = 0;
            }
            wordOccurance.put(word, wordCount+1);
             }
        for (Map.Entry map : wordOccurance.entrySet()) {
            System.out.println(map.getKey() + " letter words are " + map.getValue());
        }
        System.out.println(wordOccurance);
        List<Map.Entry<String, Integer>> finalCalculation=new ArrayList<Map.Entry<String, Integer>>(wordOccurance.entrySet());
        System.out.println(finalCalculation);
        Collections.sort( finalCalculation, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:finalCalculation){
            newList.add(entry.getKey());
            output=output+" "+entry.getKey();

        }
        return  output;
    }

}
