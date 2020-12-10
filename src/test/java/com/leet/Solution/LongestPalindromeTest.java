package com.leet.Solution;

        import org.junit.Test;

        import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        String s = "babad";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        assertEquals("bab",longestPalindrome.longestPalindrome(s));
         s = "cbbd";
        assertEquals("bb",longestPalindrome.longestPalindrome(s));

        s = "abcatacdy";
        assertEquals("catac",longestPalindrome.longestPalindrome(s));

        s = "a";
        assertEquals("a",longestPalindrome.longestPalindrome(s));

        s = "bb";
        assertEquals("bb",longestPalindrome.longestPalindrome(s));

        s = "ac";
        assertEquals("a",longestPalindrome.longestPalindrome(s));

        s = "cabb";
        assertEquals("bb",longestPalindrome.longestPalindrome(s));
        s =
                "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
        assertEquals("qahaq",longestPalindrome.longestPalindrome(s));
    }
}