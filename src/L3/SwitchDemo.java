package L3;

import java.sql.SQLOutput;

public class SwitchDemo {

    public static void main(String[] args) {

//        int number = 29;
//
//        String size;
//
//        switch(number) {
//
//            case 29:
//                size = "Small";
//                break;
//            case 42:
//                size = "Medium";
//                break;
//            case 48:
//                size = "Large";
//                break;
//            case 50:
//                size = "Extra Large";
//                break;
//            default:
//                size = "Unknown";
//                break;
//        }
//
//        System.out.println("size : " + size);


        int expr = 1;

        switch(expr) {
            case 2:
                System.out.println("Case 2");
            case 1:
                System.out.println("Case 1");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default");
        }
    }
}
