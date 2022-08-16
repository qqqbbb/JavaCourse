package Lesson_2dot6;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ivan", "123-12-12");
        phoneBook.put("Dmitriy", "345-34-34");
//        System.out.println(phoneBook.get("Dmitriy"));
        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }
        for (String name: phoneBook.keySet()) {
            System.out.println("В мапе присутствует контакт по имени " + name);
        }
        for (String phoneNumber: phoneBook.values()) {
            System.out.println("В мапе присутствует номер телефона  " + phoneNumber);
        }
//        phoneBook.computeIfAbsent("Ivan");

    }
}
