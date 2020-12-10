package com.leet.Solution.AugChallenge;

import java.util.HashMap;
import java.util.HashSet;

public class WordDictionary {
    private final HashMap<Integer,HashSet<String>> wordLenMap= new HashMap<>();

    /** Initialize your data structure here. */
    public WordDictionary() {

    }

    /** Adds a word into the data structure. */
    public void addWord(final String word) {
        if(this.wordLenMap.containsKey(word.length())){
            this.wordLenMap.get(word.length()).add(word);
        }else {
            final HashSet<String> dict = new HashSet<>();
            dict.add(word);
            this.wordLenMap.put(word.length(), dict);
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(final String word) {
        if(!this.wordLenMap.containsKey(word.length())){
            return false;
        }
        if(this.wordLenMap.get(word.length()).contains(word)){
            return true;
        }
        final char[] chars = word.toCharArray();
        return this.wordLenMap.get(word.length()).stream().anyMatch(tempWord -> {
            if(tempWord.length() == word.length()){
                for (int pos=0;pos < chars.length;pos++) {
                    if('.' == chars[pos] || tempWord.charAt(pos)==chars[pos]){
                        continue;
                    }
                    return false;
                }
                return true;
            }
            return false;
        });
    }
}