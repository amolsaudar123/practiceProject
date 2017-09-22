package operations;

import java.util.*;

public class Practice {

    static class WordDetails implements Comparable<WordDetails>{
        String word;
        Integer count;

        public WordDetails(String word) {
            this.word = word;
            count =1;
        }

        public void increment(){
            count++;
        }

        public Integer getCount() {
            return count;
        }

        @Override
        public int compareTo(WordDetails other) {
            return getCount().compareTo(other.getCount());
        }

        @Override
        public String toString() {
            return word;
        }
    }

    public static void main(String[] args) {
        String shortParagraph = "this is string which is string is this string";
        String[] words = shortParagraph.split("\\s");
        final Map<String,WordDetails> detailsMap = new HashMap<>();
        for (String word : words) {
            WordDetails details = detailsMap.get(word);

                if (details == null) {
                    details = new WordDetails(word);
                    detailsMap.put(word,details);
                }else {
                    details.increment();
            }
        }

        List<WordDetails> temp= new ArrayList<>();
        temp.addAll(detailsMap.values());
        Collections.sort(temp, new Comparator<WordDetails>() {
            @Override
            public int compare(WordDetails one, WordDetails another) {
                return another.getCount().compareTo(one.getCount());
            }
        });

        System.out.println(temp);
    }


    /*public static void main(String args[]){
        Integer wordCount;

        String shortParagraph = "this is string which is string is this string";
        Map<Integer, Integer> wordCountMap = new HashMap<Integer, Integer>();
        Map<String, Integer> wordOccurance=new HashMap<String, Integer>();

        String[] words = shortParagraph.split("\\s");
        for (String word : words) {
            wordCount = wordCountMap.get(word.length());

            if (wordCount == null) {
                wordCount = 0;
            }
            wordOccurance.put(word, wordCount+1);
            wordCountMap.put(word.length(), wordCount + 1);



        }
        for (Map.Entry map : wordCountMap.entrySet()) {
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
        System.out.println(finalCalculation);
    }*/

}
