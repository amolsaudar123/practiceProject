package operations;

public class FaultyPrinter {

    public static void main(String[] args) {
        String input="aaaxbbbbyyhwawiwjjjwwm";
        String correctSequence="abcdefghijklm";
        int faultCounter=0;
        for(int index=0; index<input.length(); index++){
            String currentChar=input.substring(index, index+1);
            if (!correctSequence.contains(currentChar)){
                faultCounter=faultCounter+1;
            }
           }
       System.out.println(faultCounter+" / "+ input.length());
    }
}
