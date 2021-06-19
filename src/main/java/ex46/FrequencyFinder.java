package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.*;


public class FrequencyFinder {
    private Map<String, Integer> wordMap = new HashMap<>();

    //make the map
    public void makeMap(ArrayList<String> words){
        for(int i=0; i<words.size(); i++){
            String targetWord = words.get(i);
            //check to see if the word is already in unique words list
            boolean contains = wordMap.containsKey(targetWord);
            if(!contains){
                wordMap.put(targetWord,1);
            }else{
                //increase frequency of existing word
                wordMap.put(targetWord, wordMap.get(targetWord)+1);
            }
        }
    }

    //Sort most used words to least used
    //code adapted from https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values
    public Map<String,Integer> sortbyValue(Map<String,Integer> wordMap){
        List<Map.Entry<String,Integer>> list = new ArrayList<>(wordMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //create a new sorted map to replace the unsorted one.
        Map<String, Integer> sortedWordMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedWordMap.put(entry.getKey(),entry.getValue());
        }
        return sortedWordMap;
    }

    //Print the histogram from the sorted map
    public void printHistogram(Map<String,Integer> sortedWordMap){
        for(String key: sortedWordMap.keySet()){
            System.out.printf("%-15s",key);
            for(int stars = 0; stars <sortedWordMap.get(key);stars++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }

    public Map<String, Integer> getWordMap() {
        return wordMap;
    }
}
