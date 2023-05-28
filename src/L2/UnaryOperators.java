package L2;

public class UnaryOperators {

    public static void main(String[] args) {

        //Unary operators are used with one operand. For eg: ++

//        int num = 5;
//        System.out.println(++num);

         int a = 12,  b = 12;

         int res1, res2;

        System.out.println("Value of a is " + a);

        //increment
        res1 = ++a;
        System.out.println(res1);

        //decrement
        res2 = --b;
        System.out.println(res2);

        // + : unary plus:
        // !

        int  var1 = 5, var2 = 5;

        // If I use ++ operator as a postfix like: val++,
        // the original value of val is returned first and val is incremented by 1.

        //5 is displayed.
        //then, the var1 is increased to 6.
        System.out.println(var1++);

        //var2 is increased to 6.
        //then var2 is displayed.
        System.out.println(++var2);

    }
}


