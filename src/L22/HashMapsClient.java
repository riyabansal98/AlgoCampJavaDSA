package L22;

public class HashMapsClient {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("Riya", 20);
        map.display();
        map.put("Akhil", 40);
        map.display();
        map.put("Sitanshu", 2);
        map.display();
        map.put("Rahul", 2);
        map.display();
        map.put("Rahul", 41);
        map.display();
        map.put("Nilima", 50);
        map.display();
        map.put("Raj", 50);
        map.display();
        map.put("Rohan", 20);
        map.display();

        System.out.println(map.containsKey("Raj"));
        System.out.println(map.keySet());

    }

}
