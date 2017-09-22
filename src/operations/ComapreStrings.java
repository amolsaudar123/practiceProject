package operations;

public class ComapreStrings {
    public static void main(String args[]){
        String firstInput="this is first input";
        String secondInput="operation on out put";

        String[] wordsForFirstInput=firstInput.split("\\s");
       String[] wordsForSecondInput=secondInput.split("\\s");
       for(int index=0; index<=secondInput.length(); index++){
           System.out.print(wordsForFirstInput[index]+" "+wordsForSecondInput[index]+" ");
       }
    }
}
