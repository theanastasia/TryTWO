package JavaCore.lesson4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] vegetables = {"tomato", "cucumber", "pumpkin", "potato", "tomato", "onion", "carrot", "pumpkin", "mushroom", "salad", "celery", "pepper"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : vegetables) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
