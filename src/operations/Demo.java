package operations;

import java.util.*;

public class Demo {
    public static void main(String args[]){
    String input = "Programming";
    Map<Character, Integer> countMap=new HashMap<>();
    String result="";
    int count=0;
        for(int firstIndex=0; firstIndex<=input.length()-1; firstIndex++)
    {

        for(int nextIndex=0; nextIndex<=input.length()-1; nextIndex++)
        {
            if(input.charAt(firstIndex)==input.charAt(nextIndex))
            {
                countMap.put(input.charAt(firstIndex), count+1);

                count=count+1;
            }
        }

        count=0;
    }
        System.out.println(countMap);
        System.out.println(result);
}
}