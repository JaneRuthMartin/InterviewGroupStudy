package Java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q4_RemoveDuplicate {
    public static void main(String[] args) {
        //remove duplicate
        //1. way
        String [] sentence = {"A", "B", "A", "B", "C"};
        Set<String> remDup = new TreeSet<String>(Arrays.asList(sentence));
        System.out.println(remDup);

        //2. way
        String word = "AAABBBCCCDDDDDDEEEEEEH";
        String[] arr = word.split("");
        Set<String> remDup2 = new TreeSet<String>(Arrays.asList(arr));
        System.out.println(remDup2);

        //3. way
        String word1 = "AAAABBCCCDDDDDDEEEEEEFFFFGGGKKKLLL";
        String result ="";
        for (int i = 0; i < word1.length() ; i++) {
            if (result.contains(word1.substring(i,i+1))) {
                result += word1.substring(i,i+1);
            }
            System.out.println(result);
        }




    }
}
