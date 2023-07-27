public class RemoveOccurenceOfXApproach2 {
    public static void f(String str, int idx, String output) {
        if(idx >= str.length()) {
            System.out.println(output);
            return;
        }
        if(str.charAt(idx) != 'x') {
            f(str, idx+1, output + str.charAt(idx));
        } else {
            f(str, idx+1, output );
        }
    }
    public static void main(String[] args) {
        f("abcxdx", 0, "");
    }
}
