package L22;

import java.util.HashMap;

public class Hashmaps {

    public static void main(String[] args) {

        HashMap<String, Integer> languages = new HashMap<>();

        //add elements to hashmap
        languages.put("Java", 20);
        languages.put("C++", 30);
        languages.put("Python", 2);
        languages.put("Java", 10);
        //print
        System.out.println(languages);

        //access
        System.out.println(languages.get("Java"));

        System.out.println(languages.keySet());
        System.out.println(languages.values());

        System.out.println(languages.entrySet());

        //replace
        languages.replace("C++", 30);

        //remove
        languages.remove("Java");
        System.out.println(languages);

        //clear()
        //clone()
        //containsKey()
        //size()
        languages.isEmpty();
    }
}
