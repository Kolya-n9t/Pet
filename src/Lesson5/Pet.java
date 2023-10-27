package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class Pet  {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap();
        hashMap.put("Барсик", new Dog());
        hashMap.put("Bаська", new Cat());
        hashMap.put("Кеша", new Parrot());
        hashMap.put("Рыжий", new Cat());
        hashMap.put("Бобик", new Dog());

        System.out.println(hashMap);
    }
}
