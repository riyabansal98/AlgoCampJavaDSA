package L10;

public class substrings {

    public static void main(String[] args) {

        substrings("code");
    }

    public static void substrings(String str) {

        for(int si = 0; si < str.length(); si++) {
            for(int ei = si + 1; ei <= str.length(); ei++) {
                System.out.println(str.substring(si , ei));
            }
        }
    }
}
