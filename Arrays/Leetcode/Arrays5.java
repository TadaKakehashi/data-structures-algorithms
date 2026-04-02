package Arrays.Leetcode;
import java.util.*;

public class Arrays5 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c)==0){
                return false;
            }
            map.put(c, map.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Arrays5 obj = new Arrays5();

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = obj.canConstruct(ransomNote, magazine);

        System.out.println("Can construct: " + result);
    }
}

