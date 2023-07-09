package L10;

public class isPalindrome {

    public static void main(String[] args) {

        String str = "nitin";
        String str1 = "algoca";
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {

            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
