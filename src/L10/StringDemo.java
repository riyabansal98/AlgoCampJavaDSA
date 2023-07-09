package L10;

public class StringDemo {


    public static void main(String[] args) {

       String first = "Java";
       String second = "Python";
       String third = "Java";

       //print
        System.out.println(first);
        System.out.println(third);

        //String stringName = new String("string_value");
        String str = new String("Algocamp");

        System.out.println(str);

        //String operations
        String greet = "Hello World";
        System.out.println("String: " + greet);

        System.out.println(greet.length());

        //Join two strings
        String joinedString = first.concat(second);
        System.out.println(joinedString);

        //compare two strings

        boolean res1 = first.equals(second);
        System.out.println(res1);

        boolean res2 = first.equals(third);
        System.out.println(res2);

        String name1 = new String("Program1");
        String name2 = new String("Program1");

        boolean result1 = (name1 == name2);
        boolean result2 = name1.equals(name2);

        String n1 = new String("Program2");
        String n2 = n1;

        boolean r1 = (n1 == n2);
        boolean r2 = n1.equals(n2);

        System.out.println(r1 + " " + r2);

        //this is a "very" important project

        String example = "this is a \"very\" important project";

        //Immutability
        //In java strings are immutable. This means, once we create a string, we cannot
        //change the string.

        String example1 = "hello";
        example1 = example1.concat(" World");
        System.out.println(example1);

        String newStr = "hello";

        char ch = newStr.charAt(0);
        System.out.println(ch);
        System.out.println(newStr.charAt(1));
        System.out.println(newStr.charAt(newStr.length() - 1));

        //Substring
        //Range: 0 -> length
        System.out.println(newStr.substring(1, 4));
        System.out.println(newStr.substring(0, 5));
        //System.out.println(newStr.substring(4, 1));

        newStr.substring(1);

        System.out.println(newStr.lastIndexOf('l'));
        System.out.println(newStr.startsWith("He"));
        System.out.println(newStr.startsWith("hel"));

        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println((s1 == s2) + ", " + s1.equals(s2));
        System.out.println((s1 == s3) + ", " + s1.equals(s3));
        System.out.println((s1 == s4) + ", " + s1.equals(s4));
    }
}
