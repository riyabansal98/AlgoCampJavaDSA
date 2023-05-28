package L2;

public class IfElse {

    public static void main(String[] args) {

//        boolean primeSubs = false;
//
//        //if else
//        if(primeSubs == true) {
//            System.out.println("Welcome to the prime subscription");
//        }else{
//            System.out.println("Please become a member of amazon prime now. ");
//        }

        int num = -10;

        //if
        if(num < 0) {
            System.out.println("It is a negative number");
        }

        System.out.println("Now you are outside the if block");

        //if else if... else

        //0 -> no subs
        //1 -> super
        //2 -> premium

        //'N' -> no subs
        //'S' -> super
        //'P' -> premium


        int hotstarsubs = 4;

        if(hotstarsubs == 0){
            System.out.println("Now is a good time to get a hotstar subscription");
        }else if(hotstarsubs == 1) {
            System.out.println("Why dont you upgrade to premium subs");
        }else if(hotstarsubs == 2) {
            System.out.println("Welcome to hotstar premium");
        }else{
            System.out.println("This looks like an invalid input");
        }


        //nested if else

        String movie = "line of duty";

        boolean primeSubs = true;
        boolean acorn = false;
        boolean amc = true;

        if(primeSubs) {

            if(acorn || amc) {
                System.out.println("Yes, you can watch it. Enjoy " + movie);
            }else{
                System.out.println("We recommend buying either acorn or amc subs to enjoy this movie");
            }
        }else{
            System.out.println("Cannot watch the movie.Why don't you take prime subs");
        }



    }
}
