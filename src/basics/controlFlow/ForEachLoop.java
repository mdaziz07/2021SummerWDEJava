package basics.controlFlow;

public class ForEachLoop {

    // For Each Loop - Used to iterate over data structure.

    public static void main(String[] args) {
        int[] myIntArray = {23,5875,22,89,899,90,23234, 3, 90, 456,129, 591, 344, 978, 903};

        String [] phraseArray = {"We", "are", "learning", "java"};

        for (int x : myIntArray){
            System.out.println(x);
        }

        for (String word: phraseArray){
            System.out.println(word);
        }
    }
}



