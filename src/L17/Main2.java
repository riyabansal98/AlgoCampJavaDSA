package L17;

import java.sql.SQLOutput;

public class Main2 {

    String lang;

    Main2() {
        lang= "Java";
    }

    Main2(String language) {
        lang= language;

    }

    public void getName() {
        System.out.println("language is  " + lang);
    }



}
