package com.leet.Solution.AugChallenge;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WordDictionaryTest {

    @Test
    public void search() {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        assertThat(obj.search("pad")).isFalse();
        assertThat(obj.search("bad")).isTrue();
        assertThat(obj.search(".ad")).isTrue();
        assertThat(obj.search("b..")).isTrue();
        assertThat(obj.search("....")).isFalse();
    }
}