public class subsequences {

    public static void f(String str, int idx, String output) {
        // base case
        if(idx == str.length()) {
            System.out.println("[" + output + "]");
            return;
        }
        f(str, idx+1, output+str.charAt(idx));
        f(str, idx+1, output);
    }

    public static void main(String[] args) {
        f("abcd", 0, "");
    }
}
