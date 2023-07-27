public class RemoveOccurenceOfX {

    public static void f(String str, int idx) {
        if(idx >= str.length()) return;

        if(str.charAt(idx) != 'x') 
            System.out.print(str.charAt(idx));
        
        f(str, idx+1);
    }

    public static void main(String[] args) {
        f("abcxxdexcsdeeddxx", 0);
    }
}
