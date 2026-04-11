package Strings.LeetCode;

public class String1 {
    public static void main(String[] args) {
        String str = "aryan";
        String reverse = "";

        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
    
        System.out.println("Reverse String is: "+reverse);  
    }
}
