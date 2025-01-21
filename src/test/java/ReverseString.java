public class ReverseString {
    //method to reverse a string

    public static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);

        }
        return reverseStr;
    }
}

